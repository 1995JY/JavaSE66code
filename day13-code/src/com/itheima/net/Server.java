package com.itheima.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {
    public static void main(String[] args) throws IOException {
        // 1. 创建DatagramSocket对象 (码头), 手动绑定端口
        DatagramSocket socket = new DatagramSocket(8888);

        // 2. 创建包裹对象, 准备接受数据
        byte[] bys = new byte[1024];
        DatagramPacket packet = new DatagramPacket(bys, bys.length);

        // 3. 接收数据, 将数据接到包裹对象内部
        socket.receive(packet);

        // 4. 从包裹中取出数据
        byte[] data = packet.getData();
        String s = new String(data, 0, packet.getLength());
        System.out.println(s);

        // 5. 关闭流释放资源
        socket.close();
    }
}
