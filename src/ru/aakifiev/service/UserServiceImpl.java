package ru.aakifiev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ru.aakifiev.dao.UserDAO;
import ru.aakifiev.domain.User;


@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO userDao;

	@Override
	@Transactional
	public void addContact(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	@Transactional
	public List<User> listUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public void removeUser(Integer id) {
		// TODO Auto-generated method stub

	}

}
