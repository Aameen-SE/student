package http;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientProg {

    public static void main(String[] args)  throws java. io. IOException, InterruptedException{


            final String Base_Url = "https://jsonplaceholder.typicode.com/users";
            final HttpClient client = HttpClient.newHttpClient();


            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(Base_Url)).GET().build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println(response.body());


    }
}
