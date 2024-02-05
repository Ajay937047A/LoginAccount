package com.ashokit.serivice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.binding.UserLoginBinding;
import com.ashokit.constant.AppContstant;
import com.ashokit.entity.UserEntity;
import com.ashokit.repository.UserRepository;


@Service
public class LoginUserServiceImpl implements LoginUserSerive {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public String loginUser(UserLoginBinding loginService) {
		UserEntity user = userRepository.findByUserEmailAndUserPWD(loginService.getEmail(), loginService.getPwd());
		if(user==null) {
			return AppContstant.INVALID_USER;
		}
		if(user.getUserAccStatus().equals(AppContstant.LOCKED)) {
			return AppContstant.YOUR_ACCOUNT_IS_LOCKED;
		}
		
		return AppContstant.SUCCESS;
	}

}
