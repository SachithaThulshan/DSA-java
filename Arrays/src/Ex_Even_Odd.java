public class Ex_Even_Odd {
    public static void main(String[] args) {
        int[] array = {1, 3, 54, 76, 87, 3, 4};
        int even = 0;
        int odd = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 ) {
                even++;
            }else {
                odd++;
            }
        }
        System.out.println("Even Number Counts: "+ even);
        System.out.println("Odd Number Counts: "+ odd);

    }
}
