package lesson35.homework.task1;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import javax.swing.text.DateFormatter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("https://api.themoviedb.org/3/discover/movie?sort_by=popularity.desc&api_key=418969814078357800fcf2d3df514a26&with_original_language=en"))
                .build();

        HttpResponse.BodyHandler<String> handler = HttpResponse.BodyHandlers.ofString();
        HttpResponse<String> response = client.send(request, handler);

        JsonElement element = JsonParser.parseString(response.body());
        JsonObject object = element.getAsJsonObject();
        JsonArray array = object.getAsJsonArray("results");

        String oldestFilm = "";
        LocalDate oldestDate = LocalDate.now();
        for (JsonElement jsonElement : array) {
            JsonObject film = jsonElement.getAsJsonObject();

            String name = film.getAsJsonPrimitive("title").getAsString();
            String stringDate = film.getAsJsonPrimitive("release_date").getAsString();
            stringDate += " 00:00";
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            LocalDateTime localDateTime = LocalDateTime.parse(stringDate, formatter);
            LocalDate date = LocalDate.from(localDateTime);

            if (date.compareTo(oldestDate) < 0) {
                oldestFilm = name;
                oldestDate = date;
            }
        }

        System.out.println(oldestFilm + "\n" + oldestDate);
    }
}
