package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

public class Task4 {
    public void solve() throws IOException, InterruptedException {
        ObjectMapper objectMapper = new ObjectMapper();

        try (HttpClient client = HttpClient.newHttpClient()) {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://httpbin.org/ip"))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println("Код состояния ответа: " + response.statusCode());

            String responseBody = response.body();
            Map<String, String> jsonMap = objectMapper.readValue(responseBody, Map.class);

            String ip = jsonMap.get("origin");

            System.out.println("IP-адрес: " + ip);
        }
    }
}
