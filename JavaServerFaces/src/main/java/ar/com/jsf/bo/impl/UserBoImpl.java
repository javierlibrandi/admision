package ar.com.jsf.bo.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.com.jsf.bo.UserBo;
import ar.com.jsf.domain.dao.MensajeDao;

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
