/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author fenix
 */
public class w2q2_MyNumber {

    public static void main(String[] args) {

        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();

        double numRound = Math.round(num);
        System.out.println("Rounded value "+numRound);

        double numCeil = Math.ceil(num);
        System.out.println("Ciel value "+numCeil);

        double numFloor = Math.floor(num);
        System.out.println("Floor value "+numFloor);
        sc.close();
    }
}
