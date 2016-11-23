package fr.sofnul.bk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.sofnul.bk.user.bo.Users;
import fr.sofnul.bk.user.dao.IUserDao;

// @RestController
@EnableAutoConfiguration
@ComponentScan
public class Test {

	private static Logger LOGGER = LoggerFactory.getLogger(Test.class);
	private static int i = 0;

	@Autowired
	IUserDao dao;

//	@RequestMapping("add")
//	void add() {
//		Users user = new Users();
//		user.setId(i);
//		user.setName("boubker" + i);
//		user.setEmail("email" + i++ + "@email.com");
//
//		System.out.println("user ========>" + user.getName());
//		dao.save(user);
//	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Test.class, args);
	}

}
