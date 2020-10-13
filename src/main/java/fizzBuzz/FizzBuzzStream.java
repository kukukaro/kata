package fizzBuzz;

import java.util.stream.IntStream;

public class FizzBuzzStream {


    public static void main(String[] args) {
        IntStream.range(1,101)
            .mapToObj(i -> convertToResult(i))
            .forEach(result -> System.out.println(result));

        IntStream.range(1,101)
                .mapToObj(FizzBuzzStream::convertToResult)
                .forEach(System.out::println);
    }

    private static String convertToResult(int i) {
        if(isBuzz(i)) {
            if(isFizz(i)) {
                return "FizzBuzz";
            }
            return "Buzz";
        }
        if(isFizz(i)) {
            return "Fizz";
        }
        return ""+ i;
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
