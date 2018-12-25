package com.ustc.reed.util;

import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Connection;

public class ConnectionUtil {

    public static Connection getConnection() throws Exception {
        //定义连接工厂
        ConnectionFactory factory = new ConnectionFactory();
        //设置服务地址
        factory.setHost("47.101.47.253");
        //端口
        factory.setPort(5672);
        //设置账号信息，用户名、密码、vhost
      //  factory.setVirtualHost("/taotao");
        factory.setUsername("reed");
        factory.setPassword("reed");
        // 通过工程获取连接
        Connection connection = factory.newConnection();
        return connection;
    }

}
