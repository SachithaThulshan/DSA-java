public class Sum {
    public static void main(String[] args) {
        int[] array = {1,2,3,5,8,13,21};
        int sum = 0;
        double ave;


//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//
//        }
        for (int i : array) {
            sum += i;
        }
        ave = (double) sum /array.length;
        System.out.println("Sum :" + sum);
        System.out.println("average :" + ave);
    }
}
