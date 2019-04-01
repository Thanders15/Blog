package blog;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post extends Entry {
    private List<Comment> commentList;

    public Post(int id, Date postedDate, User author, String content) {
        super(id, postedDate, author, content);

        commentList = new ArrayList<>();
    }

    public void addComment(Comment comment) {
        commentList.add(comment);
    }

    public List<Comment> getCommentList() {
        return commentList;
    }
}