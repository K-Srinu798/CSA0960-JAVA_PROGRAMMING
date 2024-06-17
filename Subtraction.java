import java.util.Scanner;
class Subtraction{
    public static void main(String[] args){
        int a,b,sub=0;
        Scanner sy = new Scanner(System.in);
        System.out.println("Enter first number:");
        a=sy.nextInt();
        System.out.println();
        b=sy.nextInt();
        sub=a-b;
        System.out.println("Subtraction:"+sub);
        
    }
}