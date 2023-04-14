package com.itheima.test;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        // 1. 搭建码头
        DatagramSocket socket = new DatagramSocket();

        // 2. 准备数据
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入您要发送的消息: ");
            String msg = sc.nextLine();

            if ("886".equals(msg)) {
                socket.close();
                break;
            } else {
                // 3. 准备包裹对象
                byte[] bytes = msg.getBytes();
                DatagramPacket packet =
                        new DatagramPacket(bytes, bytes.length,
                                InetAddress.getByName("127.0.0.1"), 9999);
                // 4. 发送包裹
                socket.send(packet);
            }
        }
    }
}
