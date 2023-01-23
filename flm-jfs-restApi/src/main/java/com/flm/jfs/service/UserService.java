package com.flm.jfs.service;

import com.flm.jfs.dto.UserDTO;

public interface UserService {
	
	UserDTO getUser(Integer id);
	void createUser(UserDTO userDTO);

}
