package com.departamento.departamento;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement  // Habilita el manejo de transacciones
@MapperScan("com.departamento.departamento.mappers") 
public class DepartamentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartamentoApplication.class, args);
	}

}
