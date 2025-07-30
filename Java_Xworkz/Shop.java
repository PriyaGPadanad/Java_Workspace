
class Shop{
static void sell(String vegetable,int quantity){
System.out.println("shopkeeper is selling:"+"Vegetable"+quantity);
Agent.purchase(vegetable,quantity);
}
}