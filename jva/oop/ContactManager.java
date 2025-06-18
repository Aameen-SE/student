package jva.oop;

import java.util.ArrayList;
import java.util.Iterator;

//Implement a ContactManager to handle a contact list (name, phone). Provide add, view, delete.
class Contact{
    private long number;
    private String name;

    public Contact(long number,String name){
        this.number=number;
        this.name=name;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display(){
        System.out.println("Name : "+name+"\nContactNumber :  "+number+"\n-------");
    }
}

class ContactService{
    private ArrayList<Contact> contactList = new ArrayList<>();

    public void add(long number,String name){
        contactList.add(new Contact(number,name));
        System.out.println("Contact added successfully... \n -----------------");
    }

    public void viewList(){
        if(contactList.isEmpty()){
            System.out.println("List is empty....");
        }else {
            for (Contact c: contactList){
                c.display();
            }
        }
    }

    public void delete(String name){
        boolean found = false;
        Iterator<Contact> iterator = contactList.iterator();

        while (iterator.hasNext()){
            Contact c = iterator.next();
            if (c.getName().equals(name)){
                iterator.remove();
                found=true;
                System.out.println("Contact deleted sucessfully\n---------");
                break;
            }
        }

        if(!found)
            System.out.println("No contact available ");
    }


}
public class ContactManager {
    public static void main(String[] args) {
    ContactService contact = new ContactService();
    contact.viewList();
    contact.add(6290543434l,"Aameen");
        contact.add(97480816l,"Aamin");
        contact.viewList();
        contact.delete("Aamin");
        contact.viewList();
    }
}
