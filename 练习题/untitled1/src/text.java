
import java.util.Scanner;

///**
// * @author 26568
// * @date 2022-05-06 19:53
public class text {


    public static void main(String[] args) {
        int[] array={1,2,3};
        int[] output=transform(array);
        printArray(output);
    }
    public static int[] transform(int[] arr){
        int[] ret=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ret[i]=arr[i]*2;
        }
        return ret;
    }
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
