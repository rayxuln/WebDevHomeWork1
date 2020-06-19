

public class HomeWork1 {
    public static void main(String[] args){
        for(int i=1;i <= 200; ++i)
        {
            System.out.print("Fibonacci of ");
            System.out.print(i);
            System.out.print(" == ");
            System.out.print(Fibonacci.of(i));
            System.out.print("\n");
        }
    }
}