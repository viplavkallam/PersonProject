/**
 * 
 */
package com.viplav.spring.dao;

/**
 * @author vkallam2
 *
 */
public interface PersonDao<T> {
	public int addPerson(T obj);
	public void deletePerson(int id);
}
