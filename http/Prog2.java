package http;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Prog2 {

    public static void main(String[] args) {
         final String Base_Url ="https://jsonplaceholder.typicode.com/posts";
         final HttpClient client = HttpClient.newHttpClient();

         try{
             HttpRequest request = HttpRequest.newBuilder().uri(URI.create(Base_Url)).GET().build();
             HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
             System.out.println(response.body());

         }catch(Exception e){
             e.printStackTrace();
         }
    }
}
