public class Power {
    public static double power(double base, int exponent) {
        double res=1;
        for(int i=1;i<=exponent;i++){
            res *= base;
        }
        return res;
    }

    public static void main(String[] args) {
        double base = 2;
        int exponent = 0;
        double output = power(base, exponent);
        System.out.println(output);
        double expected = 1;
        System.out.println(output == expected ? "SUCCESS" : "WRONG ANSWER");
    }
}