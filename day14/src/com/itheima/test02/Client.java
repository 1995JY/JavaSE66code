package com.itheima.test02;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("127.0.0.1",9988);
        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();
        BufferedReader br=new BufferedReader(new InputStreamReader(is));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(os));

        File file=new File("E:\\IO流操作\\2023.04.02-homework\\a.jpg");
        bw.write(file.getName());
        bw.newLine();
        bw.flush();

        String str=br.readLine();
        if("已成功接收！".equals(str)){
            FileInputStream fis=new FileInputStream(file);
            byte[] bts=new byte[1024];
            int len;
            while((len=fis.read(bts))!=-1){
                os.write(bts,0,len);
            }
            fis.close();
        }
        socket.shutdownOutput();

        String result=br.readLine();
        System.out.println(result);

        socket.close();
        is.close();
        os.close();



    }
}
