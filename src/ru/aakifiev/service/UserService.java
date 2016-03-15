package ru.aakifiev.service;

import java.util.List;

import ru.aakifiev.domain.User;

public interface UserService {
	
	public void addContact(User user);
	
	public List<User> listUser();

	public void removeUser(Integer id);
}
