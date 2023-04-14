package com.itheima.homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
需求 :  请编写程序,  实现文件夹复制 (子文件夹也带上)
 */
public class test06 {
    public static void main(String[] args) throws IOException {

        //目标文件夹的路径
        String target="E:\\IO流操作\\2023.04.02-homework";
        //复制的文件夹存储路径
        String copy="E:\\IO流操作\\copy";
        copyFile(target,copy);
    }
    public static void copyFile(String target,String copyResult) throws IOException {
        //
        File file1=new File(target);
        File file2=new File(copyResult);
        file2.mkdirs();
        File[] files = file1.listFiles();
        for (File f : files) {
            if(!f.isFile()){
                String str=f.getName();
                File file=new File(file2,"\\"+str);
                file.mkdirs();
                copyFile(target+"\\"+str,copyResult+"\\"+str);
            }else{
                FileInputStream fis=new FileInputStream(target+"\\"+f.getName());
                FileOutputStream fos=new FileOutputStream(copyResult+"\\"+f.getName());
                byte[] bts=new byte[1024];
                int len;
                while((len=fis.read(bts))!=-1){
                    fos.write(bts,0,len);
                }
                fis.close();
                fos.close();
            }
        }

    }

}
