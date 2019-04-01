package blog;

import java.util.Date;

public class Comment extends Entry {
    public Comment(int id, Date postedDate, User author, String content) {
        super(id, postedDate, author, content);
    }
}