package Views;

import Behaviors.DocumentManagement;
import Entities.Book;
import Entities.Document;
import Entities.Journal;
import Entities.Newspaper;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    static Scanner input = new Scanner(System.in);
    static DocumentManagement dm =  new DocumentManagement();

    public static void main(String[] args) {
        do {
            System.out.println("-----Document Management-----");
            System.out.println("1. Add");
            System.out.println("2. Delete");
            System.out.println("3. Search By Id");
            System.out.println("4. Search By Type");
            System.out.println("5. Show All Document");
            System.out.println("6. Update By Id");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice){
                case 1:
                    Document document = Menus.getDocumentInfo();
                    dm.add(document);
                    break;
                case 2:
                    System.out.println("Enter Id:");
                    int id = Integer.parseInt(input.nextLine());
                    dm.delete(id);
                    break;
                case 3:
                    System.out.println("Enter Id:");
                    int id1 = Integer.parseInt(input.nextLine());
                    System.out.println(dm.search(id1).toString());
                    break;
                case 4:
                    System.out.println("Enter Type:");
                    String type = input.nextLine();
                    ArrayList<Document> resultDocuments = dm.search(type);
                    for (Document d: resultDocuments) {
                        System.out.println(d.toString());
                    }
                    break;
                case 5:
                    dm.showAllDocumentInfo();
                    break;
                case 6:
                    System.out.println("Enter type of document you want to update");
                    System.out.println("1. Book");
                    System.out.println("2. Journal");
                    System.out.println("3. Newspaper");
                    int choice1 = Integer.parseInt(input.nextLine());
                    switch (choice1){
                        case 1:
                            Document d = Menus.getDocumentInfo();
                            dm.updateDocument((Book) d);
                            break;
                        case 2:
                            Document d1 = Menus.getDocumentInfo();
                            dm.updateDocument((Journal) d1);
                            break;
                        case 3:
                            Document d2 = Menus.getDocumentInfo();
                            dm.updateDocument((Newspaper) d2);
                            break;
                    }
                    break;
                default:
                    continue;
            }
        } while (true);
    }
}
