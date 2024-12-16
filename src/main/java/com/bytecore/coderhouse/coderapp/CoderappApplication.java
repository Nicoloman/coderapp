package com.bytecore.coderhouse.coderapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bytecore.coderhouse.coderapp.dao.DaoFactory;
import com.bytecore.coderhouse.coderapp.entities.Alumno;
import com.bytecore.coderhouse.coderapp.entities.Curso;

@SpringBootApplication
public class CoderappApplication {

	public static void main(String[] args) throws Execption {
		SpringApplication.run(CoderappApplication.class, args);
		CoderappApplication.run("run");
		System.out.println("CoderappApplication Started!");
	}

	@Autowired
	private DaoFactory dao;


	public static void startApp(){
		System.out.println("-");
		System.out.println("-");
		System.out.println("-");
		System.out.println("-");
		System.out.println("-");
		System.out.println("-");
		System.out.println("-");
		System.out.println("-");
		System.out.println("-");
		System.out.println("-");
		System.out.println("-");
		System.out.println("-");
		System.out.println("-");
		System.out.println("-");
		System.out.println("-");
		System.out.println("-");
		System.out.println("-");
		System.out.println("-");
		System.out.println("-");
		System.out.println("-");
		System.out.println("-");
	};

	
	public static void run(String... args) throws  Execption {
		
		CoderappApplication.startApp();
		
		try{

			Curso curso1 = new Curso("Java");
			Curso curso2 = new Curso("Angular");
			Curso curso3 = new Curso("Python");
			Curso curso4 = new Curso("Web3");


			Alumno alumno = new Alumno("Nicolas", "Lomanto", 43504934, "L87687678");

			// dao.persistirCurso(curso4);

		 }
		 catch(Exception e){
			e.printStackTrace(System.err);
		 }
	}

}
