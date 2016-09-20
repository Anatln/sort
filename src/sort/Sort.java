/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

/**
 *
 * @author student
 */
public class Sort {
    static int[] SortArray (int[] array)
    {
     // body
        for (int i=0; i<5; i++)
        { 
            for (int j=0; j<5; j++)
            {
                if (array[i]<array[j]) 
                {
                    int a = array[i];
                    array[i]= array[j];
                    array[j] = a;
                }
            }
        }
        return array;
    }
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] x = {2,5,7,9,6};
        
      //  int[] x = ArrayIO.InputArray(5);
        
        SortArray(x);
        ArrayIO.PrintArray(x);
//       ubiv i vozr massiv
//boolean ubiv = true;
//
//        for (int i=0; i<x.length-1; i++)
//        {
//            if (x[i]<x[i+1])
//            {
//                ubiv=false;
//            }
//        }
//
//        boolean vozr=true;
//        for (int j=0; j<x.length-1; j++)
//        {
//            if (x[j]>x[j+1])
//            {
//            vozr=false;
//            }
//        }
//        ///---------------------------------------
//        if (vozr)
//        {System.out.println("Massiv vozr");
//        }
////        else System.out.println("Massiv ne vozr");        
//           
//        if (ubiv) {
//            System.out.println("Massiv ybiv.");
//        }
////        else System.out.println("Massiv  NE ybiv.");
//             
//        if (!vozr&&!ubiv) {
//            System.out.println("Massiv ne сортированный");  
//            
//        }
//         ///--------------------------------------- 
//         
//        
//        for (int i = 0; i < x.length; i++) {
//            System.out.println(x[i]%2==1);
//            if (x[i]%2==1)
//            {x[i]=-x[i]; }
//            
//        }
   
// ДЗ
//1111 В данном массиве найдите два наименьших элемента.
for (int j = 0; j < 5; j++) 
{
            int xmin1, xmin2;
            xmin1 = x[0];
            xmin2 = x[0];
                  if (x[j] < xmin1)
         {
                xmin1 = x[j];}
                     if (x[j] < xmin2&& x[j]!=xmin1)
            {
                xmin2 = x[j];}
            
            
                      
         System.out.print(xmin1);
              System.out.print(xmin2); 
             
}

        
    
//2222Определите, есть ли в массиве повторяющиеся элементы.
//       boolean rep=false;
//       for (int i=0; i<=5; i++)
//        { 
//            for (int j=i+1; j<5; j++)
//                 if (x[i]==x[j])
//            {    rep=true;
//            }}
//                   if (rep) 
//                   {System.out.println("Povtory est`!");}
//                   else {
//         System.out.println("Povtorov net!");
//        }
//3333 Поменять местами наибольший и наименьший элементы массива.
            
//            for (int j = 0; j < 5; j++) {
//            int xmax;
//            xmax = x[0];
//            if (x[j] > xmax) {
//                xmax = x[j];
//            }
//             x[j]=xmax;
//            System.out.print((x[j]) + " ");
//            int xmin;
//            xmin = x[0];
//            if (x[j] < xmin) {
//                xmin = x[j];
//            }
//            int a = xmax;
//            xmax=xmin;
//            xmin=a;
//            x[j]=xmax;
//
//            x[j]=xmin;
//            System.out.print((x[j]) + " ");}
            
   

   
//         ArrayIO.PrintArray(x);
    
}}
