package array;

import java.util.Arrays;

public class MiddleElement {
    public static void main(String[] args) {
        int arr[] = {978, 518, 600, 100, 800};
    int middleElement = middle(arr);
        System.out.println("Middle Elemnet: "+middleElement);
    }
    static int middle(int arr[]){
        Arrays.sort(arr);
        int mid = 0+(arr.length-1)/2;
        return arr[mid];
    }
}
