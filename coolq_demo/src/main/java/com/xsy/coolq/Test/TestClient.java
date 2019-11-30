package com.xsy.coolq.Test;

import com.xsy.coolq.Server.LemocWebSocketClientFactory;
import org.java_websocket.client.WebSocketClient;

public class TestClient{
    public static void main(String[] args) throws Exception {
        WebSocketClient lemocWebSocketClient = LemocWebSocketClientFactory.getLemocWebSocketClient();
        lemocWebSocketClient.connect();
    }
}
