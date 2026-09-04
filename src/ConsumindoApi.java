import java.awt.*;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumindoApi {

    public static void main(String[] args) throws Exception {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://dog.ceo/api/breeds/image/random"))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        // {"message":"https://images.dog.ceo/breeds/hound-afghan/n02088094_100.jpg","status":"success"}

        // Extrai a URL e abre no navegador
        String url = response.body()
                .substring(response.body().indexOf("\"message\":\"") + 11)
                .substring(0, response.body().indexOf("\",\"status\"") - response.body().indexOf("\"message\":\"") - 11);

        System.out.println("Abrindo: " + url);
        Desktop.getDesktop().browse(new URL(url).toURI());
    }
}
