package com.company;

public class Main {

    public static void main(String[] args) {
        // регулярные выражения и оба работают
        System.out.println("abcc".matches("a(bc|b)c")); // true
        System.out.println("abc".matches("a(bc|b)c")); // true

        // Атомарные группы, это группы с выражением "?>"
        System.out.println("abcc".matches("a(?>bc|b)c")); // true
        System.out.println("abc".matches("a(?>bc|b)c")); // false, так как мы должы найти "a" "bc", а потом ещё "c"

        System.out.println("integers".matches("\\b(integer|insert|in)\\b")); // false здесь он проверит каждый эл.
        System.out.println("integers".matches("\\b(?>integer|insert|in)\\b")); // false в данном случае он нашёл integer, но так как в конце "s", то он не подходит по условию
    }
}
