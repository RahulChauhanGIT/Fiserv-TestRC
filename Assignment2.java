package JavaFundamentals;

public class Assignment2 {
    public static void main(String[] args){

        //Smallest Number out of 3 numbers
        int x = 14; int y = 12; int z = 10;
        if(x<y && x<z){
            System.out.println("Smallest number is "+x);
        }
        if(y<x && y<z){
            System.out.println("Smallest number is "+y);
        }
        if(z<x && z<y){
            System.out.println("Smallest number is "+z);
        }

        //Factorial of a value using while loop
        int i = 6; int j=1;
        int fact = 1;
        while(j<=i){
            fact=fact*i;
            i--;
        }
        System.out.println("Factorial of value is "+fact);

        //Reverse a given number
        int a = 3482;
        while(a!=0) {
            int b = a % 10;
            System.out.print(b);
            a=a/10;
        }
    }
}
