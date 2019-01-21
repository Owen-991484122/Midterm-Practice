package students;
import java.util.Scanner;

/**
 *
 * @author oicr1
 */
public class StudentArray {

    public static void main(String args[]) {
        
        int num, id = 0;
        String name;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("How many students: ");
        num = in.nextInt();
        
        Student students[] = new Student[num];
        
        for(int i = 0; i < students.length; i++) {
            
            System.out.println("Please enter student no." + (i + 1) + " name");
            name = in.next();
            
            System.out.println ("Please enter student no." + (i + 1) + " id");
            id = in.nextInt();
            
            students[i] = new Student(name, id);
        }
        
        for(int i = 0; i < students.length; i++) {
            System.out.println("Student no." + (i + 1) + " name: " + students[i].getName());
            System.out.println("Student no." + (i + 1) + " id: " + students[i].getId());
        }
        
    }
}
