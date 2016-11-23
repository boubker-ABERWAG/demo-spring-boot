package fr.sofnul.bk.user.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fr.sofnul.bk.user.component.IUserManagmentComponent;
import fr.sofnul.bk.user.component.impl.UserManagmentComponentImpl;
import fr.sofnul.bk.user.operation.IAddUserOp;
import fr.sofnul.bk.user.operation.IGetUserOp;
import fr.sofnul.bk.user.operation.impl.AddUserOp;
import fr.sofnul.bk.user.operation.impl.GetUsersOp;

@Configuration
public class AppConfig {

	@Bean
	public IUserManagmentComponent userManagmentComponent() {
		return new UserManagmentComponentImpl();
	}

	@Bean
	public IGetUserOp getUserOp() {
		return new GetUsersOp();
	}

	@Bean
	public IAddUserOp addUserOp() {
		return new AddUserOp();
	}
}
