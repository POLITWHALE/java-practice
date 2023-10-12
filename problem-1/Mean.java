public class Mean {
    public static double mean(int[] arr) {
        throw new Error("You need to implement function `mean`.");
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};
        double output = mean(arr);
        double expected = 2.5;
        System.out.println(output == expected ? "SUCCESS" : "WRONG ANSWER");
    }
}