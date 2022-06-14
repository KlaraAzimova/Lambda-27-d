package com.company;

import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {
        System.out.println(sqrt().apply(555.55));
    }

    public static UnaryOperator<Double> sqrt() {
        UnaryOperator<Double> root =x->Math.sqrt(x);
        return root;
    }
}
