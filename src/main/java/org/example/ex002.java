package org.example;

public class ex002 {

    public static void main(String[] args) {

        // i++ é igual i = i + 1
        // Por isso eu posso fazer -> i = i + 2

        for(int i = 0; i < 100; i = i + 2) {
         //   if (i % 2 == 0) {
                System.out.println(i);
          //  }
        }
    }
}
