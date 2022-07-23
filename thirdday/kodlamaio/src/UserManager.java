import java.util.ArrayList;
import java.util.List;

public class UserManager {
    List<User> users;

    public UserManager(){
        users = new ArrayList<>();
    }

    public void add(User user){
        if (!checkIfUserExists(user.getId())) {
            users.add(user);
        }
        else {
            System.out.println("Bu kullanıcı mevcut!");
        }
    }

    public void delete(User user){
        if (checkIfUserExists(user.getId())) {
            users.remove(user);
        }
        else {
            System.out.println("Kullanıcı bulunamadı");
        }
    }

    public List<User> getAllUsers() {
        return users;
    }

    private boolean checkIfUserExists(int id){
        boolean isExists = false;
        for (User user : users){
            if (user.getId() == id) {
                isExists = true;
            }
        }
        return isExists;
    }
}
