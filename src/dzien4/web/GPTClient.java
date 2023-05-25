package dzien4.web;

import com.google.gson.Gson;
import dzien4.web.model.GPTRequest;
import dzien4.web.model.GPTResponse;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Scanner;

/**
 * Klasa służąca do połączenia z klientem openai chat gpt, klasa oczekuje na wprowadzenie prompta, wysyła zapytanie, oraz wyświetla odpowiedź w konsoli
 */
public class GPTClient {

    private static final Gson gson = new Gson();
    private static final String URL = "https://hook.eu1.make.com/iuigvufwtgv05yed9f9r0qcyw2939g1j"; // aby zadziałało z openai https://api.openai.com/v1/completions
    private static final String AUTH_TOKEN = "Bearer supertajnytoken"; // tutaj prawdziwy token z openai

    /**
     * Punkt startowy programu, zawiera wszystkie potrzebne operacje
     * @param args argumenty które mogą być przekazane do metody main, obecnie ignorowane
     * @throws IOException kiedy nie udało się zrealizować połączenia z openai
     * @throws InterruptedException kiedy nie udało się zrealizować połączenia z openai
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String prompt = scanner.nextLine();

        GPTRequest gptRequest = new GPTRequest(prompt);
        String json = gson.toJson(gptRequest);

        HttpClient client = HttpClient
                .newBuilder()
                .connectTimeout(Duration.ofSeconds(60))
                .build();

        HttpRequest request = HttpRequest
                .newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString(json))
                .header("authorization", AUTH_TOKEN)
                .header("accept", "application/json")
                .header("content-type", "application/json")
                .uri(URI.create(URL))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 200) {
            GPTResponse[] gptResponse = gson.fromJson(response.body(), GPTResponse[].class);
            System.out.println(gptResponse[0].getChoices().get(0).getText());
        } else {
            System.out.println(response.statusCode());
            System.out.println(response.body());
        }
    }
}
