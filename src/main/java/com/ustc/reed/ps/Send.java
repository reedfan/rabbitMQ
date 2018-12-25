package com.ustc.reed.ps;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.ustc.reed.util.ConnectionUtil;

public class Send {
    private final static String EXCHANGE_NAME = "test_exchange_fanout";

    public static void main(String[] args) throws Exception{

        //获取到连接以及mq通道
        Connection connection = ConnectionUtil.getConnection();

        Channel channel = connection.createChannel();

        //申明exchange
        channel.exchangeDeclare(EXCHANGE_NAME,"fanout");

        //消息内容
        String message = "I am reed";

        channel.basicPublish(EXCHANGE_NAME,"",null,message.getBytes());

        channel.close();
        connection.close();





    }



}
