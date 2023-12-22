package fr.dawan.business.auth;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterDto {
	
	private String username;
	private String email;
	private String password;
	private String confirmPassword;

}
