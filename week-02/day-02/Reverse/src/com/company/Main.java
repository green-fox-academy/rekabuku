package com.company;


public class Main {

    public static void main(String[] args) {
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
        String result = reversal(reversed);

        System.out.print(result);
    }

    public static String reversal(String reversed) {
        int xy = reversed.length() - 1;

        StringBuilder sb = new StringBuilder();
        for (int i = xy; i >= 0; i--)
             sb.append(reversed.charAt(i));

        return sb.toString();
    }
}

