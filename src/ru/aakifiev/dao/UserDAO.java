package ru.aakifiev.dao;

import java.util.List;

import ru.aakifiev.domain.User;

public interface UserDAO {
	
	public void addUser(User user);
	
	public List<User> users();
	
	public void removeUser(Integer id);

}
