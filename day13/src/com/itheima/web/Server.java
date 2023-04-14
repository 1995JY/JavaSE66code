package com.itheima.web;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.LinkedList;
import java.util.List;

public class Server {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket=new DatagramSocket(37592);
        byte[] bts=new byte[1024];
        DatagramPacket packet=new DatagramPacket(bts,bts.length);
        socket.receive(packet);
        byte[] data = packet.getData();
        String s=new String(data,0, packet.getLength());
        System.out.println(s);



    }
}
