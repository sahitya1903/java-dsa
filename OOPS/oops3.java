public class oops3 {
    public static void main(String[] args) {
        Student s1=new Student("Sahitya");
        s1.roll=456;
        s1.password="abcd";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=95;
        System.out.println(s1.name );
        Student s2=new Student(s1);
        s1.marks[2]=100;
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]); 
        }
    }
}

class Student{      //Constructor overloading
    String name;
    int roll;
    String password;
    int marks[];

    Student(Student s1){        //Shallow Copy constructor
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        this.marks=s1.marks;
    }

    // Student(Student s1){        //Deep Copy constructor
    //     marks=new int[3];
    //     this.name=name;
    //     this.roll=roll;
    //     for(int i=0;i<marks.length;i++){
    //         this.marks[i]=s1.marks[i];
    //     }
    // }

    Student(String name){ //Parametrized constructor
        marks=new int[3];
        this.name=name;
        System.out.println("constructor called");
    }

    Student(){ //non Parametrized constructor
        marks=new int[3];
        System.out.println("constructor called");
    }

    Student(int roll){ //Parametrized constructor
        marks=new int[3];
        this.roll=roll;
        System.out.println("constructor called");
    }
}