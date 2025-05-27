package Telephone_Book_System;

public class Person {
	  private String firstName;
	  private String lastName;
	  private String phoneNumber;
	  private String city;
	  private String address;
	  private char Gender;
	  private String email;
	  
	  public Person(String firstName, String lastName, String phoneNumber, String city, String address,
			  char sex, String email) {
	    this.firstName = firstName;
	    this.lastName = lastName;
	    this.phoneNumber = phoneNumber;
	    this.city = city;
	    this.address = address;
	    this.Gender = sex;
	    this.email = email;
	  }
	  
	  public String toString() {
	    return "Person{" + "firstName=" + firstName + ", lastName=" + lastName +
	 ", phoneNumber=" + phoneNumber + ", city=" + city + ", address=" + address 
	 + ",sex=" + Gender + ", email=" + email + '}';
	  }
	  
	  public String getFirstName() {
	    return firstName;
	  }
	  public void setFirstName(String firstName) {
	    this.firstName = firstName;
	  }
	  public String getLastName() {
	    return lastName;
	  }
	  public void setLastName(String lastName) {
	    this.lastName = lastName;
	  }
	  public String getPhoneNumber() {
	    return phoneNumber;
	  }
	  public void setPhoneNumber(String phoneNumber) {
	    this.phoneNumber = phoneNumber;
	  }
	  public String getCity() {
	    return city;
	  }
	  public void setCity(String city) {
	    this.city = city;
	  }
	  public String getAddress() {
	    return address;
	  }
	  public void setAddress(String address) {
	    this.address = address;
	  }
	  public char getGender() {
	    return Gender;
	  }
	  public void setGender(char sex) {
		    this.Gender = sex;
		  }
		  public String getEmail() {
		    return email;
		  }
		  public void setEmail(String email) {
		    this.email = email;
		  }
}
		  
		  
