package org.design.pattern.creational.singleton;

public class DemoSingleton {

    public static void main(String[] args) {
        DbSingleton db1 = DbSingleton.getInstance();
        DbSingleton db2 = DbSingleton.getInstance();

        if (db1 == db2) {
            System.out.println("They are the same instance");
        }
    }

}
