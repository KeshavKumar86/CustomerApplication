package customerapplication.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
private long id;
private String name;
private String gender;
private int age;
private String prefferedFood;


public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
public Customer(long id, String name, String gender, int age, String prefferedFood) {
	super();
	this.id = id;
	this.name = name;
	this.gender = gender;
	this.age = age;
	this.prefferedFood = prefferedFood;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getPrefferedFood() {
	return prefferedFood;
}
public void setPrefferedFood(String prefferedFood) {
	this.prefferedFood = prefferedFood;
}

}
