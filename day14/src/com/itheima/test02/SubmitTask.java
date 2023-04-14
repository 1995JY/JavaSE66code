package com.itheima.test02;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class SubmitTask implements Runnable {
    private Socket socket;

    public SubmitTask(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            InputStream is = socket.getInputStream();
            OutputStream os = socket.getOutputStream();
            BufferedReader br=new BufferedReader(new InputStreamReader(is));
            BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(os));

            String str=br.readLine();
            File file=new File("E:\\", UUID.randomUUID().toString()+str);
            bw.write("已成功接收！");
            bw.newLine();
            bw.flush();

            FileOutputStream fos=new FileOutputStream(file);
            byte[] bts=new byte[1024];
            int len;
            while((len=is.read(bts))!=-1){
                fos.write(bts,0,len);
            }
            fos.close();

            System.out.println("已成功接收");

            bw.write("已成功接收！");
            bw.newLine();
            bw.flush();

            socket.close();
            is.close();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
