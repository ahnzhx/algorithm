package programmersPaidClass.week2;

import java.util.LinkedList;
import java.util.Queue;


public class Quest67693 {
    public int sumOfTrucksWeights ;

    class Truck{
        private int weight;
        private int distance;

        public int getWeight() {
            return weight;
        }

        public int getDistance() {
            return distance;
        }

        public Truck(int weight, int distance) {
            this.weight = weight;
            this.distance = distance;
        }

        public boolean isPossibleToCross(int weight){
            if(sumOfTrucksWeights + this.weight <= weight){
                return true;
            }
            return false;
        }

        public void moveTruck(){
            this.distance -= 1;
        }
    }

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int totalSecond = 0;
        Queue<Truck> waitTruck = new LinkedList<>();
        Queue<Truck> crossTruck = new LinkedList<>();

        for(int truckWeight : truck_weights){
            waitTruck.add(new Truck(truckWeight, bridge_length ));
        }

        while(!waitTruck.isEmpty() || !crossTruck.isEmpty()){
            totalSecond++;

            if(crossTruck.size() > 0){
                if(crossTruck.peek().distance == 0){
                    sumOfTrucksWeights -= crossTruck.remove().getWeight();
                }
            }
            if(waitTruck.size() > 0 ) {
                if (waitTruck.peek().isPossibleToCross(weight)) {
                    Truck truck = waitTruck.poll();
                    sumOfTrucksWeights += truck.getWeight();
                    crossTruck.offer(truck);
                }
            }
            crossTruck.stream().forEach(t -> t.moveTruck());
        }
        return totalSecond;
    }
}
