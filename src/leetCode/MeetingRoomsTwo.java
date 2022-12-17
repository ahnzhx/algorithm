package leetCode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MeetingRoomsTwo {
    public static int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));
        var heap = new PriorityQueue<int[]>(Comparator.comparingInt(i -> i[1]));
        for (var meeting: intervals) {
            heap.offer(meeting);
            if (heap.peek()[1] <= meeting[0]) {
                heap.poll();
            }
        }
        return heap.size();
    }

    public static void main(String[] args) {
//        int[][] intervals = {{0, 30}, {5,10}, {15,20}};
//        int[][] intervals = {{2, 11}, {6,16}, {11,16}};
        int[][] intervals = {{7,10}, {2,4}, {4,6}, {8,9}};
//        int[][] intervals = {{13,15}, {1,13}};
        System.out.println(minMeetingRooms(intervals));
    }
}
