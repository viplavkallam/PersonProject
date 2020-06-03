/**
 * 
 */
package com.viplav.spring.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viplav.spring.dao.PersonDao;
import com.viplav.spring.pojo.Person;

/**
 * @author vkallam2
 *
 */
@Service
public class PersonService {
	@Autowired
	PersonDao<Person> personDao;
	
	@Transactional
	public int addPerson(Person person) {
		personDao.addPerson(person);
		return 0;
	}
	
	public void deletePerson(int id) {
		
	}
	
}
