package com.flm.jfs.serviceImpl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flm.jfs.dto.UserDTO;
import com.flm.jfs.model.User;
import com.flm.jfs.repository.UserRepository;
import com.flm.jfs.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public UserDTO getUser(Integer id) {
		UserDTO userDTO = new UserDTO();
		User user = userRepository.findById(id).get();
		BeanUtils.copyProperties(user, userDTO);
		return userDTO;
	}

	@Override
	public void createUser(UserDTO userDTO) {
		User user = new User();
		user.setFailedCount(1);
		user.setPassword("devendra");
		user.setAccountStatus("Active");
		BeanUtils.copyProperties(userDTO, user);
		userRepository.save(user);
		
	}

}
