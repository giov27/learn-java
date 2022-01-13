/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Elite Book
 */
public class HelloKos {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int[] arr1 = {10, 20, 8, 80, 90};
        int max;
        max = arr1[0];
        for (int x : arr1) {
            if (max < x) {
                max = x;
            }
        }
        System.out.print(max);
    }
}
