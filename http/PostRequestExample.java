package http;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PostRequestExample {

    public static void main(String[] args) {

        final String Base_Url="https://jsonplaceholder.typicode.com/posts";
        final HttpClient client = HttpClient.newHttpClient();

        String json = """
                {
                   "title": "Aameen",
                   "body": "Learning Java POST",
                    "userId": 1
                                }
                """;

        try{
          HttpRequest request =HttpRequest.newBuilder(URI.create(Base_Url))
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString(json)).build();

          HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Status Code : "+response.statusCode());
            System.out.println("Response : "+response.body());

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
