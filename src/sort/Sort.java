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
        
        int[] x = {2,5,7,3,6};
        
      //  int[] x = ArrayIO.InputArray(5);
        
        SortArray(x);
        ArrayIO.PrintArray(x);
        boolean ubiv = true;

        for (int i=0; i<x.length-1; i++)
        {
            if (x[i]<x[i+1])
            {
                ubiv=false;
            }
        }

        boolean vozr=true;
        for (int j=0; j<x.length-1; j++)
        {
            if (x[j]>x[j+1])
            {
            vozr=false;
            }
        }
        ///---------------------------------------
        if (vozr)
        {System.out.println("Massiv vozr");
        }
//        else System.out.println("Massiv ne vozr");        
           
        if (ubiv) {
            System.out.println("Massiv ybiv.");
        }
//        else System.out.println("Massiv  NE ybiv.");
             
        if (!vozr&&!ubiv) {
            System.out.println("Massiv ne сортированный");  
            
        }
         ///--------------------------------------- 
         
        
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]%2==1);
            if (x[i]%2==1)
            {x[i]=-x[i]; }
            
        }
   
// ДЗ
//В данном массиве найдите два наименьших элемента.

//Определите, есть ли в массиве повторяющиеся элементы.

//Поменять местами наибольший и наименьший элементы массива.

   

   
         ArrayIO.PrintArray(x);
    }
}
