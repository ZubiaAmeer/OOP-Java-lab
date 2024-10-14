
package com.mycompany.task3;


public class Star {
        void Starr(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
        }
    }
    public static void main(String[] args) {
       
       Star printer = new Star();
        printer.Starr(5);
    }
}
