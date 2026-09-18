import java.util.Scanner;
public class VendingMachine {
    public static void main(String[] args) throws Exception {
        
      int totalItemsPurchased = 0;
      double totalCost = 0.0;

        while (true) {
        
        Scanner sc = new Scanner(System.in);
    
         String[][] products = {
         {"Garrett Mix", "Pecan Carmel Crisp", "Plain"},
         {"Caramel Crisp", "Cashew Carmel Crisp", "Buttery"},
         {"Cheese Corn", "Almond Carmel Crisp", "Sweet Corn"}
        };

        double[][] prices = {
        {14.99, 10.99, 6.99},
        {16.99, 9.99, 8.99},
        {12.99, 11.99, 7.99}
        };

      System.out.println("Row      Column P         Column N                 Column R");
      System.out.println("0        Garrett Mix      Pecan Carmel Crisp       Plain");
      System.out.println("1        Caramel Cris     Cashew Carmel Crisp      Buttery");
      System.out.println("2        Cheese Corn      Almond Carmel Crisp      Sweet Corn");
     
  System.out.println("Listed above are items you can select.");
  System.out.print("Please enter row of desired product: ");
  int row = sc.nextInt();
  sc.nextLine(); // Consume the newline character after nextInt()
  while (row < 0 || row > 2) {
            System.out.print("Invalid Entry, Please enter row of desired product: ");
            row = sc.nextInt();
            sc.nextLine();

  }
  System.out.print("Please enter column of desired product: ");
  String column = sc.nextLine();
  while (!column.equals("P") && !column.equals("N") && !column.equals("R")) {
            System.out.print("Invalid Entry, Please enter either capital P, N or R of desired product: ");
            column = sc.nextLine();
  }
  
      if (column.equals("P")) {
          System.out.println("You enter selected " + products[row][0] + " for a price of " + prices[row][0]);
          totalItemsPurchased++;
          totalCost += prices[row][0];
      } else if (column.equals("N")) {
          System.out.println("You enter selected " + products[row][1] + " for a price of " + prices[row][1]);
          totalItemsPurchased++;
          totalCost += prices[row][1];
      } else if (column.equals("R")) {
          System.out.println("You enter selected " + products[row][2] + " for a price of " + prices[row][2]);
          totalItemsPurchased++;
          totalCost += prices[row][2];
      }

          System.out.print("Please enter row of selected product or -1 to exit: ");
          row = sc.nextInt();
          sc.nextLine(); // Consume the newline character after nextInt()
          if (row == -1) {
              System.out.println("******************");
              System.out.println(totalItemsPurchased + " items purchased for a total cost of $" + totalCost);
              System.out.println("Exiting the vending machine. Thank you!");
              break; // Exit the loop and terminate the program
          
      }
 
  }

    }
}
