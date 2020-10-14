package algoTest.ebayTest;

public class Quest3 {
    public long solution(int n, int[][] products) {
        long answer = 0;
        for(int i =0 ; i < products.length; i++){

            long totalBenefit = 0;
            int aStand = n;
            int totalAmount = products[i][0];
            int price = products[i][1];
            int amount = products[i][2];


            if(totalAmount > amount * aStand){
                totalBenefit += amount* aStand * price ;
            }else{
                totalBenefit += totalAmount * price ;
            }
            aStand--;

        }
        return answer;
    }
}
