package com.richie.entry.service;

import com.richie.entry.vo.Account;
import com.richie.entry.vo.Person;

public interface AccountService {
	public Account add(Person person);
	
	public Account get(int id);

}
