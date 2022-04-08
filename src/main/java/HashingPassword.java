import org.mindrot.jbcrypt.BCrypt;

public class HashingPassword {
    public static void main(String[] args) {
//        String password = "password123";
//        String hash = BCrypt.hashpw(password, BCrypt.gensalt());
//        System.out.println(hash);
// Output: $2a$10$TbjLzPRB1MBIQAQbFsmANOumLP0oOEU1b.MvZFkeqIG0D8RqzFbIq

        // 
        String password = "supersercetpw";

        // HASH-SALT PASSWORD
        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());
        System.out.println("password = " + password);
        System.out.println("hashedPassword = " + hashedPassword);


        // PASSWORD CHECK
        boolean passwordsMatch = BCrypt.checkpw("supersercetpassword", hashedPassword);
        System.out.println("passwordsMatch = " + passwordsMatch);

        passwordsMatch = BCrypt.checkpw("supersercetpw", hashedPassword);
        System.out.println("passwordsMatch (second time) = " + passwordsMatch);
    }


}
