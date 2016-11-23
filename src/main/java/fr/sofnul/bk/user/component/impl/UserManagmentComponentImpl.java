package fr.sofnul.bk.user.component.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.sofnul.bk.fmk.component.impl.AbstractComponent;
import fr.sofnul.bk.user.bo.Users;
import fr.sofnul.bk.user.component.IUserManagmentComponent;
import fr.sofnul.bk.user.operation.IAddUserOp;
import fr.sofnul.bk.user.operation.IGetUserOp;

public class UserManagmentComponentImpl extends AbstractComponent implements IUserManagmentComponent {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserManagmentComponentImpl.class);

	@SuppressWarnings("unchecked")
	@Override
	public List<Users> getUsers() {
		return (List<Users>) getComponentOperation(IGetUserOp.class).process();
	}

	@Override
	public Users addUser(Users user) {
		return (Users) getComponentOperation(IAddUserOp.class).process(user);
	}

}
