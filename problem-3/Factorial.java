public class Factorial {
    public static int factorial(int arr) {
        throw new Error("You need to implement function `factorial`.");
    }

    public static void main(String[] args) {
        int num = 10;
        int output = factorial(num);
        int expected = 3628800;
        System.out.println(output == expected ? "SUCCESS" : "WRONG ANSWER");
    }
}