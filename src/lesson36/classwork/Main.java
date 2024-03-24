package lesson36.classwork;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class Main {
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create();
        server.bind(new InetSocketAddress(8080), 0);
        server.createContext("/hello", new HelloHandler());
        server.start();
    }
}

class HelloHandler implements HttpHandler {

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        exchange.sendResponseHeaders(200, 0);
        try (OutputStream outputStream = exchange.getResponseBody()) {
            String path = exchange.getRequestURI().toString();
            String[] stringsName = path.split("\\?");
            String[] stringsLasName = path.split("&");
            String name = "";
            String lastName = "";

            for (String string : stringsName) {
                if (string.startsWith("name")) {
                    name = string.substring(5);
                }
            }

            for (String string : stringsLasName) {
                if (string.startsWith("lastname")) {
                    lastName = string.substring(8);
                }
            }
            outputStream.write(("Hello " + name + " " + lastName).getBytes());

//            outputStream.write("Monday\n".getBytes());
//            outputStream.write("Tuesday\n".getBytes());
//            outputStream.write("Wednesday\n".getBytes());
//            outputStream.write("Thursday\n".getBytes());
//            outputStream.write("Friday\n".getBytes());
//            outputStream.write("Saturday\n".getBytes());
//            outputStream.write("Sunday\n".getBytes());
        }
    }
}
