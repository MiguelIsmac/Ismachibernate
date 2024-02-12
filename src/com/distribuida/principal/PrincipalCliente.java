package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.entities.Cliente;

public class PrincipalCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		ClienteDAO clienteDAO = context.getBean("clienteDAOImpl", ClienteDAO.class);
			
//		Cliente cliente2 = new Cliente(0,"1724321234","Luis","Sanchez","Guayaquil","099999999", "lsanchez@gmail.com");
//		clienteDAO.add(cliente2);
//		Cliente cliente3 = new Cliente(39,"1724321234","Luis","Sanchez","Quito","099999999", "lsanchez@gmail.com");
//		clienteDAO.up(cliente3);
		
		clienteDAO.del(36);
		
		List<Cliente> clientes = clienteDAO.findAll();
		
		Cliente cliente = clienteDAO.findOne(1);
		
		
		for (Cliente item : clientes) {
			System.out.println(item.toString());
		}
		
//		System.out.println(cliente.toString());
		
		context.close();
				
		
	}

}
