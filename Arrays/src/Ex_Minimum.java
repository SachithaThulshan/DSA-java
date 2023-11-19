public class Ex_Minimum {
    public static void main(String[] args) {
        int[] array = {1, 3, 54, 76, 87, 3, 4};
        int min = array[0];

        for (int i = 1; i < array.length ; i++) {
            if (min > array[i]){
                min = array[i];
            }
        }
        System.out.println("Array Minimum Element Value: " + min);
    }
}
