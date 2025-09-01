package org.example;

public class App {
    public static void main(String[] args) {
      Power power = new Power();
      
      int[] bases = {2, 5, 7, 12, 30};         
      int[] exponents = {5, 10, 15, 20, 25};     

      for (int x : bases) {
        System.out.println("");
        for (int n : exponents) {
        System.out.println("Base = " + x + ", Exponent = " + n);

        // Naive
        long startNaive = System.nanoTime();
        int resultNaive = power.naiveApproach(x, n);
        long endNaive = System.nanoTime();
        System.out.println("Naive result: " + resultNaive + " | Time: " + (endNaive - startNaive));

        // Unoptimized
        long startUnopt = System.nanoTime();
        int resultUnopt = power.unoptimizedApproach(x, n);
        long endUnopt = System.nanoTime();
        System.out.println("Unoptimized result: " + resultUnopt + " | Time: " + (endUnopt - startUnopt));

        // Optimized
        long startOpt = System.nanoTime();
        int resultOpt = power.optimizedApproach(x, n);
        long endOpt = System.nanoTime();
        System.out.println("Optimized result: " + resultOpt + " | Time: " + (endOpt - startOpt));

        System.out.println("-----------------------------");
        }
      }
    }
}
