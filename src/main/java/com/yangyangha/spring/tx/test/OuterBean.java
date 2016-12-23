package com.yangyangha.spring.tx.test;

import com.yangyangha.spring.tx.model.User;

public interface OuterBean {

	void testRequired(User user);
	
	void testRequiresNew(User user);

}
