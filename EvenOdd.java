import java.util.Scanner;
  
class EvenOdd{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number : ");
       int num = sc.nextInt();
       
       if (num == 0){
          System.out.println("its value 0");
          } 
       else if (num % 2 == 0){
          System.out.println("its a even number");
          }
    
       else{
          System.out.println("its a odd number");
          }
        
       sc.close();
       }
    } 