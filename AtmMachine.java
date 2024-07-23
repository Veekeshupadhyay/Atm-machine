import java.util.Scanner;
class User_Account{
    
     double balance=10000.0d;
     public void checkbalance(){
        System.out.println("Now Your Balance is "+balance);
     }
     public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Amount is successfully deposited");
        }
        else{
            System.out.println("Invalid Deposit Amount");
        }
     }
     public void withdraw(double amount1){
        if (amount1>0&&amount1<=balance) {
            balance-=amount1;   
           }
           else if(amount1>balance){
             System.out.println("Insufficient Balance to withdraw");  
           }
           else{
            System.out.println("Invalid Withdrawl Amount");
           }
     }
        public void menu(){
            Scanner sc=new Scanner(System.in);
            System.out.println("1.Check Balance");
            System.out.println("2.deposit");
            System.out.println("3.withdraw");
            System.out.println("4. Exit"); 
            int a=sc.nextInt();
            if(a==1){
                checkbalance();
                menu();
            }
           else if(a==2){
                System.out.println("ENTER THE AMOUNT YOU WANT TO DEPOSIT :");
                double n=sc.nextDouble();
                deposit(n);
                menu();
            }
           else if(a==3){
            System.out.println("ENTER THE AMOUNT YOU WANT TO WITHDRAW :");
            double k=sc.nextDouble();
            withdraw(k);
            menu();

           }
           else if(a==4){
            System.out.println("Exited from your Account");
            return;
           }
           else{
            System.out.println("There is no option for your entered input Try Again!");
            menu();

           }
        } 

    }

public class AtmMachine{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        User_Account account=new User_Account();
        System.out.println("Welcome to The ATM Machine");
        while(true){
        int pin=1234;
        System.out.println("Enter the pin to get into Your Account");
        int pass=in.nextInt();
    if(pass==pin){ 
    account.menu();
    }
     else{
        System.out.println("Invalid PIN");
    
     }   
    }
}
}