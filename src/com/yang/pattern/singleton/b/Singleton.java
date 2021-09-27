package com.yang.pattern.singleton.b;

public class Singleton {
    public Singleton() {
    }

    private static class SingletonHolder{
        private static Singleton instance = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHolder.instance;
    }
}
