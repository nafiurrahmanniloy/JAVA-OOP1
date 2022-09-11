class ConOver{
      int  value1;
      int  value2;
      ConOver(){
       value1 = 10;
       value2 = 20;
       System.out.println("Inside 1st Constructor");
     }
     ConOver(int a){
      value1 = a;
      System.out.println("Inside 2nd Constructor");
    }
    ConOver(int a,int b){
    value1 = a;
    value2 = b;
    System.out.println("Inside 3rd Constructor");
   }
   public void display(){
      System.out.println("Value1 === "+value1);
      System.out.println("Value2 === "+value2);
  }
  public static void main(String args[]){
    ConOver d1 = new ConOver();
    ConOver d2 = new ConOver(30);
    ConOver d3 = new ConOver(30,40);
    d1.display();
    d2.display();
    d3.display();
 }
}