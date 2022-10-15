import java.util.Scanner;
class DifferenceblePdctandSum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num;
        num=sc.nextInt();
        int pdct=1,sum=0;
        while(0<num){
            pdct*=(num%10);
            sum+=(num%10);
            num=num/10;
        }
    
        System.out.print(pdct-sum);
        
    }
}