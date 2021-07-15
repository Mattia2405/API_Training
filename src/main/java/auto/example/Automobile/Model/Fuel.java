package auto.example.Automobile.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fuel")
public class Fuel {
    
    @Id
    @GeneratedValue
    private long id;

    @Column(name = "typefuel")
    private String typeFuel;


    public Fuel(){
    }

    public Fuel(long id, String typeFuel){
        this.id = id;
        this.typeFuel = typeFuel;
    }

    public Fuel(String typeFuel){
        this.typeFuel = typeFuel;
    }

    //get e set

    public void setId(long id){
        this.id = id;
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
