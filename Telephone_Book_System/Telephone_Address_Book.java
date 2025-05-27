package Telephone_Book_System;

public class Telephone_Address_Book { 
	  
	  private Node head;
	  
	  public Telephone_Address_Book() {
	    head = null;
	  }
	  
	  ////////////////////////////////////////////
	  public void addPerson(Person p) {
	  // Check if the list is empty
	  if (head == null) {
	    head = new Node(p);
	    System.out.println("Person Information Added \n");
	    return;
	  }
	  // Check if the phone number already exists
	  // تاكد اذا الرقم متكرر اولا 
	  if (head.person.getPhoneNumber().equals(p.getPhoneNumber())) {
	    System.out.println("Phone number already exists ");
	    System.out.println("This person's information hasn't been added in the telephone directory ");
	    return;
	  }
	  //تتاكد من جميع النود الي داخل الينكدليست اذاهي الرقم متكرر او لا 
	  //متكرر تطبع الجمله و اذا وصل لاخر نود
      // والرقم باقي مو متكرر يطلع خارج  اللوب ويضيف نود جديدة لهذا الشخص 
	  Node current = head;
	  while (current.next != null) {
	    if (current.person.getPhoneNumber().equals(p.getPhoneNumber())) {
	      System.out.println("Phone number already exists in the telephone directory.");
	      return;
	    }
	    current = current.next;
	  }
	  // Add the person to the end of the list
	  // اضافه الشخص من الذيل او النهايه
	  current.next = new Node(p);
	  System.out.println("Person Information Added \n");
	 }
	  
	  ///////////////////////////////////////
	  // حذف الشخص عن طريق رقم الجوال 
	  public void deletePerson(String phoneNumber) { 
		    if (head == null) {
		      System.out.println("The telephone directory is empty.");
		      return;
		    }
		    
		    if (head.person.getPhoneNumber().equals(phoneNumber)) {
		      head = head.next;
		      return;
		    }
		    //احذف الربط من النود واحط الرابط للنود الي بعدها 
		    //current عبارة عن مؤشر يمشي على جميع النود الي في اللينكد ليست:
		    Node current = head;
		    while (current.next != null) {
		      if (current.next.person.getPhoneNumber().equals(phoneNumber)) {
		        current.next = current.next.next;
		        return;
		      }
		      current = current.next;
		    }
		    
		    System.out.println("Person with phone number " + phoneNumber + " not found.");
		  } 
	  
	  
	  ////////////////////////////////
	  // تعديل الرقم عن طريق البحث عن الاسم
	  public void updatePhoneNumber(String firstName, String newPhoneNumber) {
		 
		     Node current = head;
		     while (current != null) {
		       if (current.person.getFirstName().equals(firstName)) {
		         current.person.setPhoneNumber(newPhoneNumber);
		         System.out.println("Phone number updated successfully.");
		         return;
		       }
		       current = current.next;
		     }
		     
		     System.out.println("Person with first name " + firstName + " not found!!");
		   }
	  
		   ////////////////
		   public void displayPhoneBook() {
		     if (head == null) {
		       System.out.println("The telephone directory is empty");
		       return;
		     }
		     
		     Node current = head;
		     while (current != null) {
		       System.out.println(current.person.toString());
		       current = current.next;
		     }
		   }
		   
		   /////////////////////////////////////////
		 //By sequantial Search
		   //البحث عن رقم الشخص باستخدام اسمه 
		   public void searchPhoneNumber(String firstName) {
			   boolean found = false;
			    Node current = head;
			    while (current != null) {
			      if (current.person.getFirstName().equals(firstName)) {
			        System.out.println("The phone number is :"+current.person.getPhoneNumber());
			        found = true;
			      }
			      current = current.next;
			    }
			    
			    if (!found) {
			      System.out.println("Person with first name " + firstName + " not found !!");
			    }
			  }
		   
		   ////////////////////////////////////////
		   public void selectionSort() {
			   if (head == null || head.next == null) {
			     return;
			   }
			   Node temp = head;
			   while (temp != null) {
			     Node min = temp;
			     Node r = temp.next;
			     while (r != null) {
			       // compareTo 
			       if (min.person.getFirstName().compareTo(r.person.getFirstName()) > 0)
			  {
			         min = r;
			       }
			       r = r.next;
			     }
			     // عملية تبديل البيانات
			     Person tempPerson = temp.person;
			     temp.person = min.person;
			     min.person = tempPerson;
			     temp = temp.next;
			   }
			   System.out.println("The telephone directory is Sorted ");
			  }
			  }//النهايه
