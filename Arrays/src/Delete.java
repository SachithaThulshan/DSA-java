public class Delete {
    public static void main(String[] args) {
        int[] arr = {5,10,15,20,25,30};
        int idx = 3;
        int size = 6;
        for (int i = idx; i < size - 1; i++) {
            arr[i] = arr[i+1];

        }
        for (int i = 0; i < size-1; i++) {
            System.out.println(arr[i]);

        }
    }
}
