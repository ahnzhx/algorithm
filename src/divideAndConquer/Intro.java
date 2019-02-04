package divideAndConquer;

import java.util.Arrays;
import java.util.Scanner;

public class Intro {
    public static int solution(int N) {
        int binary[] = new int[50]; //배열 크기를 충분히 주지 않아서 에러가 났음. 충분히 주니까 테스트 패스함
        int idx =0;
        int binaryGap[] = new int [50];

        while(N == 0? false: true){
            binary[idx++] = N%2;
            N = N/2;
        }

        int exchange = 0;

        for (int i = 0; i < idx/2; i++){
            exchange = binary[i];
            binary[i] = binary[idx-i-1];
            binary[idx-i-1] = exchange;
        }

        int countBinaryGap =0;
        int i = 1 ;

        while( i != idx ){

            if(binary[i] == 0 ){

                binaryGap[countBinaryGap] ++;

            }else if( binary[i] == 1 ){
                countBinaryGap += 1;
                binaryGap[countBinaryGap] = 0;
            }



            i++;
        }
        if (binary[idx-1] == 0 ){ //2진수 맨 끝이 0이면

            binaryGap[countBinaryGap] = 0; //binaryGap[마지막] =0
        }
        int maxBinaryGap = 0;

        for(int k =0 ; k < countBinaryGap + 1 ; k++){

            if(binaryGap[k] > maxBinaryGap){
                maxBinaryGap = binaryGap[k];
            }
        }


        return maxBinaryGap;
    }

    public static void main(String[] args){

        System.out.println(solution(5));
    }
}
