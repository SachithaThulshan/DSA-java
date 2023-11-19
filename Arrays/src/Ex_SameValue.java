public class Ex_SameValue {
    public static void main(String[] args) {
        int[] array = {1, 3, 54, 76, 87, 3, 4};

        for (int i = 0; i < array.length; i++){
            for (int j = i+1; j < array.length; j++) {
               if (array[i] == array[j]) {
                   System.out.println("Array Same Element Value:" + array[i]);
                   break;
               }
            }
        }
    }
}
