package fr.sofnul.bk.user.dao;

import org.springframework.stereotype.Repository;

import fr.sofnul.bk.fmk.dao.IDao;
import fr.sofnul.bk.user.bo.Users;

@Repository
public interface IUserDao extends IDao<Users, Integer> {

}
