package com.distribuida.principalDTO;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.distribuida.dto.ClienteService;
import com.distribuida.dto.FacturaDetalleService;
import com.distribuida.dto.FacturaService;
import com.distribuida.entities.Cliente;
import com.distribuida.entities.Factura;
import com.distribuida.entities.FacturaDetalle;

public class PrincipalFacturaDetalle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		FacturaDetalleService facturaDetalleService = context.getBean("facturaDetalleServiceImpl", FacturaDetalleService.class);
		
		//crud
		//findall
		
		
		//for (Cliente item : clientes) {
			
		//	System.out.println(item.toString());
			
		//}
		
		//System.out.println(cliente.toString());
		
		//add agregar nuevo registro a la base de datos
		
		//Cliente cliente2 = new Cliente(0,"1724321234","Luis","Sanchez","Guayaquil","099999999", "lsanchez@gmail.com");
		//clienteService.add(cliente2);
		//clienteDAO.add(cliente2);
		
		//up editar un registro existente
		//Cliente cliente3 = new Cliente(42,"1724321234","Luis","Sanchez","Guayaquil","099999999", "lsanchez@gmail.com");
		//clienteDAO.up(cliente3);
		//clienteService.up(cliente3);
		
		//del borrar
		
		//Cliente cliente3 = new Cliente(40,"1724321234","Luis","Sanchez","Guayaquil","099999999", "lsanchez@gmail.com");
		//facturaService.del(41);
		
		
		List<FacturaDetalle> facturaDetalle = facturaDetalleService.findAll();
		
				for (FacturaDetalle item : facturaDetalle) {
							
							System.out.println(item.toString());	
							
						}
		
		//findOne
		
		FacturaDetalle facturaDetalle1 = facturaDetalleService.findOne(1);
		
		System.out.println(facturaDetalle1.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		context.close();
		

	}

}