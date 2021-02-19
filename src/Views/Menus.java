package Views;

import Entities.Book;
import Entities.Document;
import Entities.Journal;
import Entities.Newspaper;

import java.util.Scanner;

public class Menus {
    static Scanner input = new Scanner(System.in);

    public static Document getDocumentInfo(){
        System.out.println("--------------------");
        System.out.println("Enter Document's Id:");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("Enter Document's Publisher:");
        String publisher = input.nextLine();
        System.out.println("Enter Document's Issue Number:");
        String issueNumber = input.nextLine();
        System.out.println("Choose type of document");
        System.out.println("1. Book");
        System.out.println("2. Journal");
        System.out.println("3. Newspaper");
        int choice = Integer.parseInt(input.nextLine());
        if(choice == 1){
            System.out.println("Enter Author's Name:");
            String author = input.nextLine();
            System.out.println("Enter Number Of Pages:");
            int numberOfPage = Integer.parseInt(input.nextLine());
            Book book = new Book(id, publisher, issueNumber, author, numberOfPage);
            return book;
        } else if(choice == 2){
            System.out.println("Enter Issue Time:");
            String issueTime = input.nextLine();
            System.out.println("Enter Number Of Pages:");
            int numberOfPage = Integer.parseInt(input.nextLine());
            Journal journal = new Journal(id, publisher, issueNumber, issueTime, numberOfPage);
            return journal;
        } else if(choice == 3){
            System.out.println("Enter Issue Time:");
            String issueTime = input.nextLine();
            Newspaper newspaper = new Newspaper(id, publisher, issueNumber, issueTime);
            return newspaper;
        } else {
            System.out.println("Try again !");
            return null;
        }
    }
}
