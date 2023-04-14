package com.itheima.test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Server {
    public static void main(String[] args) throws IOException {
        // 1. 搭建码头
        DatagramSocket socket = new DatagramSocket(9999);

        while (true) {
            // 2. 准备包裹对象
            byte[] bys = new byte[1024];
            DatagramPacket packet = new DatagramPacket(bys, bys.length);

            // 3. 接受数据
            socket.receive(packet);

            InetAddress address = packet.getAddress();
            System.out.println(address.getHostAddress());
            System.out.println(address.getHostName());

            // 4. 拆包裹
            byte[] data = packet.getData();
            String s = new String(data, 0, packet.getLength());
            System.out.println(s);
        }

    }
}
