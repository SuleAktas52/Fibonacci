import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int sayi=scan.nextInt();
        int n1=0,n2=1,seri=0;

        System.out.print(n1+" "+n2);
        for (int i=2;i<=sayi;i++){
            seri=n1+n2;
            n1=n2;
            n2=seri;

            System.out.print(" "+seri);
        }
    }
}
