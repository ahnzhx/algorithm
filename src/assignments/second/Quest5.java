package assignments.second;

public class Quest5 {

    public static String solution(int X, int Y, int[] elementOfX, int[] elementOfY){
        for(int i =0; i < elementOfX.length; i++){
            for(int j =0; j < elementOfY.length; j++){
                if(X-elementOfX[i] + elementOfY[j] == X- elementOfY[j] +elementOfX[i]){
                    return "i= "+i +"," + "j= "+j;
                }
            }

        }
        return "No matching answer";
    }
    public static void main(String[] args) {
        int[] elementOfX = {1,3,5,11,7};
        int[] elementOfY = {3,4,2,5,5,8};

        int X = 0;
        int Y = 0;
        for(int x : elementOfX){
            X += x;
        }
        for(int y : elementOfY){
            Y += y;
        }

        System.out.println(solution(X, Y, elementOfX, elementOfY));
    }

}
