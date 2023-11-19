public class Ex_Insert {
    public static void main(String[] args) {
        int[] array = {12, 34, 56, 78, 43, 92};
        int[] nArray = new int[7];
        int size = array.length;
        int index = 2;
        int add = 234;
        //array[index+1] = add;
        for (int i= array.length; i >= 0; i--){

            if (i == 2)
                nArray[2] = add;
            else
                nArray[i]=array[i-1];
            System.out.println(nArray[i]);

        }
        //array[2]=add;

//        for (int i=0; i < size-1;  i++){
//            System.out.println(array[i]);
//            if(i == 2)
//                nArray[i] = add;
//            else
//                nArray[i] = array[index +1];
//            System.out.print(nArray[i] + " ");
//        }

    }
}
