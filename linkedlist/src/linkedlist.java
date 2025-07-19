public class linkedlist {
    public static class Node{
        int data;
        Node pointer;

        Node(int data){
            this.data=data;
            this.pointer=null;
        }
    }

    public static class LinkedList {

       static  Node head ;
        static Node tail ;

        public static void front (int data){

            Node newnode = new Node(data);

            if(head==null){
                head = newnode;
                return;
            }

            newnode.pointer = head;
            head= newnode;
        }

        public static void back (int data){

            Node newnode = new Node(data);

            if(tail==null){
                tail = newnode;
                return;
            }

            newnode.pointer = head;
            head= newnode;
        }


        public static void display(){

            Node temp = head;

            while(temp!=null){
                System.out.print(temp.data+" -> ");
                temp=temp.pointer;

            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {

        LinkedList li = new LinkedList();
        li.front(10);
        li.front(10);
        li.front(10);
        li.front(10);
        li.display();
    }


}
