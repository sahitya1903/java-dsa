public class LinkedList {
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
    public static int size;

    public void addfirst(int data) {                //TC=O(1)
        Node newNode=new Node(data);//creation
        size++;
        if (head==null) {
            head=tail=newNode;
            return;
        }
        newNode.next=head;      //linking
        head=newNode;       //changing head
    }

    public void addlast(int data) {         //TC=O(1)
        Node newNode=new Node(data);        //creation
        size++;
        if (head==null) {
            head=tail=newNode;
            return;
        }
        tail.next=newNode;          //linking
        tail=newNode;                   //changing tail
    }

    public void add(int idx,int data) {
        if (idx==0) {
            addfirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while (i<idx-1) {
            temp=temp.next;
            i++;
        }

        // i=idx-1; temp ->previous element 
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public int removefirst() {
        if (size==0) {
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }
        else if (size==1) {
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    public int removelast() {
        if(size==0){
            System.out.println("Linked List is Empty");
            return Integer.MIN_VALUE;
        }
        else if (size==1) {
            int val= head.data;
            head=tail=null;
            size=0;
            return val;
        }
        //previous of tail=size-2
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }

        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }


    public int itrsearch (int key) {
        Node temp=head;
        int i=0;
        while (temp!=null) {
            if (temp.data==key) {
                return i;
            }
            temp=temp.next;
            i++;
        }
        //Key  
        return -1;
    }

    public int helper(Node head,int key) {
        if (head==null) {
            return -1;
        }

        if (head.data==key) {
            return 0;
        }
        int idx=helper(head.next, key);
        if (idx==-1) {
            return -1;
        }
        return idx+1;
    }

    public int recSearch (int key) {
        return helper(head,key);
    }

    public void reverse() {         //TC=O(n)
        tail=head;

        Node prev=null;
        Node curr=head;
        Node next;
        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }


    public void deleteNthfromEnd (int n) {
        int sz=0;
        Node temp=head;
        while (temp!=null) {
            temp=temp.next;
            sz++;
        }
        if (n==sz) {
            head=head.next;     //remove first
            return;
        }
    //To reach sz-n index
        int i=1;
        int iToFind=sz-n;
        Node prev=head;
        while (i<iToFind) {
            prev=prev.next;
            i++;
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
    
    // public int length(Node head){
    //     if (head==null) {
    //         return 0;
    //     }
    //     Node temp=head;
    //     int len=1;
    //     while (temp!=null) {
    //         len++;
    //         temp=temp.next;
    //     }
    //     return len;
    // }


    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.print();
        ll.addfirst(2);
        ll.print();
        ll.addfirst(1);
        ll.print();
        ll.addlast(4);
        ll.print();
        ll.addlast(5);
        ll.print();
        ll.add(2,3);
        ll.print();
        System.out.println("Size of LinkedList: " + LinkedList.size);
        ll.removefirst();
        ll.print();

        ll.removelast();
        ll.print();
        System.out.println("Size of LinkedList: " + LinkedList.size);
        System.out.println(ll.itrsearch(3));
        System.out.println(ll.itrsearch(10));
        System.out.println(ll.recSearch(3));
        System.out.println(ll.recSearch(10));

        ll.reverse();
        ll.print();
        ll.deleteNthfromEnd(3);
        ll.print();

        System.out.println(size);
        // System.out.println(ll.length(head));
    }
}
