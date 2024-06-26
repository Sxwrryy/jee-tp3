package ma.emsi.hopital;

import ma.emsi.hopital.entities.Patient;
import ma.emsi.hopital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class HopitalApplication implements CommandLineRunner {
    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {

        SpringApplication.run(HopitalApplication.class, args);
    }

    @Override
    public void run(String...args) throws Exception{
        patientRepository.save(new Patient(null,"mohamed",new Date(),false,302));
        patientRepository.save(new Patient(null,"hanane",new Date(),false,420));
        patientRepository.save(new Patient(null,"yasmine",new Date(),true,899));
        patientRepository.save(new Patient(null,"yasser",new Date(),false,927));
        patientRepository.save(new Patient(null,"luna",new Date(),false,633));
        patientRepository.save(new Patient(null,"oumaima",new Date(),true,945));

    }

}
