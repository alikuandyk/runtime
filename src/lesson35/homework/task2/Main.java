package lesson35.homework.task2;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("https://api.themoviedb.org/3/movie/635302?api_key=418969814078357800fcf2d3df514a26"))
                .build();

        HttpResponse.BodyHandler<String> handler = HttpResponse.BodyHandlers.ofString();
        HttpResponse<String> response = client.send(request, handler);

        JsonElement element = JsonParser.parseString(response.body());
        JsonObject object = element.getAsJsonObject();

        String title = object.getAsJsonPrimitive("title").getAsString();
        long budget = object.getAsJsonPrimitive("budget").getAsLong();
        List<String> genres = new ArrayList<>();
        Duration duration = Duration.ofMinutes(object.getAsJsonPrimitive("runtime").getAsInt());

        JsonArray array = object.getAsJsonArray("genres");
        for (JsonElement jsonElement : array) {
            JsonObject objectt = jsonElement.getAsJsonObject();

            String genre = objectt.getAsJsonPrimitive("name").getAsString();
            genres.add(genre);
        }

        System.out.println("Название: " + title);
        System.out.println("Бюджет: " + budget);
        System.out.println("Жанры: " + genres.toString().substring(1, genres.toString().length() - 1));
        System.out.println("Продолжительность: " + String.format("%d часов %d минут", duration.toHours(), (duration.toMinutes() % 60)));
    }
}
