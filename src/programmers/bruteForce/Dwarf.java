package programmers.bruteForce;

import java.util.Arrays;
import java.util.Scanner;

public class Dwarf {
    public static void solution(){
        Scanner sc = new Scanner(System.in);
        int height[] = new int[9];
        int sum = 0;

        for(int i = 0; i<height.length; i++){
            height[i] = sc.nextInt();
            sum += height[i];
        }

        Arrays.sort(height);
        for(int i =0 ; i<height.length; i++){
            for(int j = i+1; j < height.length; j++){
                if(sum - height[i] - height[j] == 100){
                    for(int k =0; k<height.length; k++){
                        if(i == k || j == k) continue;
                        System.out.println(height[k]);
                    }
                System.exit(0);
                }
            }
        }

    }

    //단축키: psvm
    public static void main(String[] args) {
        int a[] = {20,7,23,19,10,15,25,8,13};
        solution();
    }
}
