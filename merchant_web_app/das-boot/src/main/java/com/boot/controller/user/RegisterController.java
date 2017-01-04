package com.boot.controller.user;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boot.model.user.User;
import com.boot.repository.RegisterRepository;

@RestController
@RequestMapping("api/v1/")
public class RegisterController {

	@Autowired
	private RegisterRepository registerRepository;

	
	@RequestMapping(value = "register", method = RequestMethod.POST)
	public User create(@RequestBody User user) {
		return registerRepository.saveAndFlush(user);
	}
	
	@RequestMapping(value = "register", method = RequestMethod.GET)
	public List<User> list() {
		return registerRepository.findAll();
	}
	
	@RequestMapping(value = "register/{id}", method = RequestMethod.GET)
	public User get(@RequestBody Long id) {
		return registerRepository.findOne(id);
	}
	
	@RequestMapping(value = "register/{id}", method = RequestMethod.PUT)
	public User update(@PathVariable Long id, @RequestBody User user) {
		User existingUser = registerRepository.findOne(id);
		BeanUtils.copyProperties(user, existingUser);
		return registerRepository.saveAndFlush(existingUser);
	}
	
	@RequestMapping(value = "register/{id}", method = RequestMethod.DELETE)
	public User delete(@PathVariable Long id) {
		User existingUser = registerRepository.findOne(id);
		registerRepository.delete(existingUser);
		return existingUser;
	}

}
