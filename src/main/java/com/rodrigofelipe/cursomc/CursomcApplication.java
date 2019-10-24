package com.rodrigofelipe.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rodrigofelipe.cursomc.domain.Categoria;
import com.rodrigofelipe.cursomc.repositories.CategoriaRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {
	
	/*Instanciando o obj da classe CategoriaRepository */
	@Autowired
	private CategoriaRepository categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		/*Declarando obj da classe Categoria*/
		Categoria cat1 = new Categoria(null, "informática");
		Categoria cat2 = new Categoria(null, "escritório");
		
		/*categoriaRepository.saveAll salvar os obj no BD*/
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		
	}

}
