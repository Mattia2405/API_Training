package auto.example.Automobile.Model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;




@Entity
@Table(name = "fuel")
public class Fuel implements Serializable{
    
    @Id
    @GeneratedValue
    private long id;

    @Column(name = "typefuel")
    private String typeFuel;

    @OneToMany(mappedBy = "fuel")
    private List<Automobile> automobili;

    public Fuel(){}

    public Fuel(long idFuel, String typeFuel){
        this.id = idFuel;
        this.typeFuel = typeFuel;
    }

    public Fuel(String typeFuel){
        this.typeFuel = typeFuel;
    }

    //get e set

    public void setId(long idFuel){
        this.id= idFuel;
    }

    public Long getId(){
        return this.id;
    }

    public void setTypeFuel(String typeFuel){
        this.typeFuel = typeFuel;
    }

    public String getTypeFuel(){
        return this.typeFuel;
    }
}