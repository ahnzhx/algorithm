package leetCode;

import java.util.HashMap;

public class LRUCache {
    private final int CAPACITY;
    private HashMap<Integer, Node> map;
    private Node head;
    private Node tail;

    private static class Node{
        Node prev;
        Node next;
        int key;
        int val;

        Node(int key, int val){
            this.key = key;
            this.val = val;
        }
    }

    public LRUCache(int capacity) {
        CAPACITY = capacity;
        map = new HashMap<>();
        head = new Node(-1, -1);
        tail = new Node(-1, -1);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        Node res = map.get(key);
        if(res == null){
            return -1;
        }
        moveToHead(res);
        return res.val;
    }

    private void add(Node node){
        Node old = map.get(node.key);
        if(old != null){
            remove(old);
        }
        map.put(node.key, node);

        node.next =head.next;
        node.prev = head;
        head.next.prev = node;
        head.next =node;
    }
    private void moveToHead(Node node){
        remove(node);
        add(node);
    }

    private void remove(Node node){
        map.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    private void removeTail(){
        remove(tail.prev);
    }

    public void put(int key, int value) {
        add(new Node(key, value));
        if(map.size() > CAPACITY){
            removeTail();
        }
    }
}
