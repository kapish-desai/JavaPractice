package batcave;

public class FinallyWithoutExceptionExample {
    public static void main(String[] args) {

      try {
          int[] array = {90, 96, 83, 47, 89};
          System.out.println(array[4]); //valid index not exception will occur
      }
      catch (ArrayIndexOutOfBoundsException e){
          System.out.println("Invalid index"); //this will not execute because no exception occured
      }
      finally {
          System.out.println("Finally Block Executes no matter what");
      }
    }
}
