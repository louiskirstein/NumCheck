/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numcheck;

import javax.swing.JOptionPane;

/**
 *
 * @author LK
 */
public class NumCheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //    testCheck();
        //    testTable();
        //    testDivisionTable();
        //    testRectangle();
        testSquare();
    }

    private static void testCheck() {
        System.out.println(NumberChecker.checkNumber(3));
        System.out.println(NumberChecker.checkNumber(4));
        System.out.println(NumberChecker.checkNumber(5));
        System.out.println(NumberChecker.checkNumber(6));
        System.out.println(NumberChecker.checkNumber(12));

        for (int i = 0; i < 10000; i++) {
            System.out.println(i + ") " + NumberChecker.checkNumber(i));
        }

    }

    private static void testTable() {
        NumberChecker.multiplyTable(22, 25, 3);
    }

    private static void testDivisionTable() {
        NumberChecker.divisionTable(22, 25, 5.0);
    }

    private static void testRectangle() {
        ShapePrinter.printRectangle(4, 6);
        ShapePrinter.printRectangle(3, 8);
    }

    private static void testSquare() {
        int mySize = Integer.valueOf( JOptionPane.showInputDialog("Hey dude, how big should the square be?"));
        ShapePrinter.printSquare(mySize);
    }

}
