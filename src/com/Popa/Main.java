package com.Popa;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String Capitals[] = {"Paris", "London", "New York", "Stockholm"};
        System.out.println("String array: " + Arrays.toString(Capitals));
        Arrays.sort(Capitals);
        System.out.println("Sorted string array: " + Arrays.toString(Capitals));
    }
}
