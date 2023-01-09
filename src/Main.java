import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1={2,2,34,4,2,2,2,3};
        int[] arr2={4,3,3,4,4,4,3};
        int[] result= new int[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i]=arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            result[i+arr1.length]=arr2[i];
        }
        System.out.println(Arrays.toString(result));
    }
}