package com.itheima.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket server=new ServerSocket(8899);
        System.out.println("服务器已开机，正在等待客户端连接：");
        //accept方法具有阻塞性
        Socket socket=server.accept();
        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();
        InputStreamReader isr=new InputStreamReader(is);
        OutputStreamWriter osw=new OutputStreamWriter(os);
        BufferedReader br=new BufferedReader(isr);
        BufferedWriter bw=new BufferedWriter(osw);
        String str=br.readLine();
        System.out.println(str);
        bw.write("不行，我要写代码！");
        bw.newLine();
        bw.flush();

    }
}
