package com.proxy.temple;

/**
 * Created by qqy on 15/8/6.
 */
public class Proxy extends Subject {

    RealSubject realSubject;

    @Override
    public void Request() {

        if (realSubject==null){
            realSubject=new RealSubject();
        }

        realSubject.Request();
    }
}
