package com.mkyong.user.bo.impl;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mkyong.domain.dao.MensajeDao;
import com.mkyong.user.bo.UserBo;

@Service
@Transactional
public class UserBoImpl implements UserBo,Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private MensajeDao mensajeDao;

	public void setMensajeDao(MensajeDao mensajeDao) {
		this.mensajeDao = mensajeDao;
	}

	@Override
	public String getMessage() {
		return mensajeDao.getMensaje().getMensaje();
	}

}
