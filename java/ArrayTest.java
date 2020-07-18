//必须引入java的数组类才可以使用Arrays.toString、
//Arrays.deepToString这俩函数打印数组
import java.util.Arrays;
public class ArrayTest {
   public static void main(String[] args) {
      // 数组大小
      int size = 10;
      // 定义数组
      double[] myList = new double[size];
      myList[0] = 5.6;
      myList[1] = 4.5;
      myList[2] = 3.3;
      myList[3] = 13.2;
      myList[4] = 4.0;
      myList[5] = 34.33;
      myList[6] = 34.0;
      myList[7] = 45.45;
      myList[8] = 99.993;
      myList[9] = 1000;
      // 计算所有元素的总和
      double total = 0;
      for (int i = 0; i < size; i++) {
         total += myList[i];
      }
      System.out.println("总和为： " + total);
      //定义新数组
      double[] listA = {1.9, 2.9, 3.4, 3.5};
      //打印所有数组元素
      for(int i = 0;i<listA.length;i++){
         System.out.println(listA[i]+"");
      }
      //计算所有元素的总和
      double Atotal = 0;
      for (int i=0;i<listA.length;i++){
         Atotal += listA[i];
      }
      System.out.println("listA的总和："+Atotal);
      //查找最大元素
      double max = listA[0];
      for(int i=0;i<listA.length;i++){
         if(listA[i]>max) max = listA[i];
      }
      System.out.println("最大值："+max);
      //查找最小元素
      double min = listA[0];
      for(int i=0;i<listA.length;i++){
         if(listA[i]<min) min = listA[i];
      }
      System.out.println("最小值："+min);
      //For-Each循环获取元素打印信息
      double[] listB = {2.1, 3.3, 4.6, 5.9};
      for(double element: listB){
         System.out.println(element);         
      }
      //打印多维数组
      int[][] a = {{1,2,3},{4,5,6}};
      System.out.println(Arrays.deepToString(a)); 
      //循环方法打印多维数组，完全搞不懂？
      int[][][] a1 = new int[4][3][2];
      for(int i=0;i<a1.length;i++){
         for(int i1=0;i1<a1[i].length;i1++){
            for(int i2=0;i2<a1[i][i1].length;i2++){
               System.out.println(a1[i][i1][i2]);
            }
            System.out.println("二维换行");
         }
         System.out.println("二维换行");
      }       

   }

   /*//数组作为函数参数
      public static void printArray(int[] array){
         for(int i=0;i<array.length;i++){
            System.out.println(array[i]+"");            
         } 
      //调用printArray方法打印出结果
      printArray(new int[]{3,1,2,6,4,2});

      }*/

}