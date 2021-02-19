package Entities;

public class Newspaper extends Document{

    private String issueTime;

    public Newspaper() {
    }

    public Newspaper(int id, String publisher, String issueNumber, String issueTime) {
        super(id, publisher, issueNumber);
        this.issueTime = issueTime;
    }

    public String getIssueTime() {
        return issueTime;
    }

    public void setIssueTime(String issueTime) {
        this.issueTime = issueTime;
    }

    @Override
    public String toString() {
        return "Newspaper{" + super.toString() +
                "issueTime='" + issueTime + '\'' +
                '}';
    }
}
