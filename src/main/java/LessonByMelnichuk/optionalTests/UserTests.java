package LessonByMelnichuk.optionalTests;

import java.util.Optional;

public class UserTests {
    public static void main(String[] args) {
        UserService userService = new UserService();

        // User user = userService.findByEmail("john@gmail.com");
        Optional<User> optionalUser = userService.findByEmail("john@gmail.com");

//        if(optionalUser.isPresent()){
//            System.out.println("optionalUser.get() = " + optionalUser.get());
//        }else{
//            System.out.println("No user");
//        }

//        User user = null;
//        if(optionalUser.isPresent()){
//            user = optionalUser.get();
//        }else{
//            user = new User("default@gmail.com", "Default User");
//        }

//        User user = optionalUser.orElse(new User("default@gmail.com", "Default User"));
        User user = optionalUser.orElseGet(() -> new User("default@gmail.com", "Default User"));

        optionalUser.ifPresentOrElse(
                (u)-> System.out.println("ifPresentOrElse: " + u),
                ()-> System.out.println("No user found")
        );

        System.out.println("user = " + user);

        System.out.println("optionalUser.isPresent() = " + optionalUser.isPresent());

        System.out.println("optionalUser = " + optionalUser);
    }
}
