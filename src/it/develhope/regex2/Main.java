package it.develhope.regex2;

public class Main {
    public static void main(String[] args) {

        String tup = "tup tuup tuuup tuuuup";
        System.out.println(tup.replaceAll("u{2,3}","x"));
    }
}
