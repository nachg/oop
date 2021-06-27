package com.demo.numbers;

import org.junit.jupiter.api.Test;

import java.util.function.Consumer;

public class LambdaTest {

    interface Printable {
        void method();
    }

    class PrintableImp implements Printable {

        @Override
        public void method() {
            System.out.println("asd");
        }
    }


    static void pr(Printable lamda) {
        lamda.method();
    }

    @Test
    void ltest() {
        pr(()->{
            System.out.println("asd");
        });

        pr(new PrintableImp());
    }
}
