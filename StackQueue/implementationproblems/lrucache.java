package StackQueue.implementationproblems;

import java.util.HashMap;

class Node {
    int key;
    int val;
    Node next;
    Node prev;

    Node(int key1, int val1) {
        key = key1;
        val = val1;
    }
}

public class lrucache {

    Node head = new Node(-1, -1);
    Node tail = new Node(-1, -1);
    int cap;
    HashMap<Integer, Node> m = new HashMap<>();

    public lrucache(int capacity) {
        cap = capacity;
        head.next = tail;
        tail.prev = head;
    }

    void addNode (Node newNode){
        Node temp = head.next;

        newNode.next = temp;
        newNode.prev = head;

        head.next = newNode;
        temp.prev = newNode;
    }

    void deleteNode(Node delNode){
        Node delprev = delNode.prev;
        Node delnext = delNode.next;

        delprev.next = delnext;
        delnext.prev =delprev;
    }

    public int get(int key){
        if(m.containsKey(key)){
            Node resNode = m.get(key);
            int res = resNode.val;

            deleteNode(resNode);

            addNode(resNode);

            return  res;
        }
        return -1;
    }

    public void put (int key,int val){
        if(m.containsKey(key)){
            Node existingNode = m.get(key);

            deleteNode(existingNode);
            m.remove(key);
        }
        if(m.size()==cap){
            Node lru = tail.prev;
            m.remove(lru.key);
            deleteNode(lru);
        }

        Node newNode = new Node(key, val);
        addNode(newNode);
        m.put(key, newNode);
    }


    public static void main(String[] args) {
        // Create cache with capacity 2
        lrucache cache = new lrucache(2);

        // Put values in cache
        cache.put(1, 1);
        cache.put(2, 2);

        // Get value for key 1
        System.out.println(cache.get(1));

        // Insert another key (evicts key 2)
        cache.put(3, 3);

        // Key 2 should be evicted
        System.out.println(cache.get(2));

        // Insert another key (evicts key 1)
        cache.put(4, 4);

        // Key 1 should be evicted
        System.out.println(cache.get(1));

        // Key 3 should be present
        System.out.println(cache.get(3));

        // Key 4 should be present
        System.out.println(cache.get(4));
    }
}

