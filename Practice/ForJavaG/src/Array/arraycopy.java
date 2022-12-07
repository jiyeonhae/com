package Array;

public class arraycopy {
    public static void main(String[] args) {
        int[] arr1 = {0,1,2,3};
        int[] arr2 = new int[5];

        for (int i=0; i< arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        
        //빈칸을 넣으면 합칠수 있음
    }
}
