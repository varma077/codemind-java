import java.util.Scanner;
class SelfDividingNumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        int i,n,d,k=0;
        for(i=a;i<=b;i++){
            n=i;
            k=0;
            while(n!=0){
                d=n%10;
                if(d==0){
                    k=0;
                    break;
                }
                if(i%d==0){
                    k=1;
                }
                else{
                    k=0;
                    break;
                }
                n=n/10;
            }
            if(k==1){
                System.out.print(i+" ");
            }
        }
    }
}