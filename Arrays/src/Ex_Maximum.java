public class Ex_Maximum {
    public static void main(String[] args) {
        int[] array = {1, 3, 54, 76, 87, 3, 4};
        int max = array[0];

        for (int i = 1; i < array.length ; i++) {
            if (max < array[i]){
                max = array[i];
            }
        }
        System.out.println("Array Maximum Element Value: " + max);
    }
}
