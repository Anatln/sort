/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class ArrayIO {

    public static void PrintArray(int[] array) {
        System.out.println("Выводим массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println("");
        System.out.println("Конец вывода");
    }

    public static int[] InputArray(int size) {
        

        System.out.println("Вводим массив из "+size+" элементов");
        
        Scanner sn = new Scanner(System.in);
        
        int[] b = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Введите элемент массива номер "+i+" >");
            b[i]=sn.nextInt();      
        }
        
        return b;

    }
}
