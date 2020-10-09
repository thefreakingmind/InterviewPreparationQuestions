package CPImplementation;


import java.util.HashMap;
import java.util.Map;

class Node{
    int key;
    int value;
    Node prev;
    Node next;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}
public class LRUCaching {

    Node head;
    Node tail;
    Map<Integer, Node> map = new HashMap<>();
    int cap = 0;

    public LRUCaching(int Capacity) {
        this.map = new HashMap<>();
        this.cap = Capacity;
    }

    public int get(int key){
        if(map.get(key).equals(null)){
            return -1;
        }
        Node t = map.get(key);
        removeNode(t);
        offerNode(t);
        return t.value;
    }

    public void put(int Key, int Value){
        if(map.containsKey(Key)){
            Node t = map.get(Key);
            t.value = Value;


            removeNode(t);
            offerNode(t);

        }
        else if(map.size() > cap){
            map.remove(head.key);
            removeNode(head);
        }
        Node node = new Node(Key, Value);
        offerNode(node);
        map.put(Key, node);

    }

    public void removeNode(Node node) {
        if(node.prev.equals(null)){
            node.prev.next = node.next;

        }else {
            head = node.next;

        }

        if(!node.next.equals(null)){
            node.next.prev = node.prev;

        }else{
            tail = node.prev;
        }


    }

    public void offerNode(Node n) {
        if(tail!=null){
            tail.next = n;
        }

        n.prev = tail;
        n.next = null;
        tail = n;

        if(head == null){
            head = tail;
        }

    }
}
