import java.util.Scanner;
class CountDivisior{
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int m; 
        for (int i=n;i>0;i--){
            int fact=1;
            m=sc.nextInt();
            for(int j=2;j<=m;j++)
            fact=fact*j;
            System.out.println(fact);
        }
    }
}