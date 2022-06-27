package leetCode.graph;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        //todo 양 옆으로 줄어들도록 짜야함
        int i = 0; int j = height.length-1; int maxAmount =0; int tempAmount = 0;
        while(i<j){
            tempAmount = Integer.min(height[i], height[j])*(j-i);
            maxAmount = Integer.max(tempAmount, maxAmount);
            if(height[i] < height[j]){
                i++;
            }else{
                j--;
            }

        }
        return maxAmount;
    }

    public static void main(String[] args) {
        int[] height1 = {1,8,6,2,5,4,8,3,7};
        int[] height2 = {1,1};
        int[] height3 = {4,3,2,1,4};
        int[] height4 = {1,2,1};
        System.out.println(maxArea(height1));
        System.out.println(maxArea(height2));
        System.out.println(maxArea(height3));
        System.out.println(maxArea(height4));
    }
}
