package com.contract.system.service;

import com.contract.system.model.User;

public interface UserService {

	void save(User user);

	User findByUsername(String username);

}
