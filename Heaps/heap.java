import java.util.ArrayList;
//Priority Queue is implemented in form of heap data structure
public class heap {
    static class MinHeap{
        ArrayList<Integer> list=new ArrayList<>();

        public void add(int data){
            //add at last
            list.add(data);

            int x=list.size()-1;     //Child Index
            int par=(x-1)/2;        //Parent Index

            while (list.get(x)<list.get(par)) {       //O(log n) 
                //swap
                int temp=list.get(x);
                list.set(x,list.get(par));
                list.set(par,temp);
                x=par;
                par=(x-1)/2;
            }
        }

        public int peek() {
            return list.get(0);
        }

        private void heapify(int i){
            int left=2*i+1;
            int right=2*i+2;
            int minIdx=i;

            if (left<list.size() && list.get(left)<list.get(minIdx)) {
                minIdx=left;
            }
            if (right<list.size() && list.get(right)<list.get(minIdx)) {
                minIdx=right;
            }

            if (minIdx!=i) {
                //swap
                int temp=list.get(i);
                list.set(i,list.get(minIdx));
                list.set(minIdx,temp);
                
                heapify(minIdx);
            }
        }

        public int remove(){
            int data=list.get(0);

            //step1- swap 1st and last
            int temp=list.get(0);
            list.set(0,list.get(list.size()-1));
            list.set(list.size()-1,temp);

            //step2- delete last
            list.remove(list.size()-1);

            //step3- heapify
            heapify(0);
            return data;
        }

        public boolean isEmpty(){
            return list.size()==0;
        }
        
    }

    static class MaxHeap{
        ArrayList<Integer> list=new ArrayList<>();

        public void add(int data){
            //add at last
            list.add(data);

            int x=list.size()-1;     //Child Index
            int par=(x-1)/2;        //Parent Index

            while (list.get(x)>list.get(par)) {       //O(log n) 
                //swap
                int temp=list.get(x);
                list.set(x,list.get(par));
                list.set(par,temp);

                x=par;
                par=(x-1)/2;
            }
        }

        public int peek() {
            return list.get(0);
        }


        private void heapify(int i){
            int left=2*i+1;
            int right=2*i+2;
            int maxIdx=i;

            if (left<list.size() && list.get(maxIdx)<list.get(left)) {
                maxIdx=left;
            }
            if (right<list.size() && list.get(maxIdx)<list.get(right)) {
                maxIdx=right;
            }

            if (maxIdx!=i) {
                //swap
                int temp=list.get(i);
                list.set(i,list.get(maxIdx));
                list.set(maxIdx,temp);
                
                heapify(maxIdx);
            }
        }
        public int remove(){
            int data=list.get(0);

            //step1- swap 1st and last
            int temp=list.get(0);
            list.set(0,list.get(list.size()-1));
            list.set(list.size()-1,temp);

            //step2- delete last
            list.remove(list.size()-1);

            //step3- heapify
            heapify(0);
            return data;
        }

        public boolean isEmpty(){
            return list.size()==0;
        }
    }

    public static void main(String[] args) {
        MinHeap pq1=new MinHeap();
        pq1.add(3);
        pq1.add(4);
        pq1.add(1);
        pq1.add(5);

        while (!pq1.isEmpty()) {        //heap sort
            System.out.print(pq1.remove()+" ");
        }
        System.out.println();

        MaxHeap pq2=new MaxHeap();
        pq2.add(3);
        pq2.add(4);
        pq2.add(1);
        pq2.add(5);

        while (!pq2.isEmpty()) {                //heap sort
            System.out.print(pq2.remove()+" ");
        }
        System.out.println();
    }
}
