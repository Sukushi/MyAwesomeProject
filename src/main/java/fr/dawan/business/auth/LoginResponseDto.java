package fr.dawan.business.auth;

import fr.dawan.business.user.UserDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginResponseDto {

	private UserDto user;
	private String token;

}
