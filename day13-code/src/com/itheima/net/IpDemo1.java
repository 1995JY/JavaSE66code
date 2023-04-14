package com.itheima.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpDemo1 {
    public static void main(String[] args) throws UnknownHostException {
        // 1. 获取InetAddress对象(IP地址的对象)
        InetAddress address = InetAddress.getByName("192.168.15.43");

        // 2. 获取主机名
        System.out.println(address.getHostName());

        // 3. 获取IP地址
        System.out.println(address.getHostAddress());
    }
}
