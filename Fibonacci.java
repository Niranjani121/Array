public class Fibonacci{
    public static void main(String[] args){
        int a=1,b=2,c;

        System.out.println("First 10 Fibonacci numbers");
        System.out.println(a+""+b+"");

        for(int i=3;i<=10;i++){
            c=a+b;
            System.out.println(c+"");
            a=b;
            b=c;
        }

    }
}