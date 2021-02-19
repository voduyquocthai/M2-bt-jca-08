package Behaviors;

import Entities.Book;
import Entities.Document;
import Entities.Journal;
import Entities.Newspaper;

import javax.print.Doc;
import java.util.ArrayList;

public class DocumentManagement {

    ArrayList<Document> documents = new ArrayList<>();

    public void add(Document d){
        documents.add(d);
    }

    public void delete(int id){
        documents.removeIf(d -> d.getId() == id);
    }

    public Document search(int id){
        Document document = null;
        for (Document d: documents) {
            if(d.getId() == id){
                document = d;
            }
        }
        return document;
    }

    public ArrayList<Document> search(String typeOfDocument){
        ArrayList<Document> returnDocuments = new ArrayList<>();
        String type = typeOfDocument;
        switch (type){
                case "book":
                    for (Document d: documents) {
                        if(d instanceof Book){
                            returnDocuments.add(d);
                        }
                    }
                    break;
                case "journal":
                    for (Document d: documents) {
                        if(d instanceof Journal){
                            returnDocuments.add(d);
                        }
                    }
                    break;
                case "newspaper":
                    for (Document d: documents) {
                        if(d instanceof Newspaper){
                            returnDocuments.add(d);
                        }
                    }
                    break;
            }
        return returnDocuments;
    }

    public void showAllDocumentInfo(){
        for (Document d:documents) {
            System.out.println(d.toString());
        }
    }

    public void updateDocument(Book b){
        for (Document d: documents){
            if(d instanceof Book){
                if(d.getId() == b.getId()){
                    d.setPublisher(b.getPublisher());
                    d.setIssueNumber(b.getIssueNumber());
                    ((Book) d).setAuthorName(b.getAuthorName());
                    ((Book) d).setNumberOfPage(b.getNumberOfPage());
                }
            }
        }
    }
    public void updateDocument(Journal j){
        for (Document d: documents){
            if(d instanceof Journal){
                if(d.getId() == j.getId()){
                    d.setPublisher(j.getPublisher());
                    d.setIssueNumber(j.getIssueNumber());
                    ((Journal) d).setIssueTime(j.getIssueTime());
                    ((Journal) d).setNumberOfPage(j.getNumberOfPage());
                }
            }
        }
    }
    public void updateDocument(Newspaper n){
        for (Document d: documents){
            if(d instanceof Newspaper){
                if(d.getId() == n.getId()){
                    d.setPublisher(n.getPublisher());
                    d.setIssueNumber(n.getIssueNumber());
                    ((Newspaper) d).setIssueTime(n.getIssueTime());
                }
            }
        }
    }
}
