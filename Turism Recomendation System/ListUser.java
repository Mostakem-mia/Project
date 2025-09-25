
package tourist;

import java.util.ArrayList;


public class ListUser {
  public static ArrayList<User> getUsers() {
        ArrayList<User> list = new ArrayList<>();
        User u1 = new User(1, "National Museum", "museum.jpg", "Botanical Garden", "garden.jpg", 13, 30);
        User u2 = new User(2, "Jatiyo Sangsad Bhaban", "parliament.jpg", "National Museum", "museum.jpg", 4, 20);
        User u3 = new User(3, "Lalbagh Fort", "Lalbagh.jpg", "National Museum", "museum.jpg", 3, 40);
        User u4 = new User(4, "Ahsan Manzil", "ahsan.jpg", "Lalbagh Fort", "Lalbagh.jpg", 2, 10);
        User u5 = new User(5, "Botanical Garden", "garden.jpg", "Jatiyo Sangsad Bhaban", "parliament.jpg", 8, 10);
        User u6 = new User(6, "Dhakeshwari Temple", "temple.jpg", "Lalbagh Fort", "Lalbagh.jpg", 1, 65);
        list.add(u1);
        list.add(u2);
        list.add(u3);
        list.add(u4);
        list.add(u5);
        list.add(u6);
        return list;
    }  
}
