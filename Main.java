import java.util.Scanner;
/** this program will ask for 10 numbers from the user and will find any number in the array based on the user input
 *
 * @author Isaac
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner input = new Scanner(System.in);
    
    int arnum = 10;
    int[] num = new int[arnum];
    System.out.print("Please enter 10 integers " );
    for(int i = 0; i < num.length; i++){
      
      num[i] = input.nextInt();
    }
    System.out.println("Please enter a number to find");
    int findnum = input.nextInt();
    for(int i = 0; i < num.length; i++)
    if(findnum == num[i]){
      System.out.println("The number is on line " + (i + 1));
    }



  }
}
