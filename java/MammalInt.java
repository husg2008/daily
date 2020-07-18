/* 文件名 : MammalInt.java 
1、当类实现接口的时候，类要实现接口中所有的方法。否则，类必须声明为抽象的类。
2、类使用implements关键字实现接口。在类声明中，Implements关键字放在class声明后面。
3、实现一个接口的语法，可以使用这个公式：...implements 接口名称[, 其他接口名称, 其他接口名称..., ...] ...



*/
public class MammalInt implements Animal{
 
   public void eat(){
      System.out.println("Mammal eats");
   }
 
   public void travel(){
      System.out.println("Mammal travels");
   } 
 
   public int noOfLegs(){
      return 0;
   }
 
   public static void main(String args[]){
      MammalInt m = new MammalInt();
      m.eat();
      m.travel();
   }
}