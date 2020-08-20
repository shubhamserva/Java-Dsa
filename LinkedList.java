public class LinkedList {
    Node head;
        static class Node{
            int data;
            Node next;
            Node(int d){
                this.data = d;
                next = null;
            }
        }

        public static LinkedList insert(LinkedList ll,int data){

            Node node1 = new Node(data);

            if(ll.head == null){
                ll.head = node1;
            }
            else {
                Node last = ll.head;
                while(last.next != null){
                    last = last.next;
                }
                last.next = node1;
            }
            return ll;
        }
        public static void printLinklist(LinkedList ll){
            Node print = ll.head;
            System.out.println("Printing linked List");
            while(print != null){
                System.out.println(print.data);
                print  = print.next;
            }
            System.out.println();
        }
        public  static void main(String args[]){

            LinkedList l1 = new LinkedList();

            l1.insert(l1, 1);
            l1.insert(l1, 2);

            printLinklist(l1);
        }


}