package auto.example.Automobile.Controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import auto.example.Automobile.Model.Automobile;
import auto.example.Automobile.connector.AutomobileRepository;
@RestController
@RequestMapping(value = "/api/v1")
public class AutoController {
    
    @Autowired
    protected AutomobileRepository repository;
    
    @GetMapping(path = "/auto")
    public List<Automobile> getAllCars(@RequestParam(value = "customer" /*nome_colonna_tabella*/, required = false) String customer, @RequestParam(value = "color", required = false) String color){
            if ((customer != null && !customer.isEmpty()) || (color!= null && !color.isEmpty())){
                Automobile search = new Automobile();
                search.setCustomer(customer); 
                search.setColor(color);
                Example<Automobile> example = Example.of(search);
                return repository.findAll(example);
            } else {
                return repository.findAll();
            }
        }

    

    @PostMapping(path = "/auto")
    public Automobile createAuto(@RequestBody @Validated Automobile newItem)
    {
        return repository.save(newItem);
    }

    @GetMapping(value  = "/auto/{id}")
    public Automobile getAuto(@PathVariable(value = "id") Long autoId){
        Optional<Automobile> auto = repository.findById(autoId);
        if(!auto.isPresent()){
            return null;
        }
        return auto.get();
    }

    @PutMapping(value = "/auto/{id}")
    public Automobile updateAuto(@PathVariable(value = "id") Long autoId, @RequestBody @Validated Automobile newItem){
        return repository.save(newItem);
    }

    @DeleteMapping(value = "/auto/{id}")
    public void deleteAuto(@PathVariable(value = "id") Long autoId){
        repository.deleteById(autoId);
    }
}