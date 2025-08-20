public class LinkedList3 {
    public class Node {
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addfirst(int data) {                //TC=O(1)
        Node newNode=new Node(data);//creation
        if (head==null) {
            head=tail=newNode;
            return;
        }
        newNode.next=head;      //linking
        head=newNode;       //changing head
    }
    private Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;

        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;  //mid
    }

    private Node merge(Node head1,Node head2){
        Node mergedLL=new Node(-1);
        Node temp=mergedLL;

        while (head1!=null && head2!=null) {
            if (head1.data <= head2.data) {
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }

        while (head1!=null) {
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }

        while (head2!=null) {
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }

        return mergedLL.next;
    }
    public Node mergeSort(Node head){
        if (head==null ||  head.next==null) {
            return head;
        }
        //find mid
        Node mid=getMid(head);
        //left and right ms
        Node rightHead=mid.next;
        mid.next=null;
        Node newLeft=mergeSort(head);
        Node newRight=mergeSort(rightHead);

        //merge
        return merge(newLeft,newRight);
    }

    public void zigzag() {
        //find mid
        Node slow=head;
        Node fast=head.next;
        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;

        //reverse 2nd half
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;

        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node left=head;
        Node right=prev;
        Node nextL,nextR;

        //alternate merging in zig zag fashion
        while (left!=null && right!=null) {
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;

            left=nextL;
            right=nextR;
        }
    }


    public void print() {               //TC=O(n)
        if (head==null) {
            System.out.println("Linked List is Empty");
            return;
        }
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        LinkedList3 ll=new LinkedList3();
        ll.addfirst(1);
        ll.addfirst(3);
        ll.addfirst(5);
        ll.addfirst(2);
        ll.addfirst(0);
        ll.addfirst(4);
        ll.print();
        ll.head=ll.mergeSort(ll.head);
        ll.print();
        ll.zigzag();
        ll.print();
    }
}
