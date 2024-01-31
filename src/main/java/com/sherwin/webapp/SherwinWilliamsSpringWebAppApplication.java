package com.sherwin.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SherwinWilliamsSpringWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SherwinWilliamsSpringWebAppApplication.class, args);
	}

    @GetMapping
    public String message(){
        return "Congrats";
    }
}
