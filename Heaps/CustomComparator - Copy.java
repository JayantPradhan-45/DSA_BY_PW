package Heaps;
//this is for compare two value according to which is you nedded
import java.util.Arrays;
//user define class
class Student implements Comparable<Student>{
    int rno;
    double perc;
    String name;
    //constructor
    Student(int rno,double perc,String name){
        this.rno=rno;
        this.perc=perc;
        this.name=name;
    }
    public int compareTo(Student s){
        return this.rno - s.rno;
    }

}
public class CustomComparator {
    public static void print(Student[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i].name + " ");
            System.out.print(arr[i].rno + " ");
            System.out.println(arr[i].perc);
        }
        System.out.println();

    }
    public static void main(String[] args){
        Student[] s=new Student[4];
        s[0]=new Student(76,89.5,"jayant");
        s[1]=new Student(77,90.6,"deepK");
        s[2]=new Student(40,99.5,"rohant");
        s[3]=new Student(34,70.6,"raja");
        print(s);
        Arrays.sort(s);
        print(s);


    }


}
