package com.my.creational.builder;

public class MutipleBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


class Person{

String address,postcode,city;

String companyName,position;

int annualIncome;
	
}


class PersonBuilder{
	
	
	protected Person person = new Person();
	
	
	public Person build() {
	return person;
	}
}

class PersonAddressBuilder extends PersonBuilder{
	
	public PersonAddressBuilder(Person person) {
	this.person = person;
	}
	
	PersonAddressBuilder at(String street) {
		
		person.address =street;
		return this;
	}
	
	
}
