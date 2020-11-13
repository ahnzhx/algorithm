package baekjoon.dp;

import java.util.*;

public class Baekjoon12865 {
    static class Product{
        private int weight;
        private int value;

        public Product(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }

    }
    public static int solution(Product[] products, int totalWeight){
        int max = Integer.MIN_VALUE;
        int tempTotalWeight = totalWeight;
        int count = 0;

        while(count < products.length){
            int totalValue = 0 ;
            for(int i = count ; i < products.length ; i++){
                if(tempTotalWeight - products[i].weight < 0){
                    continue;
                }else{
                    tempTotalWeight -= products[i].weight;
                }
                totalValue += products[i].value;

            }
            if(max < totalValue){
                max = totalValue;
            }
            count++ ;
            tempTotalWeight = totalWeight;
        }
        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numberOfProduct = sc.nextInt();
        int totalWeight = sc.nextInt();


        Product[] products = new Product[numberOfProduct];

        for(int i = 0 ; i < numberOfProduct; i++){
            int weight = sc.nextInt();
            int value = sc.nextInt();
            products[i] = new Product(weight, value);
        }
        System.out.println(solution(products, totalWeight));

    }

}
