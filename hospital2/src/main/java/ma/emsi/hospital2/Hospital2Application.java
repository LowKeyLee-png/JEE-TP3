package ma.emsi.hospital2;

import ma.emsi.hospital2.entities.Patient;
import ma.emsi.hospital2.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class Hospital2Application implements CommandLineRunner {

    @Autowired
    PatientRepository patientRepository;

    public static void main(String[] args) {
        SpringApplication.run(Hospital2Application.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        patientRepository.save(new Patient(null,"Nom prenom", new Date(),89,true));
        Patient patient1 = new Patient();
        patient1.setId(null);
        patient1.setNom("Ahmed");
        patient1.setScore(23);
        patient1.setMalade(false);
        patient1.setDateNaissance(new Date());
        patientRepository.save(patient1);
        patientRepository.save(new Patient(null,"Imane", new Date(),56,true));



    }
}