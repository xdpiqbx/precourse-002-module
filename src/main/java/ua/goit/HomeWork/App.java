package ua.goit.HomeWork;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import ua.goit.HomeWork.models.CommentModel;
import ua.goit.HomeWork.models.PostModel;
import ua.goit.HomeWork.models.UserModel;

import java.io.*;
import java.lang.reflect.Type;
import java.util.List;

public class App {
    public static void main(String[] args) {
        try {
//            createNewObj(); // Task 1.1
//            updateObjById(3); // Task 1.2
//            deleteObj(); // Task 1.3
//            getDataAllUsers(); // Task 1.4
//            getUserById(4); // Task 1.5
//            getUserByUserName("Antonette"); // Task 1.6

            lastCommentToUserPost(4);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Задание 1

    // 1.1
    //- создание нового объекта. Возможно, вы не увидите обновлений на сайте.
    // Метод создания работает правильно, если в ответ на JSON с объектом вернулся такой же JSON,
    // но с полем id со значением на 1 больше, чем самый большой id на сайте.
    public static void createNewObj() throws IOException {
        Fetch fetch = new Fetch("/users", Fetch.METHOD.POST);

        UserModel user = new UserModel();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        fetch.addPayload(gson.toJson(user));

        System.out.println("HTTP status code = " + fetch.responseStatusCode());

        UserModel userResponse = gson.fromJson(fetch.getResponseData(), UserModel.class);
        System.out.println(gson.toJson(userResponse));
    }

    // 1.2
    // обновление объекта. Возможно, обновления не будут видны на сайте напрямую.
    // Будем считать, что метод работает правильно, если в ответ на запрос придет обновленный JSON
    // (он должен быть точно таким же, какой вы отправляли).
    public static void updateObjById(int id) throws IOException {
        Fetch fetch = new Fetch("/users/"+id, Fetch.METHOD.PUT);

        UserModel user = new UserModel();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        fetch.addPayload(gson.toJson(user));

        System.out.println("HTTP status code = " + fetch.responseStatusCode());

        UserModel userResponse = gson.fromJson(fetch.getResponseData(), UserModel.class);
        System.out.println(gson.toJson(userResponse));
    }
    // 1.3
    // удаление объекта. Здесь будем считать корректным результат
    // - статус из группы 2хх в ответ на запрос.
    public static void deleteObj() throws IOException {
        Fetch fetch = new Fetch("/users/5", Fetch.METHOD.DELETE);
        System.out.println("HTTP status code = " + fetch.responseStatusCode());
    }

    // 1.4
    // получение информации обо всех пользователях
    public static void getDataAllUsers() throws IOException {
        Fetch fetch = new Fetch("/users", Fetch.METHOD.GET);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        System.out.println("HTTP status code = " + fetch.responseStatusCode());

        Type listType = new TypeToken<List<UserModel>>(){}.getType();

        List <UserModel> userResponse = gson.fromJson(fetch.getResponseData(), listType);
        for (UserModel userModel : userResponse) {
            System.out.println(gson.toJson(userModel));
        }
    }

    // 1.5
    // получение информации о пользователе с определенным id
    public static void getUserById(int id) throws IOException {
        Fetch fetch = new Fetch("/users/"+id, Fetch.METHOD.GET);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        System.out.println("HTTP status code = " + fetch.responseStatusCode());

        UserModel userResponse = gson.fromJson(fetch.getResponseData(), UserModel.class);
        System.out.println(gson.toJson(userResponse));
    }

    // 1.6
    // получение информации о пользователе с опредленным username
    public static void getUserByUserName(String username) throws IOException {
        Fetch fetch = new Fetch("/users?username="+username, Fetch.METHOD.GET);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        System.out.println("HTTP status code = " + fetch.responseStatusCode());

        Type listType = new TypeToken<List<UserModel>>(){}.getType();

        List <UserModel> userResponse = gson.fromJson(fetch.getResponseData(), listType);
        for (UserModel userModel : userResponse) {
            System.out.println(gson.toJson(userModel));
        }
    }

    // Задание 2
    // Дополните программу методом, который будет выводить
    // все комментарии к последнему посту определенного пользователя и записывать их в файл.

    public static void lastCommentToUserPost(int userId) throws IOException {
        // Get posts
        Fetch fetchUserPosts = new Fetch("/users/"+userId+"/posts", Fetch.METHOD.GET);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        System.out.println("HTTP status code = " + fetchUserPosts.responseStatusCode());
        Type listTypePosts = new TypeToken<List<PostModel>>(){}.getType();
        List <PostModel> postsResponse = gson.fromJson(fetchUserPosts.getResponseData(), listTypePosts);
        int lastPostId = postsResponse.get(postsResponse.size() - 1).getId();

        // Get comments
        Fetch fetchComments = new Fetch("/posts/"+lastPostId+"/comments", Fetch.METHOD.GET);
        Type listTypeComments = new TypeToken<List<CommentModel>>(){}.getType();
        // prettyfy JSON
        Object o = gson.fromJson(fetchComments.getResponseData(), listTypeComments);
        String s = gson.toJson(o, listTypeComments);

        // write json to file
        String sep = File.separator;
        String path = "."+sep+"src"+sep+"main"+sep+"java"+sep+"ua"+sep+"goit"+sep+"HomeWork"+sep+"jsonFiles"+sep;
        File file = new File(path);
        file.mkdir();
        String fileName = "user-"+userId+"-post-"+lastPostId+"-comments.json";
        try (PrintWriter out = new PrintWriter(file.getPath()+sep+fileName)) {
            out.println(s);
        }
    }
}

