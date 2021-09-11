package ec.edu.espe.distribuidas.examen.examenbatch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ExamenBatchApplication {

    @Autowired
    JobLauncher jobLauncher;

    @Autowired
    @Qualifier("consolidarEfectivo")
    Job job1;

    public static void main(String[] args) {
        SpringApplication.run(ExamenBatchApplication.class, args);
    }

}
