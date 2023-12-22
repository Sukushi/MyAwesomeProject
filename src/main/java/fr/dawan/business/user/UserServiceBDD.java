package fr.dawan.business.user;

import fr.dawan.business.generic.GenericServiceBDD;
import org.springframework.stereotype.Service;

@Service
public class UserServiceBDD extends GenericServiceBDD<User, UserRepository, UserDto, UserMapper> implements UserService {
	
	public UserServiceBDD(UserRepository repository, UserMapper mapper) {
		super(repository, mapper);
	}
	
	
}
