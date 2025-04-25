import java.util.*;
public class Reversenumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number that needs to be reversed");
        int num = sc.nextInt();
        while(num>0){
            int lastdigit = num%10;
            System.out.print(lastdigit);
            num/=10;
            
        }
    }
}