package com.itheima.test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server01 {
    public static void main(String[] args) throws IOException {
        ServerSocket server=new ServerSocket(9988);
        System.out.println("服务器已开启：");
        Socket socket = server.accept();
        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();
        BufferedReader br=new BufferedReader(new InputStreamReader(is));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(os));

        String str=br.readLine();
        File file=new File("E:\\",str);
        bw.write("已成功接收！");
        bw.newLine();
        bw.flush();

        FileOutputStream fos=new FileOutputStream(file);
        byte[] bts=new byte[1024];
        int len;
        while((len=is.read(bts))!=-1){
            fos.write(bts);
        }
        fos.close();

        bw.write("已成功接收！");
        bw.newLine();
        bw.flush();





    }
}
