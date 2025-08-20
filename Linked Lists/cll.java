public class cll{
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;

    public void add(int data){
        Node newNode=new Node(data);
        if (head==null) {
            head=tail=newNode;
            tail.next=head;
            return;
        }
        tail.next=newNode;
        tail=newNode;
        tail.next=head;
    }

    public int remove() {
        if (head==null) {
            System.out.println("LL empty");
            return Integer.MIN_VALUE;
        }else if (head==tail) {
            Node curr=head;
            head=tail=null;
            return curr.data;
        }
        Node curr=head;
        head=head.next;
        tail.next=head;
        return curr.data;
    }


    public void Print(){
        if (head==null) {
            System.out.println("LL empty");
            return;
        }
        Node curr=head;
        do {
            System.out.print(curr.data+"->");
            curr=curr.next;
        } while (curr!=head);
        System.out.println("null");
    }

    public static void main(String[] args) {
        cll s=new cll();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.Print();
        s.remove();
        s.Print();
    }
}

