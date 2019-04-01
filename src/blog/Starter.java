package blog;

public class Starter {
    public static void main(String[] args) {
        User user = new User(1, "Adam", "Podoluch", "Thunders");
        User user2 = new User(2, "Przemysław", "Rusin", "NAiZ");
        User user3 = new User(3, "Michał", "Nowak", "Nowaczek");
        Blog blog = new Blog();

        blog.addUser(user);
        blog.addUser(user2);
        blog.addUser(user3);

        blog.publishPost(user.getId(), "To, że milczę, nie znaczy, że nie mam nic do powiedzenia.");
        blog.publishPost(user2.getId(), "Lepiej zaliczać się do niektórych, niż do wszystkich.");

        blog.commentPost(user.getId(), 1, "Alez piekne slowa!");
        blog.commentPost(user2.getId(), 1, "Pewnie to jakiś cytat z internetu, pff");
        blog.commentPost(user3.getId(), 2, "To chyba z wiedźmina");
        blog.commentPost(user2.getId(), 2, "Tak, to z książki krew elefów!");

        blog.displayUserEntries(user.getId());
        blog.displayUserEntries(user2.getId());
        blog.displayUserEntries(user3.getId());

    }
}