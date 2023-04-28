package com.example.spring_boot_elasticbeanstalkaws;

import com.example.spring_boot_elasticbeanstalkaws.entity.Employee;
import com.example.spring_boot_elasticbeanstalkaws.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootElasticBeanstalkAwsApplication implements CommandLineRunner {

    @Autowired
    private EmployeeRepo employeeRepo ;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootElasticBeanstalkAwsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        for (int i =0 ; i<10 ; i++){
            employeeRepo.save(new Employee(null , "employee"+i , "java Developer")) ;
        }

    }
}
