package ua.goit;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        User user = new User("Ihor", "Mykhailychenko");
        String json = gson.toJson(user);

        System.out.println(json);
    }
}
