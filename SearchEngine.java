import java.io.IOException;
import java.net.URI;


class Handler implements URLHandlerP{
    ArrayList<String> strings = new ArrayList<>();
    public String handleRequest(URI url) {
        if (url.getPath().equals("/")){
            return String.format("Here's the server! You can query for stored strings, list all stored strings, or add your own.")
        }
        else if (url.getPath().contains("/add")){
            String[] query = url.parseQuery().split("=");
            for (String el : query){
                strings.append(el);
            }
        }
        else if (url.getPath.equals("/stored")){
            for (i=0; i<= strings.length; i+=1){
                System.out.println(strings[i]);
            }
        }
        else{
        }
    }
}

public class SearchEngine {
  public static void main(String[] args){
            if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
 }
  