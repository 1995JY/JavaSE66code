package com.itheima.homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


/*
需求 :  请编写程序,  实现文件夹复制 (子文件夹也带上)
 */
public class test07 {
    public static void main(String[] args) throws IOException {

        //目标文件夹的路径
        String target="E:\\IO流操作\\2023.04.02-homework";
        //复制的文件夹存储路径
        String copy="E:";
        copyFile(target,copy);
    }
    public static void copyFile(String target,String copy) throws IOException {
        //创建目标文件夹的file对象
        File file1=new File(target);
        //获取复制后的文件夹的存储位置
        String copyResult=copy+"\\"+file1.getName();
        //创建复制后文件夹的file对象
        File file2=new File(copyResult);
        //复制文件夹
        file2.mkdirs();
        // 遍历目标文件夹
        File[] files = file1.listFiles();
        for (File f : files) {
            //是文件夹，获取文件夹名，拼接成复制后文件夹的存储位置，并创建新的file对象，生成文件夹
            if(!f.isFile()){
                String str=f.getName();
                File file=new File(file2,"\\"+str);
                file.mkdirs();
                copyFile(target+"\\"+str,copyResult+"\\"+str);
            }else{
                // 不是文件夹，是文件，获取文件名，拼接成文件的存储路径
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
