package backend;

import java.util.ArrayList;

/***
 * This method allows books to be stored a
 *
 */

public class MetaData {
    private ArrayList<Book> shelf;
    private  ArrayList<Client> allClients;

    public MetaData(){}

    public void addBookToShelf(Book b){
        shelf.add(b);
    }

    public void addAsClient (Client c){
        allClients.add(c);
    }







}
