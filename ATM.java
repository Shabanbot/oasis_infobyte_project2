import java.util.Scanner;

public class ATM {
   public ATM() {
   }

   public static void main(String[] var0) {
      User var1 = new User("12345", "6789", 1000.0);
      Scanner var2 = new Scanner(System.in);
      System.out.print("Enter User ID: ");
      String var3 = var2.nextLine();
      System.out.print("Enter User PIN: ");
      String var4 = var2.nextLine();
      if (var3.equals(var1.getUserId()) && var4.equals(var1.getUserPin())) {
         System.out.println("Welcome to the ATM!");

         while(true) {
            while(true) {
               System.out.println("Select an option:");
               System.out.println("1. Transactions History");
               System.out.println("2. Withdraw");
               System.out.println("3. Deposit");
               System.out.println("4. Transfer");
               System.out.println("5. Quit");
               int var5 = var2.nextInt();
               switch (var5) {
                  case 1:
                  case 4:
                     break;
                  case 2:
                     System.out.print("Enter the amount to withdraw: ");
                     double var6 = var2.nextDouble();
                     var1.withdraw(var6);
                     break;
                  case 3:
                     System.out.print("Enter the amount to deposit: ");
                     double var8 = var2.nextDouble();
                     var1.deposit(var8);
                     break;
                  case 5:
                     System.out.println("Thank you for using the ATM!");
                     System.exit(0);
                     break;
                  default:
                     System.out.println("Invalid option. Please try again.");
               }
            }
         }
      }

      System.out.println("Invalid User ID or PIN. Exiting...");
      var2.close();
   }
}
