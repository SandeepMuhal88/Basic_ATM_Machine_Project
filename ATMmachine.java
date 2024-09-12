import java.util.*;
 class ATM {
    float Balance;
    int PIN=4545;
    public Void Checkpin(){
        System.out.println("Enter your PIN:- ");
        Scanner sc =new Scanner(System.in);
        int enterpin=sc.nextInt();
        if(enterpin==PIN){
            menu();
        }
        else{
            System.out.println("Invild PIN ,, Please Enter a vaid pin");

        }
        return null;
    }
    public void menu(){
        System.out.println("Enter Your Choice");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3.Deposit Money");
        System.out.println("4. Exit");
        Scanner sc=new Scanner(System.in);
        int opt=sc.nextInt();
        if(opt==1){
            chekbalance();
        }
        else if(opt==2){
            withdrawmoney();

        }
        else if(opt==3){
            depositmoney();
        }else if(opt==4){
            return;
        }
        else{
            System.out.println("Enter a vilad number");
        }
    }
    public void chekbalance(){
        System.out.println("Balance= "+Balance);
        menu();
    }
    public void withdrawmoney(){
        System.out.println("Enter Amount to withdraw");
        Scanner sc= new Scanner(System.in);
        float  amount=sc.nextFloat();
        if(amount>Balance){
            System.out.println("Insufficient Balance");
        }else{
            Balance=Balance-amount;
            System.out.println("Widraw money is successfully:");
        }
        menu();
    }
    public void depositmoney(){
            System.out.println("Enter the ammount");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        Balance=Balance+amount;
        System.out.println("Money Diposit is sussecefully");
        menu();

    }

}
public class ATMmachine {

    public static void main(String[] args) {
        ATM obj=new ATM();
        obj.Checkpin();

        
    }
}

