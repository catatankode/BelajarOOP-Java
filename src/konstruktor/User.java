package konstruktor;

public class User {
    public String password;
    public String username;

    public User(String username, String password){
        this.username = username;
        this.password = password;
        System.out.println("eksekusi method constructor...");
    }
}

class DemoConstructor{
    public static void main(String[] args){
        User catatan = new User("catatankode", "catatan");
        System.out.println("username: "+ catatan.username);
        System.out.println("password: "+ catatan.password);
    }
}
