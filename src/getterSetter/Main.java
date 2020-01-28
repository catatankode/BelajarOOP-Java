package getterSetter;

public class Main {
    public static void main(String[] args){
        // membuat objek daari kelas user
        User sian = new User();

        // menggunakan method setter
        sian.setUsername("Gloria");
        sian.setPassword("s1@N");

        // menggunakan method getter
        System.out.println("Username : " + sian.getUsername());
        System.out.println("Password : " + sian.getPassword());
    }
}
