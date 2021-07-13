package auto.example.Automobile.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Automobile")
public class Automobile {
    @Id
    @GeneratedValue
    protected Long id;
    @Column(name = "marca")
    protected String marca;
    @Column(name = "modello")
    protected String modello;
    @Column(name = "colore")
    protected String colore;

    


    public Automobile(){
        super();
    }

    public Automobile(Long id, String marca, String modello, String colore){
        super();
        this.id = id;
        this.marca = marca;
        this.modello = modello;
        this.colore = colore;
    }

    public Automobile(Long id, String marca){
        super();
        this.id = id;
        this.marca = marca;
    }

    public void setId(Long id){
        this.id = id;
    }

    public Long getId(){
        return this.id;
    } 

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setModello(String modello){
        this.modello = modello;
    }

    public String getModello(){
        return this.modello;
    }

    public void setColore(String colore){
        this.colore = colore;
    }

    public String getColore(){
        return this.colore;
    }

    @Override
    public String toString(){
        return String.format("Automobile[id=%s, marca=%s, modello=%s, colore=%s]", id, marca, modello, colore);
    }
}