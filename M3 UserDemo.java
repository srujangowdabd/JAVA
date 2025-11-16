class User {
    String username;
    String email;
    int followers;

    // Constructor
    User(String username, String email, int followers) {
        this.username = username;
        this.email = email;
        this.followers = followers;
    }

    // Method to post a photo
    void postPhoto(String photoDescription) {
        System.out.println(username + " posted a photo: " + photoDescription);
    }

    // Method to display user info
    void displayInfo() {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Followers: " + followers);
    }
}

// Main class
public class UserDemo {
    public static void main(String[] args) {

        // Creating a user object
        User u1 = new User("Lakshmi", "lakshmi@example.com", 150);

        // Display user details
        u1.displayInfo();

        // Posting a photo
        u1.postPhoto("Sunset at the beach 🌅");
    }
}
