package com.proxy.temple;

/**
 * Created by qqy on 15/8/6.
 */
public class RealSubject extends Subject {
    @Override
    public void Request() {
        System.out.println("真实的请求");
    }
}
