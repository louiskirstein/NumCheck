/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numcheck;

/**
 *
 * @author LK
 */
public class ShapePrinter {

    public static void printRectangle(int height, int width) {
        System.out.println("in print rectangle");

        for (int row = 1; row <= height; row++) {
            for (int column = 1; column <= width; column++) {
                System.out.print("౪ ");
            }
            System.out.println("");
        }

    }

    public static void printSquare(int size) {
        printRectangle(size, size);

    }

}
