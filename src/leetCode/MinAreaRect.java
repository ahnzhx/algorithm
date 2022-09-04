package leetCode;

import java.util.*;

public class MinAreaRect {
    public static int minAreaRect(int[][] points) {
        Map<Integer, List<Integer>> pointsMap = new HashMap<>();
        for (int[] point : points) {
            if (pointsMap.get(point[0]) == null) {
                List<Integer> temp = new ArrayList<>();
                temp.add(point[1]);
                pointsMap.put(point[0], temp);
            } else {
                List<Integer> temp = pointsMap.get(point[0]);
                temp.add(point[1]);
                pointsMap.put(point[0], temp);
            }
        }
        int minArea = Integer.MAX_VALUE;
        Object[] xPoints = pointsMap.keySet().toArray();
        Integer[] intXPoints = Arrays.asList(xPoints).toArray(new Integer[0]);

        for(int i =0; i < intXPoints.length-1; i++){
            for (int j = i+1; j < intXPoints.length; j++){
                // 두 리스트 중 일치하는 원소 가져오기
                List<Integer> sameYList = new ArrayList<>();
                for(int p : pointsMap.get(intXPoints[i])){
                    if(pointsMap.get(intXPoints[j]).contains(p)){
                        sameYList.add(p);
                    }
                }

                // 키 값들의 차이 구하기
                if(sameYList.size() >= 2){
                    int xLength = Math.abs(intXPoints[j]- intXPoints[i]);
                    int minValueY = getMinYLength(sameYList);
                    minArea = Integer.min(minArea, xLength * minValueY);
                }
            }

        }
        if(minArea == Integer.MAX_VALUE){
            minArea = 0;
        }
        return minArea;
    }

    public static int getMinYLength (List<Integer> sameYList){
        // 리스트에서 값 차이가 가장 작은 것 찾기
        int minValueY = Integer.MAX_VALUE;
        for (int p = 0; p< sameYList.size()-1; p ++){
            for(int q = p+1; q< sameYList.size(); q ++){
                minValueY = Integer.min(minValueY, Math.abs(sameYList.get(p)-sameYList.get(q)));
            }
        }
        return minValueY;
    }

    public static void main(String[] args) {
        int[][] points = {{1,1},{1,2},{1,3},{3,1},{3,3},{3,5},{4,1},{4,3},{4,4}};
        int[][] points2 = {{3,2},{3,1},{4,4},{1,1},{4,3},{0,3},{0,2},{4,0}};
        int[][] points3 = {{1,1},{1,3},{3,1},{3,3},{2,2}};

        System.out.println(minAreaRect(points));
    }
}
