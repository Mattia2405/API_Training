package auto.example.Automobile.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public abstract class AutoController <I,R extends JpaRepository> {
    
    @Autowired
    protected R repository;
    
    @GetMapping(value = "/auto")
    public List<I> getAllCars(){
      
        return repository.findAll();
    }

    @PostMapping(path = "/auto")
    public I createAuto(@RequestBody @Validated I newItem){
        return null;
    }

    @GetMapping(path = "/auto/{id}")
    public I getAuto(@PathVariable(value = "id") Long autoId){
        return null;
    }

    @GetMapping(path = "auto/{marca}")
    public List<I> getAllAutoByName(@PathVariable("marca") String marca)
    {
        return null;
    }

    @PutMapping(path = "/auto/{id}")
    public I updateAuto(@PathVariable(value = "id") Long autoId, @RequestBody @Validated I newItem){
        return null;
    }

    @DeleteMapping(value = "/auto/{id}")
    public void deleteAuto(@PathVariable(value = "id") Long autoId){
        repository.deleteById(autoId);
    }
}