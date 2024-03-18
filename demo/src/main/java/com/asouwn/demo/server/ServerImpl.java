package com.asouwn.demo.server;

import com.asouwn.demo.common.User;
import com.asouwn.demo.common.UserServer;

public class ServerImpl implements UserServer {
    @Override
    public User getUser(User U) {
        return U;
    }
}
