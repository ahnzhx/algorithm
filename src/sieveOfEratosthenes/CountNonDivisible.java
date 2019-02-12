package sieveOfEratosthenes;

public class CountNonDivisible {

    // 100% O(N*log(N))     어떻게 이게 가능하지..? 어떻게 이 알고리즘이 되는거지...?
    public static int[] solution2(int[] A) {
        int[] counts = new int[A.length * 2 + 1];
        for (int number : A) {
            counts[number]++;
        }

        int[] divisorNums = new int[counts.length];
        for (int i = 1; i * i < divisorNums.length; i++) {
            for (int j = i * i; j < divisorNums.length; j += i) {
                divisorNums[j] += counts[i];
                if (j != i * i) {
                    divisorNums[j] += counts[j / i];
                }
            }
        }

        int[] result = new int[A.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = A.length - divisorNums[A[i]];
        }
        return result;
    }

    public static void main(String []args){
        int []a = {3,1,2,3,6};
        System.out.println(solution2(a));
    }
}
