class Customer{
static void buy(String vegetable,int quantity){
System.out.println("Customer is buying:"+"Vegetable"+quantity);
Shop.sell(vegetable,quantity);
}
}