package com.btc.app.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.btc.app.model.User;

class UserDaoImplTest {

	//@Test
UserDao dao=new UserDaoImpl();
	
	
	//@disabled
	@Test
	void testAddUser() throws Exception {
		User user=new User(1006,"Hardhik","Hardhik123","crime");
		assertEquals(user, dao.addUser(user));
	}

//	@Test
//	void testReadNews() throws Exception {
//		//fail("Not yet implemented");
//		//assert(dao.readNews(1006)!=null);
//	}

}
