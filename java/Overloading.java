//:initialization/Overloading.java
//demonstration of both constructor
//and ordinary method overloading.
//import java.util.*;
//import static net.mindview.util.Print.*;是Java四版中作者自己写的jav包


class Tree{
	int height;
	Tree(){
		System.out.println("Planting a seedling");
		height = 0;
	}
	Tree(int initialHeight){
		height=initialHeight;
		System.out.println("Creating new Tree that is " + height + " feet tall");
	}
	void info(){
		System.out.println("Tree is " + height + " feet tall");
	}
	void info(String s){
		System.out.println(s + ": Tree is " + height + " feet tall");
	}
}

	public class Overloading{
		public static void main(String[] args){
			for(int i=0;i<7;i++){
				Tree t = new Tree(i);
				t.info();
				t.info("Overloading method");
			}
			//Overloading constructor:
			new Tree();
		}
    }


