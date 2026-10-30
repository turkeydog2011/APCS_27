package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	String name;
	int age; 
	String breed;
	//I HATE dogs so much
	public Dog() {
		name = "Clifford";
		age = 3;
		breed = "Big Red Dog";
			//I HATE dogs so much

	}
	public Dog(String name) {
		this.name = name;
		age = 3;
		breed = "Dog Dog";
	}
	public Dog(String name, String breed) {
		this.name = name;
		age = 1;
		this.breed = breed;
	}
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
		breed = "Dog Dog";
	}
	public void setName(String name) {
		this.name = name;
	}	//I HATE dogs so much

	public void setAge(int age) {
		this.age = age;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}	//I HATE dogs so much
	public boolean isSleeping(){
if (((int)(Math.random()*2))==1) {
	return true;
} else {
	return false;
}
	}
	public void bark(){
		System.out.println(name + " is a dog that barks");
	}
public String getname(){
	return name;
}
public String getbreed(){
	return breed;
}
public int getage(){
	return age;
}

}
	//I HATE dogs so much
