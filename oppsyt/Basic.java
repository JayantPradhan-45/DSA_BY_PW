package oppsyt;
class student{
    //propreties of student
    int roll;
    String name;
    double mark;
    //we will make constructor
    student(int roll,String name , double mark){
        this.mark=mark;
        this.name=name;
        this.roll=roll;
    }
}
public class Basic {
    public static void main(String[] args){
        student s1=new student(13,"jayat pradha",90.3);
        System.out.println(s1.roll  + " "+ s1.name);
        //using dot operator we can access from student class
//        s1.mark=30.2;
//        s1.name="jayant pradhan";
//        s1.roll=18;
//        System.out.println(s1.roll);
//        System.out.println(s1.mark);
//        System.out.println(s1.name);
    }
}
