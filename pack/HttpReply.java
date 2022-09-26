package pack;

import java.net.Socket;
import java.io.PrintStream;
import java.io.IOException;

public class HttpReply implements Runnable {
    private Socket s;
    private StringBuilder body;

    public HttpReply(Socket s, StringBuilder body) {
        this.s = s;
        this.body = body;
    }

    public void run() {
        try {
            PrintStream ps = new PrintStream(s.getOutputStream());
            ps.println("HTTP/1.1 200 OK");
            ps.println("Date: Mon, 27 Jul 2009 12:28:53 GMT");
            ps.println("Server: Java");
            ps.println("Last-Modified: Wed, 22 Jul 2009 19:15:56 GMT");
            ps.println("Content-Length: " + body.length());
            ps.println("Content-Type: text/html");
            ps.println("Connection: Closed");
            ps.println();
            ps.println(body);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}