package lesson35.classwork;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Example {
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

        String film = "";
        double minRating = Integer.MIN_VALUE;
        for (JsonElement jsonElement : array) {
            JsonObject object1 = jsonElement.getAsJsonObject();
            String name = object1.getAsJsonPrimitive("title").getAsString();
            double rating = object1.getAsJsonPrimitive("vote_average").getAsDouble();
            if (rating > minRating) {
                minRating = object1.getAsJsonPrimitive("vote_average").getAsDouble();
                film = name;
            }
//            System.out.println("Фильм: " + object1.getAsJsonPrimitive("title"));
//            System.out.println("Рейтинг: " + object1.getAsJsonPrimitive("vote_average"));
//            System.out.println();
        }

        System.out.println(film + "\n" + minRating);
    }
}
