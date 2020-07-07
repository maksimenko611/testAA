package application.model;

import application.userObjects.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Model {
    private static Model instance = new Model();

    private List<User> model;

    public static Model getInstance() {
        return instance;
    }

    private Model() {
        model = new ArrayList<>();
    }

    public void add(User user) {
        model.add(user);
    }

    public List<String> list() {
        List<String> collect = model.stream()
                .map(user::getToken)
                .collect(Collectors.toList());
        return collect;
    }
}