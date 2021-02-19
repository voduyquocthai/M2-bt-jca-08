package Entities;

public class Book extends Document{

    private String authorName;

    private int numberOfPage;

    public Book() {
    }

    public Book(int id, String publisher, String issueNumber, String authorName, int numberOfPage) {
        super(id, publisher, issueNumber);
        this.authorName = authorName;
        this.numberOfPage = numberOfPage;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    @Override
    public String toString() {
        return "Book{" + super.toString() +
                "authorName='" + authorName + '\'' +
                ", numberOfPage=" + numberOfPage +
                '}';
    }
}
