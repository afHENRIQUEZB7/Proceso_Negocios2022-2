package com.Proceso_Negocio20222.Proceso_Negocio20222;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProcesoNegocio20222Application {

	public static void main(String[] args) {
		SpringApplication.run(ProcesoNegocio20222Application.class, args);
	}
    @GetMapping("/hello")
    public String hello(@RequestParam(value="name",defaultValue = "Mundo") String name){
        return "Hola " +name+" en espring boot";
    }


}
