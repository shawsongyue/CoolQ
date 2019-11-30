package com.xsy.coolq.Controller;

import com.google.gson.Gson;
import com.xsy.coolq.Bean.AskQQMessage;
import com.xsy.coolq.Bean.QQMessage;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.drafts.Draft;
import org.java_websocket.handshake.ServerHandshake;

import java.net.URI;


/*
* （核心类）该类主要是服务端与用户之间的信息交互，使用WebSocket（TCP）进行通信
* */

public class LemocWebSocketClient extends WebSocketClient {
    //创建WebSocket通信连接
    public LemocWebSocketClient(URI serverUri, Draft protocolDraft) {
        super(serverUri, protocolDraft);
    }

    public void onClose(int arg0, String arg1, boolean arg2) {
        // TODO Auto-generated method stub
        System.out.println("客户端关闭");
    }
    public void onError(Exception arg0) {
        // TODO Auto-generated method stub
        System.out.println("客户端出错");
    }

    /*核心方法*/
    public void onMessage(String json) {
        // TODO Auto-generated method stub
        System.out.println("服务端开启");
        //将json字符串利用GSON转化成pojo对象,利用面向对象的方式处理qq信息
        QQMessage receiveMessage = (QQMessage) new Gson().fromJson(json, QQMessage.class);
        //获得信息来源的帐号以及信息的内容
        String qq = receiveMessage.getFromQQ();
        String msg = receiveMessage.getMsg();
        System.out.println("对方账号"+qq);
        System.out.println("信息"+msg);
        if("功能".equals(msg)){
            //封装将要返回的信息
            AskQQMessage askMessage = new AskQQMessage();
            askMessage.setAct("106");
            askMessage.setQQID(qq); //将要发送消息的对象
            askMessage.setMsg("抱歉，该功能还未开发"); //将要发送消息的内容
            //把将要返回的信息的对象,解析成json字符串
            String ask = new Gson().toJson(askMessage);
            //将处理好的消息发送出去
            send(ask);
        }else {
            //封装将要返回的信息
            AskQQMessage askMessage = new AskQQMessage();
            askMessage.setAct("106");
            askMessage.setQQID(qq); //将要发送消息的对象
            askMessage.setMsg("你对"+qq+"竖起了拇指,并戳瞎了他的眼睛,就因为他对你说了一句"+msg); //将要发送消息的内容
            //把将要返回的信息的对象,解析成json字符串
            String ask = new Gson().toJson(askMessage);
            //将处理好的消息发送出去
            send(ask);
        }
    }

    public void onOpen(ServerHandshake arg0) {
        // TODO Auto-generated method stub
        System.out.println("客户端启动时，监听服务器25303端口");
    }

}
