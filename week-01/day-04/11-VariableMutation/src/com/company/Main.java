package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 3;
        a += 10;
        // make it bigger by 10
        System.out.println(a);


        int b = 100;
        b -= 7;
        // make it smaller by 7
        System.out.println(b);

        int c = 44;
        c *= 2;
        // please double c's value
        System.out.println(c);

        int d = 125;
        d /= 5;
        // please divide by 5 d's value
        System.out.println(d);

        int e = 8;
        e = e * e * e;
        // please cube of e's value
        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
       boolean b1 = f1 > f2;
        System.out.println(b1);
        // tell if f1 is bigger than f2 (print as a boolean)


        int g1 = 350;
        int g2 = 200;
        boolean b2 = (g2 * g2) > g1;
        System.out.println(b2);
        // tell if the double of g2 is bigger than g1 (print as a boolean)


        int h = 135798745;
        boolean b3 = (h % 11) == 0;
        System.out.println(b3);
        // tell if it has 11 as a divisor (print as a boolean)


        int i1 = 10;
        int i2 = 3;
        boolean b4 = (i2 * i2 * i2) < i1 && i1 > (i2 * i2);
        System.out.println(b4);
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)


        int j = 1521;
        boolean b5 = ((j % 3) == 0) || ((j % 5) == 0);
        System.out.println(b5);
        // tell if j is dividable by 3 or 5 (print as a boolean)


        String k = "Apple";
        for (int i = 0; i < 3; i++){
            k += "Apple";
        }
        //fill the k variable with its content 4 times
        System.out.println(k);
    }
}
