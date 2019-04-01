package blog;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Blog {
    private List<User> userList;
    private List<Post> postList;

    public Blog() {
        userList = new ArrayList<>();
        postList = new ArrayList<>();
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public void publishPost(int userId, String content){
        User userToFind = getUserById(userId);

        Post post = new Post(postList.size() + 1, new Date(), userToFind, content);
        postList.add(post);
    }

    public void commentPost(int userId, int postId, String content){
        User userToFind = getUserById(userId);
        Post postToFind = findPostById(postId);

        Comment comment = new Comment(postToFind.getCommentList().size() +  1, new Date(), userToFind, content);
        postToFind.addComment(comment);
    }

    public void displayUserEntries(int userId){
        for (Post post : postList) {
            if(post.getAuthor().getId() == userId){
                System.out.println("POST: " + post);
            }

            for (Comment comment : post.getCommentList()) {
                if(comment.getAuthor().getId() == userId){
                    System.out.println("COMMENT: " + comment);
                }
            }
        }
    }

    private Post findPostById(int postId) {
        Post postToFind = null;
        for (Post post : postList) {
            if (post.getId() == postId) {
                postToFind = post;
            }
        }
        return postToFind;
    }

    private User getUserById(int userId) {
        User userToFind = null;
        for (User user : userList) {
            if (user.getId() == userId) {
                userToFind = user;
            }
        }
        return userToFind;
    }


}
