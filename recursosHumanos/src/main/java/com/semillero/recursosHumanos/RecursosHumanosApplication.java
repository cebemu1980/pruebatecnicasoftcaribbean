package com.semillero.recursosHumanos;

import com.semillero.recursosHumanos.dao.EmpleadoDao;
import com.semillero.recursosHumanos.dao.EmpleadoDaoImplement;
import com.semillero.recursosHumanos.dto.EmpleadosDTO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class RecursosHumanosApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecursosHumanosApplication.class, args);
	}

}
