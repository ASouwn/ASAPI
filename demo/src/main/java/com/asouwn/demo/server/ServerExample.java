package com.asouwn.demo.server;

import com.asouwn.demo.registry.LocalRegistry;

public class ServerExample {
    public static void main(String[] args) {
        LocalRegistry.register(ServerImpl.class.getName(), ServerImpl.class);
    }
}
