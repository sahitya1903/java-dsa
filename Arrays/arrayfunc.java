public class arrayfunc {
    public static void update(int marks[],int nonchange) {
        nonchange=10;
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[]={97,98,99};
        int nonchange=5;
        update(marks,nonchange);
        for (int i=0;i<marks.length;i++){
            System.out.println("Marks:"+marks[i]);
        }
        System.out.println(nonchange);

    }
}
