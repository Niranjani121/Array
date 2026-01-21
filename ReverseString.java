import java.util.Scanner;

public class ReverseString{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number of string:");
        int n=sc.nextInt();

        String[] str=new String[n];
        System.out.println("Enter Strings:");

        for(int i=0;i<n;i++){
            str[i]=sc.next();
        }

        System.out.println("String Reversed:");
        for(int i=n-1;i>=0;i--){
            System.out.println(str[i]);
        }
    }
}