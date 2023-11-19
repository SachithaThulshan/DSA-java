public class Ex_Tot_Ave {
    public static void main(String[] args) {
        int[] array = {1, 3, 54, 76, 87, 3, 4};
        int total = 0;
        double average;

        for (int j : array) {
            total += j;
        }
        average =(double) total / array.length;

        System.out.println("Array Total Elements Value: " + total);
        System.out.println("Array Average Elements value: " + average);
    }
}
