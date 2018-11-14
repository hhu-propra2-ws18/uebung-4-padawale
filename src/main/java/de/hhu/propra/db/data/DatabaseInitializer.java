package de.hhu.propra.db.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

@Component
public class DatabaseInitializer implements ServletContextInitializer{

    @Autowired
    KundeRepository kundeRepository;

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
//        System.out.println("Populating the database");
//        final Faker faker = new Faker(Locale.GERMAN);
//        IntStream.range(0, 30).forEach(value -> {
//            final Kunde kunde = new Kunde();
//            kunde.setName(faker.name().fullName());
//            kunde.setStadt(faker.address().cityName());
//            kunde.setPlz(Integer.parseInt(faker.address().zipCode()));
//            final List<Auto> autos = IntStream.range(0, faker.number().numberBetween(0, 3)).mapToObj(j -> {
//                Auto a = new Auto();
//                a.setFarbe(faker.color().name());
//                a.setMarke(faker.company().name());
//                a.setHubraum(faker.number().numberBetween(1000, 2000));
//                return a;
//            }).collect(Collectors.toList());
//            kunde.setAutos(autos);
//            this.kundeRepository.save(kunde);
//        });
    }
}
