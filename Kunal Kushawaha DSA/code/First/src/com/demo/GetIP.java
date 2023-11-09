package com.demo;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIP {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress myIp = InetAddress.getLocalHost();
        String res = myIp.getHostAddress();
        System.out.println(res);
    }
}
