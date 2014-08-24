package ar.com.jsf.domain.dao.impl;

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

		Query query = currentSession().createQuery(strQuery);

		query.setParameter("userName", usuario);

		return (Usuario) query.uniqueResult();
	}

	public Class<Usuario> getEntityClass() {
		return Usuario.class;
	}

}
