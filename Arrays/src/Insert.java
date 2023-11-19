public class Insert {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 60;
        arr[6] = 70;
        arr[7] = 80;

        int size = 8;
        int value = 500;
        for (int i = 0; i < size; i++) {
            System.out.println("before "+ arr[i]);
        }
        arr[size] = value;
        for (int i = 0; i < size+1; i++) {
            System.out.println("after : "+ arr[i]);

        }

    }
}
