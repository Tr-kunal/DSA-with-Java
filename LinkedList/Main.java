package LinkedList;

public class Main {
    public static void main(String[] args) {
        //  LL list = new LL();
        //  list.insertFirst(3);
        //  list.insertFirst(2);
        //  list.insertFirst(8);
        //  list.insertFirst(17);
        //  list.insertLast(25);
        //  list.insertLast(84);

        //  list.insertNthpos(14, 3);
        //  System.out.println(list.deleteFirst());
        //  System.out.println(list.deleteLast());
        //  System.out.println(list.deleteNthIdx(3));
        //  System.out.println(list.getNode(14));
        //  list.display();

        DLL dll = new DLL();
        dll.insertFirstDLL(5);
        dll.insertFirstDLL(8);
        dll.insertFirstDLL(4);
        dll.insertFirstDLL(9);
        dll.insertFirstDLL(15);
        dll.reverse();
        dll.display();

    }
    
}
