package Entities;

public class Document {

    private int id;

    private String publisher;

    private String issueNumber;

    public Document() {
    }

    public Document(int id, String publisher, String issueNumber) {
        this.id = id;
        this.publisher = publisher;
        this.issueNumber = issueNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(String issueNumber) {
        this.issueNumber = issueNumber;
    }

    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", publisher='" + publisher + '\'' +
                ", issueNumber='" + issueNumber + '\'' +
                '}';
    }
}
