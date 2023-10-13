public class Mean {
    public static double mean(int[] arr) {
        double result=0;
        for(int i=0; i<arr.length; i++){
            result += arr[i];
        }
        result = result / arr.length;
        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};
        double output = mean(arr);
        System.out.println(output);
        double expected = 2.5;
        System.out.println(output == expected ? "SUCCESS" : "WRONG ANSWER");
    }
}