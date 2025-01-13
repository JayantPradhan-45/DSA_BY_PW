package Strings;
public class DeleteAndInsert {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("jayant");
        System.out.println(s);
        s.deleteCharAt(3);  //delete particular index of string/ string builder
        System.out.println(s);
        s.delete(1,4); //delete particular range of string / string builder
        System.out.println(s);
        s.insert(1,'t'); // add char/int/boolean in any place of sting/ stringBuilder
        System.out.println(s);
    }
}
