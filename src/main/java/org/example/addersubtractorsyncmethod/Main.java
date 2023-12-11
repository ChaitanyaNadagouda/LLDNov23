package org.example.addersubtractorsyncmethod;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();

        List<Integer> list = new ArrayList<>();

        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor(count);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(count.getValue());
    }
}
