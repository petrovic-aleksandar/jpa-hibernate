package me.aco.jpa_hibernate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import me.aco.jpa_hibernate.entity.Audi;
import me.aco.jpa_hibernate.entity.Car;
import me.aco.jpa_hibernate.entity.Person;
import me.aco.jpa_hibernate.entity.Porsche;
import me.aco.jpa_hibernate.entity2.A;
import me.aco.jpa_hibernate.repository.ARepository;
import me.aco.jpa_hibernate.repository.AudiRepository;
import me.aco.jpa_hibernate.repository.CarRepository;
import me.aco.jpa_hibernate.repository.PersonRepository;
import me.aco.jpa_hibernate.repository.PorscheRepository;

@Component
public class TestRunner implements CommandLineRunner {

    private final AudiRepository audiRepository;
    private final PorscheRepository porscheRepository;
    private final CarRepository carRepository;
    private final PersonRepository personRepository;
    private final ARepository aRepository;

    public TestRunner(AudiRepository audiRepository, PorscheRepository porscheRepository, CarRepository carRepository, PersonRepository personRepository, ARepository aRepository) {
        this.audiRepository = audiRepository;
        this.porscheRepository = porscheRepository;
        this.carRepository = carRepository;
        this.personRepository = personRepository;
        this.aRepository = aRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Create a new Audi
        Audi audi = new Audi();
        audi.setModel("A4");
        audi.setYear(2024);
        audi.setManufacturer("Audi");

        // Persist to database
        Audi savedAudi = audiRepository.save(audi);

        Porsche porsche = new Porsche();
        porsche.setpModel("911");

        Porsche savedPorsche = porscheRepository.save(porsche);

        Car car = savedAudi; // Polymorphic association
        car.setManufacturer("German manufacturer");
        Car savedCar = carRepository.save(car);

        Person person = new Person();
        person.setName("John Doe");
        person.setCar(savedCar);
        Person savedPerson = personRepository.save(person);

        A aEntity = new A();
        aEntity.list = new java.util.ArrayList<>();
        aEntity.list.add("Item 1");
        aEntity.list.add("Item 2");
        aEntity.set = new java.util.HashSet<>();
        aEntity.set.add("Set Item 1");
        aEntity.set.add("Set Item 2");
        A savedAEntity = aRepository.save(aEntity);
        
        System.out.println("Saved Audi with ID: " + savedAudi.getId());
        System.out.println("Model: " + savedAudi.getModel());
        System.out.println("Year: " + savedAudi.getYear());
    }
}
