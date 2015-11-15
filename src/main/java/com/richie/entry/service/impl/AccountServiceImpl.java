package com.richie.entry.service.impl;

import org.springframework.stereotype.Service;

import com.richie.entry.service.AccountService;
import com.richie.entry.vo.Account;
import com.richie.entry.vo.Person;

@Service
public class AccountServiceImpl implements AccountService{

	@Override
	public Account add(Person person) {
		return new Account();
	}

	@Override
	public Account get(int id) {
		return new Account();
	}

}
