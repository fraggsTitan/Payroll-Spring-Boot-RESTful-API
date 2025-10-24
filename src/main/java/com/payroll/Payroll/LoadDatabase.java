package com.payroll.Payroll;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger logger= LoggerFactory.getLogger(LoadDatabase.class);
    @Bean
    CommandLineRunner initDatabase(EmployeeRepository employeeRepository) {
        //this is just a lambda that implements the run function for commandlinerunner once the app starts, spring boot loads all of these clrunner beans
        return args -> {
            logger.info("Preloading {}", employeeRepository.save(new Employee("Bilbo Baggins", "Burglar")));
            logger.info("Preloading {}", employeeRepository.save(new Employee("Frodo Baggins", "Thief")));
        };
    }
}
