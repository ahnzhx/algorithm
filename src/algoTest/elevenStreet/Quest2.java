package algoTest.elevenStreet;

import java.util.LinkedList;
import java.util.Queue;

public class Quest2 {
    static class Veterinarian{
        Queue<String> q = new LinkedList<String>();
        public Veterinarian() {
        }

        public void accept(String petName) {
            q.offer(petName);
        }

        public String heal() {
            return q.poll();
        }
    }


    public static void main(String[] args) {
        Veterinarian veterinarian = new Veterinarian();
        veterinarian.accept("Barkley");
        veterinarian.accept("Mittens");
        System.out.println(veterinarian.heal());
        System.out.println(veterinarian.heal());
    }
}
