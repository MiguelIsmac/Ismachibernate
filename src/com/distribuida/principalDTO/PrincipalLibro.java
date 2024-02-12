package com.distribuida.principalDTO;

import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.distribuida.dto.LibroService;
import com.distribuida.entities.Libro;


public class PrincipalLibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Libro libro = new Libro(73, "Bajo la lluvia", "Miguel", 200, "2da", "Español", new Date(), "Triste ", "Blanca ", "978-543545", "300", "Blanca", "Virtual", 19.0);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		LibroService libroService = context.getBean("libroServiceImpl", LibroService.class);
				
		
//		for (Cliente item : clientes) {
			
//			System.out.println(item.toString());
			
//		}
		
//		System.out.println(cliente.toString());
		
		
//		Cliente cliente2 = new Cliente(0,"17321837123","Juan", "Bustamante", "Quito", "0943242349", "jbustamantel@gmail.com");
//		clienteService.add(cliente2);
//		clienteDAO.add(cliente2);
		
		//Cliente cliente3 = new Cliente(42,"17321837123","Juan", "Bustamante", "Quito", "0943242349", "jbustamantel@gmail.com");
		//clienteDAO.up(cliente3);
		//clienteService.up(cliente3);
		
		
		//Cliente cliente3 = new Cliente(40,"17321837123","Juan", "Bustamante", "Quito", "0943242349", "jbustamantel@gmail.com");
		//clienteService.del(41);
		
		
		List<Libro> libros = libroService.findAll();
		
	for (Libro item : libros) {
			
			System.out.println(item.toString());	
			
		}
		
		//findOne
		
		Libro libro1 = libroService.findOne(1);
		
		System.out.println(libro1.toString());
		
		
		
	
		
		
		
		
		
		
		
		
		
		context.close();
		

	}

}