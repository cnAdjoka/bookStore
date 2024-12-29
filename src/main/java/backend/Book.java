package backend;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

import static java.lang.StringTemplate.STR;

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
    private static int numberOfBooks;
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

    //Getter and Setters for the book attributes
    public void setTitle(String title) {this.title = title;}

    public String getTitle(){return title;}

    public void setAuthor (String author){this.author = author;}

    public String getAuthor(){return author;}

    public void setNumberOfPages (int numOfPages){this.numberOfPages = numOfPages;}

    public int getNumberOfPages(){return numberOfPages;}

    public void setYearOfPublish(int yearOfPublish) {this.yearOfPublish = yearOfPublish;}

    public int getYearOfPublish(){return yearOfPublish;}

    public void setISBN(long isbn){this.ISBN = isbn;}

    public long getISBN(){return ISBN;}

    /**
     * Function that adds the Book to the Book inventory database (sadly rn it's just a fucking text file)
     *
     * @throws IOException
     *
     *
     */
    public void addToInventory() throws IOException {
        inventoryInfo = ("Tit: " + title + "," + "Aut: " + author + "," + "numPa: " + numberOfPages + ","+"yeaPu" + yearOfPublish + "," +"isbn" + ISBN  );


        try {
            FileWriter wr = new FileWriter("dataBase/file.txt");
            BufferedWriter bw = new BufferedWriter(wr);

            bw.write(inventoryInfo);
            bw.close();
        } catch (IOException e) {
            System.out.print("Error: Database file not found");
        }

    }



    public static int getNumberOfBooks() {
        return numberOfBooks;
    }

    //Devrait generer un book id pour que l'on puisse retrouver manipuler les livres avec
    public String generateBookid() {
        Random id = new Random(this.ISBN);
        System.out.print(id);
        return ("poo");




    }
}

