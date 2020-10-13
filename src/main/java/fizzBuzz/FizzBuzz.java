package fizzBuzz;

public class FizzBuzz {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if(isFizz(i)) {
                if(isBuzz(i)) {
                    System.out.println("FizzBuzz");
                } else {
                    System.out.println("Fizz");
                }
            }
            if (isBuzz(i)) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static boolean isFizz(int n) {
        if (n % 3 == 0)
            return true;

        return false;

    }

    public static boolean isBuzz(int n) {
        if (n % 5 == 0)
            return true;
        return false;
    }

}
