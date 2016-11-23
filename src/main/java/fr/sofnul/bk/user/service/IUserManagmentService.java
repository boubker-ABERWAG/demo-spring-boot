package fr.sofnul.bk.user.service;

import java.util.List;

import fr.sofnul.bk.fmk.service.IService;
import fr.sofnul.bk.user.bo.Users;

public interface IUserManagmentService extends IService {

	public List<Users> getUsers();

}
