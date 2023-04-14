package com.itheima.web;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class client {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket=new DatagramSocket();
        String s="你好，java";
        DatagramPacket packet=new DatagramPacket(s.getBytes(StandardCharsets.UTF_8),
                s.getBytes(StandardCharsets.UTF_8).length, InetAddress.getByName("127.0.0.1"),37592);
        socket.send(packet);
        socket.close();
    }
}
