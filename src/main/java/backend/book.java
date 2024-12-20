package backend;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/***
 * The book class creates a book object that the librarian can access, they can :
 * -Add books to the inventory
 * - Add books to the account of a client that borrows it
 * - Check their availability in the store
 */
public class book {
    private String title, author;
    private int numberOfPages, yearOfPublish;
    private Long ISBN;
    private String inventoryInfo;
    private boolean availability;


    public book(String title, String author, int numberOfPages, int yearOfPublish, long ISBN){
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.yearOfPublish = yearOfPublish;
        this.ISBN = ISBN;
        this.availability = true;
    }

    /**
     * Function that adds the book to the book inventory database (sadly rn it's just a fucking text file)
     * @throws IOException
     */
    public void addToInventory() throws IOException {
        inventoryInfo = (STR."""
        Titre: \{title},Author: \{author}, pages: \{numberOfPages},Publish Year : \{yearOfPublish}isbn: \{ISBN}
        """);

        try{
            FileWriter wr = new FileWriter("dataBase/file.txt");
            BufferedWriter bw = new BufferedWriter(wr);

            bw.write(inventoryInfo);
            bw.close();
        } catch (IOException e) {
            System.out.print("Error: Data base file not found");
        }

    }

}
