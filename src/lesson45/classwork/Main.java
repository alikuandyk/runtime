package lesson45.classwork;

import com.google.gson.Gson;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class Main {
    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        server.createContext("/users", exchange -> {
            String method = exchange.getRequestMethod();
            String result;

            if (method.equals("GET")) {
                result = "Вы зашли на путь /products через метод GET";
            } else if (method.equals("POST")) {
                result = "Вы зашли на путь /products через метод POST";

                InputStream os = exchange.getRequestBody();
                String requestBody = new String(os.readAllBytes());

                User user = gson.fromJson(requestBody, User.class);
                System.out.println(user);
            } else {
                result = "Не поддерживается метод " + method;
            }

            exchange.sendResponseHeaders(200, 0);
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(result.getBytes());
            }
        });

        server.start();
    }
}

class User {
    String name;
    int age;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
