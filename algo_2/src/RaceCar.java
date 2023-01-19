import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class RaceCar {
    class Car {
        int position;
        int speed;
        int moves;

        public Car(int moves, int position, int speed){
            this.position = position;
            this.speed = speed;
            this.moves = moves;
        }
    }

    public int racecar(int target) {
        LinkedList<Car> queue = new LinkedList<>();
        queue.addLast(new Car(0,0,1));
        Set<Car> visited = new HashSet<>();

        while(!queue.isEmpty()){
            Car car = queue.pollFirst();
            if(car.position == target){
                return car.moves;
            }

            if(visited.contains(car)){
                continue;
            }else{
                visited.add(car);
                queue.addLast(new Car(car.moves+1, car.position+car.speed, car.speed*2));

                if((car.position + car.speed > target && car.speed >0) ||
                        (car.position + car.speed < target && car.speed <0)){
                    if(car.speed >0){
                        car.speed=-1;
                    }else{
                        car.speed =1;
                    }

                    queue.addLast(new Car(car.moves +1, car.position, car.speed));

                }

            }
        }


        return 0;
    }
}
