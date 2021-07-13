package auto.example.Automobile.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.Example;
import org.springframework.validation.annotation.Validated;

import auto.example.Automobile.Model.Automobile;
import auto.example.Automobile.Model.AutomobileRepository;


@RestController
@RequestMapping(value = "find/a1/")
public class AutoA1Controller extends AutoController<Automobile,AutomobileRepository> {

    @GetMapping(path = "/auto-marca")
        public List<Automobile> getAllAutobyMarca(
            @RequestParam(value = "marca", required = false) String data){
                Automobile search = new Automobile();
                search.setMarca(data); 
                Example<Automobile> example = Example.of(search);
                return repository.findAll(example);
            }


        @Override
        public Automobile createAuto(@RequestBody @Validated Automobile newItem)
        {
            return repository.save(newItem);
        }

        @Override
        public Automobile getAuto(@PathVariable(value = "id") Long autoId){
            Optional<Automobile> auto = repository.findById(autoId);
            if(!auto.isPresent()){
                return null;
            }
            return auto.get();
        }

        @Override
        public Automobile updateAuto(@PathVariable(value = "id") Long autoId, @RequestBody @Validated Automobile newItem){
            return repository.save(newItem);
        }
    }