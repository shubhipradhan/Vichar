package com.vichar.VicharRest.rest.service;

import java.util.List;

import com.vichar.VicharBACKEND.model.User;



//import com.test.TESTVichar.model.User;



public interface UserService {

	 User findById(long id);
     
	    User findByName(String name);
	     
	    void saveUser(User user);
	     
	    void updateUser(User user);
	     
	    void deleteUserById(long id);
	 
	    List<User> findAllUsers(); 
	     
	    void deleteAllUsers();
	     
	    public boolean isUserExist(User user);
}
