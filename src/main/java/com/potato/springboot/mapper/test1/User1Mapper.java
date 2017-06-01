package com.potato.springboot.mapper.test1;

import java.util.List;

import com.potato.springboot.domain.User;

public interface User1Mapper {

	List<User> getAll();

	User getOne(Long id);

	void insert(User user);

	void update(User user);

	void delete(Long id);

}