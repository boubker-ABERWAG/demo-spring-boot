package fr.sofnul.bk.user.component;

import java.util.List;

import fr.sofnul.bk.fmk.component.IComponent;
import fr.sofnul.bk.user.bo.Users;

public interface IUserManagmentComponent extends IComponent {

	public List<Users> getUsers();

	Users addUser(Users user);
}
