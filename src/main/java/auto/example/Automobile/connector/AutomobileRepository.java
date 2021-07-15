package auto.example.Automobile.connector;

import org.springframework.data.jpa.repository.JpaRepository;

import auto.example.Automobile.Model.Automobile;

public interface AutomobileRepository extends JpaRepository<Automobile, Long>{ //fa comunicare java con il database
    
}
