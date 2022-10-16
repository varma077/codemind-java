import java.util.Scanner;
class ReverseInteger{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int sum=0;
        while(n!=0){
            sum=(sum*10)+(n%10);
            n/=10;
        }
        System.out.print(sum);
        
    }
}