public class Power {
    public static double power(double base, int exponent) {
        throw new Error("You need to implement function `power`.");
    }

    public static void main(String[] args) {
        double base = 2.5;
        int exponent = 3;
        double output = power(base, exponent);
        double expected = 15.625;
        System.out.println(output == expected ? "SUCCESS" : "WRONG ANSWER");
    }
}