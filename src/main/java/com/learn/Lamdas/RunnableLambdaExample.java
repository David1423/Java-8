package com.learn.Lamdas;

public class RunnableLambdaExample {
    public static void main(String[] args) {

        /*
         * *
         *  PRIOR to JAVA 8
         */

        Runnable runnable = new Runnable() { //Anonymous object
            @Override
            public void run() {
                System.out.println("Thread created in the style prior to java 8");
            }
        };

        new Thread(runnable).start();


        /*
         *  With Java 8
         */

        Runnable runnable1 = () -> System.out.println("Thread created from Java 8 style using lambda Expression !");

        new Thread(runnable1).start();

        //instead we can write the whole lambda expression inside the Thread(-) constructor

        new Thread(() -> System.out.println("Thread created inside the thread objects constructor using lambda expression!")).start();

    }//main
}
