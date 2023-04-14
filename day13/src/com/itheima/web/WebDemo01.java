package com.itheima.web;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class WebDemo01 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("192.168.15.43");
        System.out.println(address.getHostAddress());
        System.out.println(address.getHostName());

    }
}
