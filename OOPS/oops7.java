public class oops7 {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        student s1=new student();
        s1.school="JNV";

        student s2=new student();
        System.out.println(s2.school);

        student s3=new student();
        s3.school="KV";
        System.out.println(s1.school);
    }
}

class student{
    static int percent(int m, int p, int c){
        return (m+p+c)/3;
    }

    String name;
    int roll;

    static String school;

    void setname(String name){
        this.name=name;
    }

    String getname(){
        return this.name;
    }
}
