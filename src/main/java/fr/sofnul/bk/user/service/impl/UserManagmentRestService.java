package fr.sofnul.bk.user.service.impl;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import fr.sofnul.bk.fmk.service.impl.AbstractService;
import fr.sofnul.bk.user.bo.Users;
import fr.sofnul.bk.user.component.IUserManagmentComponent;
import fr.sofnul.bk.user.service.IUserManagmentService;

@Component
@Path("rest")
public class UserManagmentRestService extends AbstractService implements IUserManagmentService {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserManagmentRestService.class);
	private static int i = 0;

	public IUserManagmentComponent getDefaultComponent() {
		return getComponent(IUserManagmentComponent.class);
	}

	@Path("/getUsers")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public List<Users> getUsers() {
		return getDefaultComponent().getUsers();
	}

	@GET
	@Path("add")
	@Produces(MediaType.APPLICATION_JSON)
	public Users add() {
		Users user = new Users();
		user.setId(i);
		user.setName("boubker" + i);
		user.setEmail("email" + i++ + "@email.com");

		LOGGER.info("user ========> {}", user.getName());
		return getDefaultComponent().addUser(user);
	}
}