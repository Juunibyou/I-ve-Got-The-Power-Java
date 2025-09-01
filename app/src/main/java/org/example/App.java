package org.example;

public class App {
    public static void main(String[] args) {
      Power power = new Power();
      
      int[] bases = {2, 3, 4, 5, 6};
      int[] exponents = {3, 4, 5, 6, 7};

      int trials = 10;

      for (int x : bases) {
        System.out.println("|_______SET______|");

        for (int n : exponents) {
          System.out.println("Base = " + x + ", Exponent = " + n);

          // Naive
          long totalNaive = 0;
          int resultNaive = 0;

          for(int i = 0; i < trials; i++){
            long start = System.nanoTime();
            resultNaive = power.naiveApproach(x, n);
            long end = System.nanoTime();
            totalNaive += (end - start);
          }
          System.out.println("1. Naive result: " + resultNaive + " Time: " + (totalNaive / trials) + "(ns)");

          // Unoptimized
          long totalUnopt = 0;
          int resultUnopt = 0;

          for(int i = 0; i < trials; i++){
            long startUnopt = System.nanoTime();
            resultUnopt = power.unoptimizedApproach(x, n);
            long endUnopt = System.nanoTime();
            totalUnopt += (endUnopt - startUnopt);
          }
          System.out.println("2. Unoptimized result: " + resultUnopt + " Time: " + (totalUnopt / trials) + "(ns)");

          // Optimized
          long totalOpt = 0;
          int resultOpt = 0;

          for(int i = 0; i < trials; i++){
            long startOpt = System.nanoTime();
            resultOpt = power.optimizedApproach(x, n);
            long endOpt = System.nanoTime();
            totalOpt += (endOpt - startOpt);
          }
          System.out.println("3. Optimized result: " + resultOpt + " Time: " + (totalOpt / trials) + "(ns)");

          System.out.println("-----------------------------");
        }
      }
    }
}
