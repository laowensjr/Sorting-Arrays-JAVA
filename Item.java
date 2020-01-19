import javax.swing.*;

public class Item
{

private String itemName;
private double itemPrice;


//Constructor
Item(String itemName, double itemPrice)//Receives single itemName and single itemPrice
{
this.itemName = itemName;
this.itemPrice = itemPrice;
}

//Get and Set Methods for Item Name
public String getItemName()
{
return itemName;
}

public void setItemName(String myItemName)
{
itemName = myItemName;
}
//Get and Set Method for Item Price
public double getItemPrice()
{
return itemPrice;
}

public void setItemPrice(double myItemPrice)
{
itemPrice = myItemPrice;
}

}