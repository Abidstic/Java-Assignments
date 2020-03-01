/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

/**
 *
 * @author ABIDSTIC
 */
public class Requirement {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Fibonacci fib = new Fibonacci();
        for (int i = 1; i <= n; ++i) {
            System.out.print(fib.fibonacci(i)+" ");
        }
    }

}