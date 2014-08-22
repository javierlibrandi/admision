package com.mkyong.domain.dao.impl;

import java.io.Serializable;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mkyong.domain.Mensaje;
import com.mkyong.domain.dao.MensajeDao;

@Repository
public class MensajeDaoImpl implements MensajeDao, Serializable {

	@Autowired
	private SessionFactory sessionFactory;

	@Autowired
	protected void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
	protected Session currentSession() {
		return this.sessionFactory.getCurrentSession();
	}

	@Override
	public Mensaje getMensaje() {
		Query query = null;
		try {
			query = currentSession().createQuery("from Mensaje");
		} catch (Exception e) {
			e.printStackTrace();
		}

		return (Mensaje) query.uniqueResult();

	}

	public Class<Mensaje> getEntityClass() {
		return Mensaje.class;
	}

}
