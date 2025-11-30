package me.aco.jpa_hibernate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import me.aco.jpa_hibernate.entity.Audi;
import me.aco.jpa_hibernate.entity.Person;
import me.aco.jpa_hibernate.repository.AudiRepository;

@Component
public class TestRunner implements CommandLineRunner {

    private final AudiRepository audiRepository;

    public TestRunner(AudiRepository audiRepository) {
        this.audiRepository = audiRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Create a new Audi
        Audi audi = new Audi();
        audi.setModel("A4");
        audi.setYear(2024);

        // Persist to database
        Audi savedAudi = audiRepository.save(audi);

        Person person = new Person();
        person.setName("John Doe");
        person.setCar(savedAudi);
        
        System.out.println("Saved Audi with ID: " + savedAudi.getId());
        System.out.println("Model: " + savedAudi.getModel());
        System.out.println("Year: " + savedAudi.getYear());
    }
}
