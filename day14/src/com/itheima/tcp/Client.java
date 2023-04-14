package com.itheima.tcp;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //
        Socket socket=new Socket(InetAddress.getByName("127.0.0.1"),8899);
        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();
        InputStreamReader isr=new InputStreamReader(is);
        OutputStreamWriter osw=new OutputStreamWriter(os);
        BufferedReader br=new BufferedReader(isr);
        BufferedWriter bw=new BufferedWriter(osw);

        bw.write("你好，在吗？");
        bw.newLine();
        bw.flush();

        String str=br.readLine();
        System.out.println(str);

        socket.close();
        is.close();
        os.close();
    }
}
