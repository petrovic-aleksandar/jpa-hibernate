package me.aco.jpa_hibernate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import me.aco.jpa_hibernate.entity.Audi;
import me.aco.jpa_hibernate.entity.Person;
import me.aco.jpa_hibernate.entity.Porsche;
import me.aco.jpa_hibernate.repository.AudiRepository;
import me.aco.jpa_hibernate.repository.PorscheRepository;

@Component
public class TestRunner implements CommandLineRunner {

    private final AudiRepository audiRepository;
    private final PorscheRepository porscheRepository;

    public TestRunner(AudiRepository audiRepository, PorscheRepository porscheRepository) {
        this.audiRepository = audiRepository;
        this.porscheRepository = porscheRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Create a new Audi
        Audi audi = new Audi();
        audi.setModel("A4");
        audi.setYear(2024);

        // Persist to database
        Audi savedAudi = audiRepository.save(audi);

        Porsche porsche = new Porsche();
        porsche.setpModel("911");

        Porsche savedPorsche = porscheRepository.save(porsche);

        Person person = new Person();
        person.setName("John Doe");
        person.setCar(savedPorsche);
        
        System.out.println("Saved Audi with ID: " + savedAudi.getId());
        System.out.println("Model: " + savedAudi.getModel());
        System.out.println("Year: " + savedAudi.getYear());
    }
}
