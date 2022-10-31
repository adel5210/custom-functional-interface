package com.adel.functionalinterface;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.function.Function;

@SpringBootApplication
public class FunctionalInterfaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FunctionalInterfaceApplication.class, args);
    }

    class Test{
        private void someTest(){
            MyFunction<Integer, String> myFunction = a -> {
                System.out.println("Changes to str");
                return String.valueOf(a);
            };

        }
    }

}
