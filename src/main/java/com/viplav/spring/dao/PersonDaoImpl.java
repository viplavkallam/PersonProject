/**
 * 
 */
package com.viplav.spring.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.viplav.spring.pojo.Person;

/**
 * @author vkallam2
 *
 */
@Repository
public class PersonDaoImpl implements PersonDao<Person> {
@Autowired
SessionFactory sessionFactory;
	@Override
	public int addPerson(Person obj) {
		Session session = sessionFactory.getCurrentSession();
//		session.save(obj.getCity());
		session.save(obj);
		return 0;
	}

	@Override
	public void deletePerson(int id) {
		// TODO Auto-generated method stub
		
	}


}
