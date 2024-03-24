package lesson36.homework;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Homework {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("https://swapi.dev/api/films"))
                .build();

        HttpResponse.BodyHandler<String> handler = HttpResponse.BodyHandlers.ofString();
        HttpResponse<String> response = client.send(request, handler);

        JsonElement element = JsonParser.parseString(response.body());
        JsonObject object = element.getAsJsonObject();
        JsonArray array = object.getAsJsonArray("results");

        String movie_title = "";
        String release_date = "";
        String characters_count = "";
        String url = "";

        try (Writer writer = new FileWriter("src/lesson36/homework/task.csv");) {
            writer.append("movie_title,release_date,characters_count,url\n");
            for (JsonElement jsonElement : array) {
                JsonObject jsonObject = jsonElement.getAsJsonObject();
                JsonArray charactersArray = jsonObject.getAsJsonArray("characters");

                movie_title = jsonObject.getAsJsonPrimitive("title").getAsString();
                release_date = jsonObject.getAsJsonPrimitive("release_date").getAsString();
                url = jsonObject.getAsJsonPrimitive("url").getAsString();
                characters_count = String.valueOf(charactersArray.size());

                writer.append(movie_title).append(",")
                        .append(release_date).append(",")
                        .append(characters_count).append(",")
                        .append(url).append("\n");
            }
        }

        HttpServer server = HttpServer.create();
        server.bind(new InetSocketAddress(8080), 0);
        server.createContext("/hello", new HelloHandler());
        server.start();
    }
}

class HelloHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        exchange.sendResponseHeaders(200, 0);
        try (OutputStream outputStream = exchange.getResponseBody()) {
            Reader reader = new FileReader("src/lesson36/homework/task.csv");
            BufferedReader bufferedReader = new BufferedReader(reader);
            bufferedReader.readLine();

            while (bufferedReader.ready()) {
                String write = bufferedReader.readLine();
                outputStream.write((write + "\n").getBytes());
            }
        }
    }
}
