package amex.eanstis;

public class fizzBuzz {

    public static void main(String[] args) {

        for (int i = 1;i <= 100;i++) {
            String output = "";

            if (i % 3 == 0)
                output = output + "Fizz";
            if (i % 5 == 0)
                output = output + "Buzz";
            if (output == "")
                output = output + i;

            System.out.println(output);
        }

    }

}
