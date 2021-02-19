package Entities;

public class Journal extends Document{

    private String issueTime;

    private int numberOfPage;

    public Journal() {
    }

    public Journal(int id, String publisher, String issueNumber, String issueTime, int numberOfPage) {
        super(id, publisher, issueNumber);
        this.issueTime = issueTime;
        this.numberOfPage = numberOfPage;
    }

    public String getIssueTime() {
        return issueTime;
    }

    public void setIssueTime(String issueTime) {
        this.issueTime = issueTime;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    @Override
    public String toString() {
        return "Journal{" + super.toString() +
                "issueTime='" + issueTime + '\'' +
                ", numberOfPage=" + numberOfPage +
                '}';
    }
}
