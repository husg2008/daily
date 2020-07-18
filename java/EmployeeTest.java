import java.io.*;
public class EmployeeTest{
	public static void main(String[] args){
		/*使用构造器创建两个对象*/
		Employee empOne = new Employee("胡大");
		Employee empTwo = new Employee("胡二");
		//调用这两个对象的成员方法
		empOne.empAge(7);
		empOne.empDesignation("小学生");
		empOne.empSalary(50);
		empOne.printEmployee();

		empTwo.empAge(3);
		empTwo.empDesignation("幼儿");
		empTwo.empSalary(30);
		empTwo.printEmployee();
	}
}

