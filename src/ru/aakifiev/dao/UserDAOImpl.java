package ru.aakifiev.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ru.aakifiev.domain.User;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addUser(User user) {
		sessionFactory.getCurrentSession().save(user);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> users() {
		return sessionFactory.getCurrentSession().createQuery("from User").list();
	}

	@Override
	public void removeUser(Integer id) {
		User user = (User) sessionFactory.getCurrentSession().load(User.class, id);
		if (user != null){
			sessionFactory.getCurrentSession().delete(user);
		}
	}

}
