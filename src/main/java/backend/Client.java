package backend;
import java.time.LocalDate;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Client {
    private String name, address, dateOfBirth;
    private ArrayList<Book> booksBorrowed;


    public Client(String name, String address, String dateOfBirth) {
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;

    }
//Devrait trouver le livre avec un id unique du livre



    private void borrowBooks(Book newBook){
        booksBorrowed.add(newBook);

    }


}
