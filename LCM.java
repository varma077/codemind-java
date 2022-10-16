import java.util.Scanner;
class LCM{
    public static void main(String args[]){
        int a,b,m;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        m=(a>b)?a:b;
        while(m!=0){
            if(m%a==0 && m%b==0){
                System.out.print(m);
                break;
            }
            m++;
        }
    }
}