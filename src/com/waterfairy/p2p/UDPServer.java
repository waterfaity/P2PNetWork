package com.waterfairy.p2p;


public class UDPServer extends UDPAgent {

    public static void main(String[] args) throws Exception {
        new UDPServer(2009).start();
    }

    public UDPServer(int port) {
        super(port);
    }
}