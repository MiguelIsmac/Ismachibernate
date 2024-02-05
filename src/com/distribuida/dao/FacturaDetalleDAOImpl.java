package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.FacturaDetalle;


@Repository
public class FacturaDetalleDAOImpl implements FacturaDetalleDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	@Transactional
	public List<FacturaDetalle> findAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("FROM FacturaDetalle", FacturaDetalle.class).getResultList();
	}

	@Override
	public FacturaDetalle findOne(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.get(FacturaDetalle.class, id);
	}

	@Override
	public void add(FacturaDetalle facturaDetalle) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(facturaDetalle);
		
		
	}

	@Override
	public void up(FacturaDetalle facturaDetalle) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(facturaDetalle);
		
	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.delete(findOne(id));
		
	}

	@Override
	public List<FacturaDetalle> findAll(String busqueda) {
		// TODO Auto-generated method stub
		return null;
	}

}