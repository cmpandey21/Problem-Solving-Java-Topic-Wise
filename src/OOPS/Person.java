package OOPS;

public class Person {
 private String name;
 private int age;

 public Person()
 {
	System.out.println("default Contructor");
 }
 
 public Person(int age)
 {
	System.out.println("Parameterized Contructor with one parameter");
	this.age=age;
 }
 public Person(int age, String name)
 {
	System.out.println("Parameterized Contructor with two parameter");
	this.age=age;
	this.name=name;
 }
 public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
 
 
}
