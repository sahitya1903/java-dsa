public class LinkedList2 {
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

    public void addlast(int data) {         //TC=O(1)
        Node newNode=new Node(data);        //creation
        if (head==null) {
            head=tail=newNode;
        }
        tail.next=newNode;          //linking
        tail=newNode;                   //changing tail
    }

    //Check if LL is palindrome
    //Slow Fast Approach
    public Node findMid(Node head) {        //Helper function
        Node slow=head;
        Node fast=head;
        
        while (fast!=null  && fast.next!=null) {
            slow=slow.next;     //+1
            fast=fast.next.next;    //+2
        }
        return slow; //slow is midnode
    }

    public boolean checkPalindrome() {
        if (head==null || head.next==null) {
            return true;
        }

        //Find mid
        Node midNode=findMid(head);

        //Reverse Second half

        Node prev=null;
        Node curr=midNode;
        Node next;
        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node right=prev;        //Head of right half
        Node left=head;

        //Check left half and right half

        while (right!=null) {
            if (left.data!=right.data) {
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }

    //Cycle Detection in LinkedList (Floyd's Cycle Finding Algorithm)
    public boolean isCycle() {
        Node slow=head;
        Node fast=head;

        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast) {
                return true;
            }
        }
        return false;
    }

    //Remove Cycle in Linked List
    public void removeCycle() {
        //detect cycle
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if (fast==slow) {
                cycle=true;
                break;
            }
        }

        if (cycle==false) {
            return;
        }

        //find meeting point
        slow=head;
        Node prev=null;
        while (slow!=fast) {
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }

        //remove cycle
        prev.next=null;
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

    public static void main(String[] args) {
        LinkedList2 ll=new LinkedList2();
        head = ll.new Node(1);
        Node temp=ll.new Node(2);
        head.next = temp;
        head.next.next = ll.new Node(3);
        head.next.next.next = temp;
        //ll: 1-->2-->3-->2
        // ll.print();
        // System.out.println(ll.checkPalindrome());
        System.out.println(ll.isCycle());
        ll.removeCycle();
        System.out.println(ll.isCycle());
    }
}