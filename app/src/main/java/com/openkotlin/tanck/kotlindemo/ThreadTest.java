package com.openkotlin.tanck.kotlindemo;

/**
 * Created by Administrator on 9/28/2017.
 */

public class ThreadTest {
    public ThreadTest() {
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }){
            @Override
            public void run() {
            }
        }.start();
    }
}
