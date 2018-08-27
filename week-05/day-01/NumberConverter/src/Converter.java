public class Converter {


   /* public static String Checker(int number) {
        if (number < 1000) {
            return "ok";
        } else {
            return "new number";
        }
    }*/
  public static void main(String[] args) {
      System.out.println(numberToWord(5));

  }

    public static String numberToWord(int num) {
        String ones[] = {" ", " ONE", " TWO", " THREE", " FOUR", " FIVE", " SIX", " SEVEN", " EIGHT", " NINE", " TEN", " ELEVEN", " TWELVE", " THIRTEEN", " FOURTEEN", " FIFTEEN", " SIXTEEN", " SEVENTEEN", " EIGHTEEN", " NINETEEN"
        };
        String tens[] = {" ", " ", " TWENTY", " THIRTY", " FOURTY", " FIFTY", " SIXTY", " SEVENTY", " EIGHTY", " NINETY"};
        if (num > 19) {
            return tens[num / 10] + " " + ones[num % 10];
        } else {
            return ones[num];
        }
    }
}
