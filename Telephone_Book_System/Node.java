package Telephone_Book_System;

public class Node {
    Person person;
    Node next;
  
  public Node(Person person) {
    this.person = person;
    this.next = null;
  }
 }
