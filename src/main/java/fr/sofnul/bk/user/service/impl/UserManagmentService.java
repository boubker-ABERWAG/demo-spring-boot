package fr.sofnul.bk.user.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import fr.sofnul.bk.fmk.service.impl.AbstractService;
import fr.sofnul.bk.user.bo.Users;
import fr.sofnul.bk.user.component.IUserManagmentComponent;
import fr.sofnul.bk.user.service.IUserManagmentService;

// @RestController
@EnableAutoConfiguration
public class UserManagmentService extends AbstractService implements IUserManagmentService {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserManagmentService.class);

	// @RequestMapping("/getUsers")
	@Override
	public List<Users> getUsers() {
		return getComponent(IUserManagmentComponent.class).getUsers();
	}
}