package com.main;

import java.net.ServerSocket;
import javax.net.ServerSocketFactory;

import java.net.Socket;
import java.io.IOException;
import pack.HttpReply;

public class Index {
    public static void main(String[] args) {
        try {
            ServerSocket ss = ServerSocketFactory.getDefault().createServerSocket(8080, 10);
            StringBuilder body = new StringBuilder();
            body.append("<html><body><h1>Hello, World!</h1></body></html>");
            while (true) {
                Socket s = ss.accept();
                HttpReply x = new HttpReply(s, body);
                Thread t = new Thread(x);
                t.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}