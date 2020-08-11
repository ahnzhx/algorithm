package programmersPaidClass.week1;

public class Harshad {
    public boolean solution(int x) {
        int k = 10;

        int sumOfX = 0;
        sumOfX += x % k;
        while(k <= x){
            sumOfX += x / k;
            k = k * 10;
        }

        if(x % sumOfX == 0)
            return true;
        else return false;

    }

    public static void main(String[] args) {
        System.out.println(new Harshad().solution(18));
        new Harshad().solution(10);
        new Harshad().solution(12);
        new Harshad().solution(11);
        new Harshad().solution(13);
    }
}
