package blog;

import java.util.Date;

public abstract class Entry {
    private int id;
    private Date postedDate;
    private User author;
    private String content;

    public Entry(int id, Date postedDate, User author, String content) {
        this.id = id;
        this.postedDate = postedDate;
        this.author = author;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(Date postedDate) {
        this.postedDate = postedDate;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "id=" + id +
                ", postedDate=" + postedDate +
                ", author=" + author +
                ", content='" + content + '\'' +
                '}';
    }
}