public class Factorial {
    public static int factorial(int n) {
        if(n<0){
            throw new Error ("negative factorial does not exist");
        }
        int res=1;
        for(int i=n;i>=1; i--){
            res *= i;
        }
        return res;
        //throw new Error("You need to implement function `factorial`.");
    }

    public static void main(String[] args) {
        int num = 0;
        int output = factorial(num);
        System.out.println(output);
        int expected = 1;
        System.out.println(output == expected ? "SUCCESS" : "WRONG ANSWER");
    }
}