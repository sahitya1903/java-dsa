public class sorting {

    public static void bubble(int arr[]) {
        for(int turn=0;turn<arr.length-1;turn++){
            boolean swap=false;
            for (int j=0;j<arr.length-1-turn;j++){ 
                if (arr[j]>arr[j+1]){
                    swap=true;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
            if(!swap){
                return;
            }
        }
    }

    public static void selection(int arr[]) {
        for (int i=0;i<arr.length-1;i++){
            int minPos=i;
            for (int j=i+1;j<arr.length;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
    }

    public static void insertion (int arr[]) {
        for (int i=1;i<arr.length;i++){
            int curr=arr[i];
            int previdx=i-1;
            while (previdx>=0 && arr[previdx]>curr){
                arr[previdx+1]=arr[previdx];
                previdx--;
            }
            arr[previdx+1]=curr;
        }
    }

    public static void counting(int arr[]) {
        int largest=Integer.MIN_VALUE;
        for (int i=0; i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }
        int count[]=new int [largest+1];
        for (int i=0; i<arr.length;i++){
            count[arr[i]]++; 
        } 

        int j=0;
        for(int i=0; i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
  
    public static void Print (int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void main (String[] args) {
        int arr[]= {5,4,1,3,2};
        int arr2[]={1,4,1,3,2,4,3,7};
        selection(arr);
        counting(arr2);  
        Print(arr);
        Print(arr2);
    }
}
