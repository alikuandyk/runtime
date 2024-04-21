package lesson45.homework;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

public class Test {
    // GET /users
    // POST /users
    // GET /users/{userId}

    // POST /users/{userId}/posts
    // GET /users/{userId}/posts
    public static void main(String[] args) throws IOException {
        User user1 = new User("ali");
        Post post1 = new Post("holiday", "test");

        user1.addPost(post1);

        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
        server.createContext("/users", new RequestHandler());
        server.start();
    }
}
