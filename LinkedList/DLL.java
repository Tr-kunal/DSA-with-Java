package LinkedList;

public class DLL {

    Node head;
    Node tail;
    int size;

    public DLL() {
        this.size = 0;
    }

    public class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    public void insertFirstDLL(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;

        if (head != null) {
            head.prev = node;
        } else {
            tail = node; 
        }

        head = node;
        size++;
    }

    public void insertLastDLL(int val) {
        Node node = new Node(val);
        node.next = null;
        node.prev = tail;

        if (tail != null) {
            tail.next = node;
        } else {
            head = node;
        }

        tail = node;
        size++;
    }

    public void insertAtIdxDLL(int val, int idx){
        if(size<=1){
            insertFirstDLL(val);
            return;
        }
        if(size == idx){
            insertLastDLL(val);
            return;
        }

        Node temp = head;
        for(int i=1;i<idx;i++){
            temp = temp.next;
        }
        
        Node node = new Node(val);
        
        node.next = temp.next;
        node.prev = temp;
        temp.next.prev = node;
        temp.next = node;


    }

    public int deleteFirstDLL() {

        int val = head.val;
        head = head.next;

        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }

        size--;
        return val;
    }

    public int deleteLastDLL() {

        int val = tail.val;
        tail = tail.prev;

        if (tail != null) {
            tail.next = null;
        } else {
            head = null;
        }

        size--;
        return val;
    }

    public int deleteAtIndexDLL(int idx) {

        if (idx == 0) return deleteFirstDLL();
        if (idx == size - 1) return deleteLastDLL();

        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }

        int val = temp.next.val;
        temp.next = temp.next.next;
        temp.next.prev = temp;

        size--;
        return val;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " <-> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public void reverse() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.val + " <-> ");
            temp = temp.prev;
        }
        System.out.println("START");
    }
}
