package backend;

import java.lang.ref.SoftReference;
import java.util.ArrayList;

public class Client {
    private String name, address, dateOfBirth, emailAddress;
    private ArrayList<Book> booksBorrowed;


    public Client(String name, String address, String dateOfBirth, String emailAddress) {
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.emailAddress = emailAddress;



    }

    public String getName() {
        return name;
    }
    public String getAddress(){
        return address;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getDateOfBirth(){
        return dateOfBirth;
    }

    //Devrait trouver le livre avec un id unique du livre

    public void borrowBooks(Book newBook){
        booksBorrowed.add(newBook);

    }





}
