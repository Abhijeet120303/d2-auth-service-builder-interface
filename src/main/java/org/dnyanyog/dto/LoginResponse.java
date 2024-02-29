package org.dnyanyog.dto;

import org.springframework.stereotype.Component;

@Component
public class LoginResponse {

	private String status;
	private String message;
	private String code;
	
	


	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
