package com.udemy.java;

import com.udemy.java.lambda.GreetingService;
import com.udemy.java.lambda.StringOperations;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;

public class TestMain {

//    private static final List<String> list = new ArrayList<>();

    public static void main(String[] args) {
//        /*AreaCalculator a = new AreaCalculator();
//
//        System.out.println(a.getArea(5));
//        System.out.println(a.getArea(5.25));
//        System.out.println(a.getArea(5 * 4)); */
//
//        /*int a = 5;
//        Dog d =new Dog();
//
//        GreetingService hiSerivice = new GreetingService() {
//            @Override
//            protected Object clone() throws CloneNotSupportedException {
//                return super.clone();
//            }
//
//            public void greet(String name){
//                System.out.println("Hi..." + name);
//            }
//        };*/
//
//    /*    List<String> list = new ArrayList<>();
//        list.add("");
//        list.add("jhjh");
//
//        GreetingService g1 = (n) -> {return n.toUpperCase() + list.get(1);};
//
//        GreetingService g2= (n) -> {list.remove(1);
//                                    return n.toUpperCase();
//                                    };
//
//        System.out.println(g1.greet("yoyo"));*/
//
//        System.out.println("Starting execution");
////        receiveNumber(getNumber());
//
//        test(s -> {
//            System.out.println("inside lambda");
//            return s.toUpperCase();
//        });
//
//        System.out.println("Ending execution");
//
//    }
//
////    private static int getNumber() {
////        System.out.println("Called getNumber");
////        return 5;
////    }
////
////    private static int receiveNumber(int i) {
////        System.out.println("Received Number is :: " + i);
////        return 5;
////    }
//
//    private static void test(GreetingService g) {
//        System.out.println("Inside test method. Receive greeting service");
//        String returnedString = g.greet("udemy");
//        System.out.println(returnedString);
//    }

//        StringOperations op1 = (s) -> System.out.println("Recieved String is :: " + s);
//        StringOperations op1 = System.out::println;
//           op1.accept("udemy");


//        StringOperations op1 = (s) -> Objects.isNull(s);
//        StringOperations op1 = Objects::isNull;
//        System.out.println(op1.accept(null));

//        StringOperations op1 = (s) -> s.toUpperCase();
//        StringOperations op1 = String::toUpperCase;
//        System.out.println(op1.accept("ssas"));


//        StringOperations op1 = (s1, s2) -> s1.concat(s2);
//        StringOperations op1 = String::concat;
//        System.out.println(op1.accept("ab", "cd"));


//        StringOperations op1 = list::add;
//
//        op1.accept("udemy");
//        System.out.println(list);

//        Supplier<Double> random = () -> Math.random();
        Supplier<Double> random = Math::random;
        System.out.println(random.get());

    }
}
