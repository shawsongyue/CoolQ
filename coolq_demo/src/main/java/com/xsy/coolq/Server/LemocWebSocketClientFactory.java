package com.xsy.coolq.Server;

import com.xsy.coolq.Controller.LemocWebSocketClient;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.drafts.Draft_6455;

import java.net.URI;


/*
* 创建WebSocket（TCP）连接
* 把URI地址转换成你自己服务器的地址端口（使用Linux搭建酷q环境，docker容器，以及开放端口）
* */
public class LemocWebSocketClientFactory {
    private static WebSocketClient webSocketClient = null;

    public static WebSocketClient getLemocWebSocketClient() throws Exception{
        if(webSocketClient==null){
            /*
            *
            * ws://127.0.0.1:25303该地址是我服务器地址，导入项目运行，可以查看结果
            *
            * */
            webSocketClient = new LemocWebSocketClient(new URI("ws://127.0.0.1:25303"),new Draft_6455());
        }
        return webSocketClient;
    }
}
