package com.company;

public class Main {

    public static void main(String[] args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        StringBuilder quote2 = new StringBuilder();
        quote2.append(quote.substring(0, 21));
        quote2.append("always takes longer than");
        quote2.append(quote.substring(20, quote.length()));
        quote = quote2.toString();
        System.out.println(quote);
    }


    // When saving this quote a disk error has occured. Please fix it.
    // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
    // Using pieces of the quote variable (instead of just redefining the string)

    }

