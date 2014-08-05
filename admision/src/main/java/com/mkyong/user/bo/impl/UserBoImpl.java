package com.mkyong.user.bo.impl;

import org.springframework.stereotype.Service;

import com.mkyong.user.bo.UserBo;
@Service
public class UserBoImpl implements UserBo {

	@Override
	public String getMessage() {
		return "JSF 2 + Spring Integration";
	}

}
