package com.imooc.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
public class BoyFriend {
	@Autowired
	private GirlFriend girlFriend;
}
