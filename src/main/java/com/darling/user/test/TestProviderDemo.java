package com.darling.user.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 *   @author 董琳琳
 *   @date 2018/9/14 14:51
 *   @description  测试服务提供者(用户服务)向注册中心注册是否成功
 */
public class TestProviderDemo {

    public static void main(String[] args) throws IOException {
        // 加载配置文件
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("provider.xml");
        // 容器启动
        applicationContext.start();
        // 使程序阻塞(由于是单元测试,如果程序跑完了我们再dubbo控制台看不到效果)
        System.in.read();
    }
}
