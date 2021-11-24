import java.util.Scanner;
public class Recursion {
    public static void main(String[] args) {
        Recursion ob= new Recursion();
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number to find factor: ");
        int num=sc.nextInt();
        System.out.println("The factor of "+num+" is "+ob.function(num));
        


        
    }

    private int function(int num) {
        if(num==0){
            return 1;
        }
        else{
            System.out.println(num);

            return num*function(num-1);

        }
        
    }
    
}
/*
Output:
Enter a number to find factor: 4
4
3
2
1
The factor of 4 is 24
*/
