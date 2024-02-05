package com.distribuida.principal;

//import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.LibroDAO;
import com.distribuida.entities.Libro;
public class PrincipalLibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		LibroDAO libroDAO = context.getBean("libroDAOImpl", LibroDAO.class);
			
//		Libro libro2 = new Libro(0,"Libro 23","Santillana",400,"1ra ED","Español", new Date(), "Animado", "Pasta Dura", 978-1612212121, 20, "Gris", "Virtual", 15.60, 0 , 0 );
//		libroDAO.add(libro2);
//		Libro cliente3 = new Libro(0,"Libro 25","Santillana","400","1ra ED","Español", "new Date", "Animado", "Pasta Dura", "978-1612212121", "20", "Gris", "Virtual", "15.60", 0 , 0 );
//		libroDAO.up(libro3);
		
//		libroDAO.del(39);
		
		List<Libro> libros = libroDAO.findAll();
		
		Libro libro = libroDAO.findOne(1);
		
		
		for (Libro item : libros) {
			System.out.println(item.toString());
		}
		
//		System.out.println(cliente.toString());
		
		context.close();
				
		
	}

}