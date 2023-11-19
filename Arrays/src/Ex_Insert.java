public class Ex_Insert {
    public static void main(String[] args) {
        int[] array = {12, 34, 56, 78, 43, 92};
        int[] nArray = new int[7];
        int ind = 2;

        for (int i=0; i< array.length; i++) {
            nArray[i] = array[i];
        }
        for (int i = array.length-1; i >= ind; i--) {
            nArray[i+1]= nArray[i];
            if (i == 2)
                nArray[2] = 234;
        }
        for (int i : nArray) {
            System.out.println(i);
        }
    }
}
