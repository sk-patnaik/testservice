package com.shell.siep.gto.validators;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.shell.siep.gto.commons.enums.WEBErrorCodeEnum;
import com.shell.siep.gto.vo.request.LoginRequest;



@Service("loginValidator")
public class LoginRequestBeanValidator implements Validator {


	public LoginRequestBeanValidator() {
		super();
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return LoginRequest.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "error.username", WEBErrorCodeEnum.INPUT_MISSING.name());
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "error.password", WEBErrorCodeEnum.INPUT_MISSING.name()); 
        
	}

}
