package org.example;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Task4 {
    public void solve() throws IOException, InterruptedException {
        try (HttpClient client = HttpClient.newHttpClient()) {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://httpbin.org/ip"))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println("Код состояния ответа: " + response.statusCode());

            String responseBody = response.body();
            String ip = responseBody.split("\"")[3];

            System.out.println("IP-адрес: " + ip);
        }
    }
}
