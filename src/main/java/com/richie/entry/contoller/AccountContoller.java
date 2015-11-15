package com.richie.entry.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.richie.entry.service.AccountService;
import com.richie.entry.vo.Account;
import com.richie.entry.vo.Person;

@RestController
@RequestMapping("/accounts")
public class AccountContoller {
	@Autowired
	private AccountService accountService;
	
	@Value("${test}")
	private String property;
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public Account add(Person person){
		return accountService.add(person);
	}
	
	@RequestMapping(value="/get/{id}", method=RequestMethod.GET)
	public Account get(@PathVariable int id){
		return accountService.get(id);
	}
	
	@RequestMapping(value="/getProperty", method=RequestMethod.GET)
	public String get(){
		return property;
	}
}
