package dao;
import models.User;

import java.util.ArrayList;
import java.util.List;

//public class ListUsersDao implements Users {
//
//    private List<User> users;
//
//
//    @Override
//    public User findByUsername(String username) {
//        return findByUsername("");
//    }
//
//    public Long insert(User user) {
//        // make sure we have ads
//        if (users == null) {
//            users = generateUsers();
//        }
//        // we'll assign an "id" here based on the size of the ads list
//        // really the dao would handle this
////        users.setId((long) users.size());
//        users.add(user);
//        return user.getId();
//    }
//
//    private List<User> generateUsers() {
//        List<User> users = new ArrayList<>();
//        users.add(new User(
//                1,
//                "chestercheetos",
//                "chester@email.com",
//                "mypassword"
//        ));
//        users.add(new User(
//                2,
//                "jimmy",
//                "jimmy@email.com",
//                "thispassword"
//        ));
//        users.add(new User(
//                3,
//                "kelly",
//                "kelly@email.com",
//                "anotherpassword"
//        ));
//        users.add(new User(
//                4,
//                "milly",
//                "milly@email.com",
//                "strongpassword"
//        ));
//        return users;
//    }
//}
