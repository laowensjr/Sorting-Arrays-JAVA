import javax.swing.*;

public class CoffeeDriver
 {

 public static void sort(String[] itemName)

 {


 }//closes sortName method

 public static void sort(double[] itemPrice)
 {

 }

 public static void main(String[] args)
 {

 String[] itemName = new String[5];
 double[] itemPrice = new double[5];
 String prompt;
 String k;
 double j;

 itemName[0] = “Coffee”;
 itemName[1] = “Water”;
 itemName[2] = “Milk”;
 itemName[3] = “Bagel”;
 itemName[4] = “Donut”;

 itemPrice[0] = 1.00;
 itemPrice[1] = 2.00;
 itemPrice[2] = 1.50;
 itemPrice[3] = 1.25;
 itemPrice[4] = 0.75;

 prompt = JOptionPane.showInputDialog(null, “Welcome to Wings Coffee Shop. We have a great list items on our menu. \nWould you like to see these items sorted by name or by price? (n / p): “,
 “Please select your sort Method”, JOptionPane.QUESTION_MESSAGE);
 prompt.toLowerCase();
 if(prompt.equals(“n”))
 sort(itemName);
 JOptionPane.showMessageDialog(null, “The values are: $ ” + itemName);


 if (prompt.equals(“p”))
 sort(itemPrice);
 JOptionPane.showMessageDialog(null, “The values are: $ ” + itemPrice);


 }
 }