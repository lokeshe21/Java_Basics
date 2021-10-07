import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        int n1=0, n2=1, n3, i , n;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        i=3;
        System.out.print(n1+" ");
         System.out.print(n2+" ");
        while(i<=n){
          n3=n1+n2;
          System.out.print(n3+" ");
          n1=n2;
          n2=n3;
          i=i+1;
          
        }
        
    }
}