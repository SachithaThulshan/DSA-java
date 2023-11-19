public class Search {
    static public int findElement(int[] arr, int size, int value){
        for (int i = 0; i < size; i++) {
            if (arr[i] == value){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {12,34,78,93};
        int size = arr.length;
        int value = 93;
        int index = findElement(arr, size, value);

        if (value == -1){
            System.out.println("not Found!");
        }else
            System.out.println("Fonded :"+ index);
    }
}
