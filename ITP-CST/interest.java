import java.util.*;
public class interest {
    public static void main(String ar[]){
        String name,rollno,fieldofinterest;
        Scanner in=new Scanner(System.in);
        System.out.println("\nEnter the name:\t");
        name=in.nextLine();
        System.out.println("\nEnter the roll-number:\t");
        rollno=in.nextLine();
        System.out.println("\nEnter the field of interest:\t");
        fieldofinterest=in.nextLine();
        System.out.println("\nYour name is :\t"+name);
        System.out.println("\nYour roll-no is :\t"+rollno);
        System.out.println("\nYour Field of Interest is :\t"+fieldofinterest);
    }
}
