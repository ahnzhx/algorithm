package capitalOne;

import java.util.Arrays;

public class Quest1 {
    public static int[] solution(int[] a) {
        int b[] = new int[a.length];
        if(a.length == 1){
            b[0] = a[0];
            return b;
        }
        for(int i = 0; i < a.length; i++){
            if(i-1 < 0){
                b[i] = a[i]+ a[i+1];
            }else if(i+1 >= a.length){
                b[i] = a[i-1]+ a[i];
            }else{
                b[i] = a[i-1]+ a[i]+ a[i+1];
            }

        }
        System.out.println(Arrays.toString(b));

        return b;
    }

    public static void main(String[] args) {
        int a[] = {9};
        solution(a);
    }
}
