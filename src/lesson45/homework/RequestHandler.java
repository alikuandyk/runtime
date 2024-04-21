package lesson45.homework;

import com.google.gson.Gson;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RequestHandler implements HttpHandler {
    private final Map<Long, User> users = new HashMap<>();
    private final Gson gson = new Gson();

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        Endpoint endpoint = getEndpoint(exchange);
        switch (endpoint) {
            case GET_USERS -> {
                exchange.sendResponseHeaders(200, 0);
                try (OutputStream os = exchange.getResponseBody()) {
                    os.write(gson.toJson(users.values()).getBytes());
                }
            }
            // 200 OK
            // 201 CREATED
            case POST_USER -> {
                String requestBody = new String(exchange.getRequestBody().readAllBytes());
                User newUser = gson.fromJson(requestBody, User.class);
                users.put(newUser.getId(), newUser);

                exchange.sendResponseHeaders(201, 0);
            }
            case GET_SINGLE_USER -> {
                String userIdString = exchange.getRequestURI().getPath().replaceAll("/users/", "");
                long userId = Long.parseLong(userIdString);
                User user = users.get(userId);
                if (user != null) {
                    exchange.sendResponseHeaders(200, 0);
                    try (OutputStream os = exchange.getResponseBody()) {
                        os.write(gson.toJson(user).getBytes());
                    }
                } else {
                    exchange.sendResponseHeaders(404, 0);
                }
            }
            case POST_USER_POST -> {
                String requestBody = new String(exchange.getRequestBody().readAllBytes());

                Post newPost = gson.fromJson(requestBody, Post.class);

                String userIdString = exchange.getRequestURI().getPath().replaceAll("/users/(\\d+)/posts", "$1");
                long userId = Long.parseLong(userIdString);

                User user = users.get(userId);
                if (user != null) {
                    List<Post> userPosts = user.getPosts();
                    userPosts.add(newPost);

                    exchange.sendResponseHeaders(201, 0);
                } else {
                    exchange.sendResponseHeaders(404, 0);
                }
            }
            case GET_USER_POSTS -> {
                String userIdString = exchange.getRequestURI().getPath().replaceAll("/users/\\d+/posts", "");
                long userId = Long.parseLong(userIdString);
                User user = users.get(userId);
                if (user != null) {
                    List<Post> userPosts = user.getPosts();
                    exchange.sendResponseHeaders(200, 0);
                    try (OutputStream os = exchange.getResponseBody()) {
                        os.write(gson.toJson(userPosts).getBytes());
                    }
                } else {
                    exchange.sendResponseHeaders(404, 0);
                }
            }
            case UNKNOWN -> exchange.sendResponseHeaders(404, 0);
        }
    }

    private Endpoint getEndpoint(HttpExchange exchange) {
        // TODO: разобрать строку и узнать на какой путь ссылается пользователь
        String url = exchange.getRequestURI().getPath();
        String method = exchange.getRequestMethod();
        // GET /users/{}
        if (method.equals("GET")) {
            if (url.equals("/users")) {
                return Endpoint.GET_USERS;
            } else if (url.matches("/users/\\d+")) {
                return Endpoint.GET_SINGLE_USER;
            } else if (url.matches("/users/\\d+/posts")) {
                return Endpoint.GET_USER_POSTS;
            } else {
                return Endpoint.UNKNOWN;
            }
        } else if (method.equals("POST")) {
            if (url.equals("/users")) {
                return Endpoint.POST_USER;
            } else if (url.startsWith("/users/") && url.endsWith("/posts")) {
                return Endpoint.POST_USER_POST;
            } else {
                return Endpoint.UNKNOWN;
            }
        }

        return Endpoint.UNKNOWN;
    }
}
