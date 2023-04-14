package com.itheima.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client {
    public static void main(String[] args) throws IOException {
        // 1. 创建DatagramSocket对象 (码头) 随机绑定端口
        DatagramSocket socket = new DatagramSocket();

        // 2. 准备数据
        String msg = "你好, UDP";

        // 3. 将数据打包
        byte[] bytes = msg.getBytes();
        DatagramPacket packet = new DatagramPacket
                (bytes, bytes.length,
                        InetAddress.getByName("127.0.0.1"), 8888);

        // 4. 发送数据
        socket.send(packet);

        // 5. 关闭流
        socket.close();
    }
}
