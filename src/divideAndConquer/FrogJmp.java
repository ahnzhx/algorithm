package divideAndConquer;

public class FrogJmp {
    public static int solution(int X, int Y, int D){
        int minNumOfJump = (Y-X)/D;

        if((Y-X)%D != 0){
            minNumOfJump += 1;
        }

        return minNumOfJump;
    }

    public static void main(String[] args){
        System.out.println(solution(10, 85, 30));
    }

}
