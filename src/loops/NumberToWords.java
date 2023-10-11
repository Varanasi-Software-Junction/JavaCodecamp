package loops;

public class NumberToWords {

    public static void main(String[] args) {
        int n = 1234;
        String output = "";
        while (n > 0) {
            int rem = n % 10;
            String value;
            switch (rem) {
                case 0:
                    value = "Zero";
                    break;
                case 1:
                    value = "One";
                    break;
                case 2:
                    value = "Two";
                    break;
                case 3:
                    value = "Three";
                    break;
                case 4:
                    value = "Four";
                    break;
                case 5:
                    value = "Five";
                    break;
                case 6:
                    value = "Six";
                    break;
                case 7:
                    value = "Seven";
                    break;
                case 8:
                    value = "Eight";
                    break;
                case 9:
                    value = "Nine";
                    break;
                default:
                    value = "Invalid";
                    break;
            }
            n = n / 10;
            output = value + " " + output;

        }
        System.out.println(output);
    }
}
