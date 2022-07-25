package LessonByMelnichuk.optionalTests;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

public class UserService {
    private Collection<User> users;
    public UserService(){
        users = new ArrayList<>();
        this.addUser("john@gmail.com", "John Doe");
        this.addUser("bill@gmail.com", "Bill Rock");
    }
    private void addUser(String email, String name){
        users.add(new User(email, name));
    }
//    public User findByEmail(String email){
//        for(User user: users){
//            if(user.getEmail().equals(email)){
//                return user;
//            }
//        }
//        return null;
//    }

    public Optional <User> findByEmail(String email){
        for(User user: users){
            if(user.getEmail().equals(email)){
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }
}
