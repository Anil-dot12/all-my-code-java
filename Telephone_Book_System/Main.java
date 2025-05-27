package Telephone_Book_System;
import java.util.Scanner;

public class Main{
 public static void main(String[] args) {
	 Telephone_Address_Book phoneBook = new Telephone_Address_Book();
   Scanner input = new Scanner(System.in);
   int choice = 0;
   while (choice != 7) {
     System.out.println("Phone Book Menu");
     System.out.println("1. Add person details into the telephone book.");
     System.out.println("2. Remove a person from the telephone book.");
     System.out.println("3. Update a telephone number by providing person first name.");
     System.out.println("4. Display the entire telephone book.");
     System.out.println("5. Search a telephone number based on person first name.");
     System.out.println("6. Sort the entire telephone book.");
     System.out.println("7. Exit the program.");
     System.out.print("Enter your choice: ");
     choice = input.nextInt();
     input.nextLine();
     switch (choice) {
     case 1 : 
       System.out.println("Enter first name: ");
       String firstName = input.nextLine();
       System.out.println("Enter last name: ");
       String lastName = input.nextLine();
       System.out.println("Enter phone number: ");
       String phoneNumber = input.nextLine();
       System.out.println("Enter city: ");
       String city = input.nextLine();
       System.out.println("Enter address: ");
       String address = input.nextLine();
       System.out.println("Enter Gender: ( F / M ) ");
       char Gender = input.next().charAt(0);
       System.out.println("Enter Email: ");
       String email = input.nextLine();
        email  = input.nextLine();
       phoneBook.addPerson(new Person(firstName, lastName,phoneNumber, city, address, Gender,email));
       break;
       
     
     case 2: 
       System.out.println("Enter the phone number of the person to remove: ");
       String rphone = input.nextLine();
       phoneBook.deletePerson(rphone);
       System.out.println("Person Information Deleted \n");
       break;
     
     case 3: 
       System.out.println("Enter the first name of the person to update: ");
       String updateFirstName = input.nextLine();
       System.out.println("Enter the new phone number: ");
       String newPhoneNumber = input.nextLine();
       phoneBook.updatePhoneNumber(updateFirstName, newPhoneNumber);
       System.out.println("Person Information Updated \n");
       break;
     
     case 4:
    	 phoneBook.displayPhoneBook();
    	 break;
     case 5: 
       System.out.println("Enter the first name of the person to search: ");
       String searchFirstName = input.nextLine();
       phoneBook.searchPhoneNumber(searchFirstName);
       break;
     case 6:
    	 phoneBook.selectionSort();
    	 break;
     case 7:
        System.out.println("Exiting the program...");
        System.exit(0);
     break;
     
     default:
    	 System.out.println("Invalid choice. Please enter a number between 1 and 7.");
    	 break;}
     }}}
