package backend;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/***
 * The Book class creates a Book object that the librarian can access, they can :
 * -Add books to the inventory
 * - Add books to the account of a Client that borrows it
 * - Check their availability in the store
 */
public class Book {
    private String title, author;
    private int numberOfPages, yearOfPublish, bookid;
    private Long ISBN;
    private String inventoryInfo;
    private boolean availability;
    private int numberOfBooks;
    private Random bookId;


    public Book(String title, String author, int numberOfPages, int yearOfPublish, long ISBN) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.yearOfPublish = yearOfPublish;
        this.ISBN = ISBN;
        this.availability = true;
        numberOfBooks++;

    }

    /**
     * Function that adds the Book to the Book inventory database (sadly rn it's just a fucking text file)
     *
     * @throws IOException
     */
    public void addToInventory() throws IOException {
        inventoryInfo = (STR."""
        Titre: \{title},Author: \{author}, pages: \{numberOfPages},Publish Year : \{yearOfPublish}isbn: \{ISBN}
        """);

        try {
            FileWriter wr = new FileWriter("dataBase/file.txt");
            BufferedWriter bw = new BufferedWriter(wr);

            bw.write(inventoryInfo);
            bw.close();
        } catch (IOException e) {
            System.out.print("Error: Data base file not found");
        }

    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    //Devrait generer un book id pour que l'on puisse retrouver manipuler les livres avec
    private int generateBookid() {
        Random id = new Random(this.ISBN);

    }
}
