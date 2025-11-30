package me.aco.jpa_hibernate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import me.aco.jpa_hibernate.entity.Audi;
import me.aco.jpa_hibernate.entity.Car;
import me.aco.jpa_hibernate.entity.Person;
import me.aco.jpa_hibernate.entity.Porsche;
import me.aco.jpa_hibernate.repository.AudiRepository;
import me.aco.jpa_hibernate.repository.CarRepository;
import me.aco.jpa_hibernate.repository.PorscheRepository;

@Component
public class TestRunner implements CommandLineRunner {

    private final AudiRepository audiRepository;
    private final PorscheRepository porscheRepository;
    private final CarRepository carRepository;

    public TestRunner(AudiRepository audiRepository, PorscheRepository porscheRepository, CarRepository carRepository) {
        this.audiRepository = audiRepository;
        this.porscheRepository = porscheRepository;
        this.carRepository = carRepository;
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
        
        System.out.println("Saved Audi with ID: " + savedAudi.getId());
        System.out.println("Model: " + savedAudi.getModel());
        System.out.println("Year: " + savedAudi.getYear());
    }
}
