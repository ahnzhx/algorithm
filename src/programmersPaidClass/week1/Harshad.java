package programmersPaidClass.week1;

public class Harshad {
    public boolean solution(int x) {
        int copyX = x;
        int sumOfX = 0;

        while(copyX > 0){
            sumOfX += copyX % 10;
            copyX /= 10;
        }
        return (x % sumOfX) == 0;
    }

    public static void main(String[] args) {
        //System.out.println(new Harshad().solution(100));
        System.out.println(new Harshad().solution(199));

//        System.out.println(new Harshad().solution(10));
//        System.out.println(new Harshad().solution(12));
//        System.out.println(new Harshad().solution(11));
//        System.out.println(new Harshad().solution(13));
    }
}
