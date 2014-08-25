package ar.com.jsf.domain.dao.impl;

import java.util.List;

import org.hibernate.Query;

import org.springframework.stereotype.Repository;

import ar.com.jsf.domain.Usuario;
import ar.com.jsf.domain.dao.AbstractDao;
import ar.com.jsf.domain.dao.UsuarioDao;

@Repository
public class UsuarioDaoImpl extends AbstractDao<Usuario> implements UsuarioDao {

	@Override
	public Usuario findByUsuario(String usuario) {
		String strQuery = "from Usuario u where u.usuario = :userName";
		try {
			Query query = currentSession().createQuery(strQuery);

			query.setParameter("userName", usuario);

			return (Usuario) query.uniqueResult();
		} catch (Exception e) {
			return null;
		}

	}

	public Class<Usuario> getEntityClass() {
		return Usuario.class;
	}

	@Override
	public List<Usuario> findAll() {
		String strQuery = "from Usuario";
		try {
			Query query = currentSession().createQuery(strQuery);

			return (List<Usuario>) query.list();
		} catch (Exception e) {
			return null;
		}

	}

}
