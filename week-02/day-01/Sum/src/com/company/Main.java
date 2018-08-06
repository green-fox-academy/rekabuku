

public class Main {

    public static void main(String[] args) {
        int num = 5;
        int sum = summerized(num);
        System.out.println(sum);
    }
    public static int summerized (int a){
        int sum1 = 0;
        for (int i = 0; i <= a; i++)

        sum1 += i;
        return sum1;
    }
}
