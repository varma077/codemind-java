import java.util.Scanner;
class SumOfTwoNumber{
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        double m;
        m=(int)Math.sqrt(n);
        if(n==(m*m)){
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
    }
}