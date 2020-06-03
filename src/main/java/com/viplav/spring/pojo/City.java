/**
 * 
 */
package com.viplav.spring.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author vkallam2
 *
 */
@Entity
public class City {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
int id;
String name;
String state;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}


}
