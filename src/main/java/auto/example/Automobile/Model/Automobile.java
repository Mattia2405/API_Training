package auto.example.Automobile.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "automobile")
public class Automobile {
    @Id
    @GeneratedValue
    protected Long id;

    @Column(name = "customer")       //binding con database
    protected String customer;

    @Column(name = "model")
    protected String model;
    
    @Column(name = "color")
    protected String color;

    


    public Automobile(){
        super();
    }

    public Automobile(Long id, String customer, String model, String color){
        super();
        this.id = id;
        this.customer = customer;
        this.model = model;
        this.color = color;
    }

    public Automobile(Long id, String customer){
        super();
        this.id = id;
        this.customer = customer;
    }

    public void setId(Long id){
        this.id = id;
    }

    public Long getId(){
        return this.id;
    } 

    public void setCustomer(String customer){
        this.customer = customer;
    }

    public String getCustomer(){
        return this.customer;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return this.model;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

    @Override
    public String toString(){
        return String.format("Automobile[id=%s, customer=%s, model=%s, color=%s]", id, customer, model, color);
    }

   
}