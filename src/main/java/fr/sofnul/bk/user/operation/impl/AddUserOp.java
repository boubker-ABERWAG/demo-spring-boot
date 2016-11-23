package fr.sofnul.bk.user.operation.impl;

import fr.sofnul.bk.fmk.operation.impl.AbstractOperation;
import fr.sofnul.bk.user.bo.Users;
import fr.sofnul.bk.user.dao.IUserDao;
import fr.sofnul.bk.user.operation.IAddUserOp;

public class AddUserOp extends AbstractOperation implements IAddUserOp {

	@Override
	public void checkParameters(Object... params) {
	}

	@Override
	public Object process(Object... params) {
		Users user = (Users) params[0];
		return getDao(IUserDao.class).save(user);
	}
}