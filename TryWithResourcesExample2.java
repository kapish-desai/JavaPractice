package batcave;

import java.util.Scanner;

public class TryWithResourcesExample2 {

    //this is much simpler but not standard
    //created only for my personal understanding
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter Your Age: ");
            int age=sc.nextInt();

            System.out.println("Age: "+age);
        }
        catch (RuntimeException e){
            System.out.println("Something went wrong");
        }
    }


}
