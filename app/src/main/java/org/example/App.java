package org.example;

public class App {
    public static void main(String[] args) {
      Power power = new Power();
      
      power.naiveApproach(2, 3);
      power.unoptimizedApproach(2, 3);
      power.optimizedApproach(2, 3);

    }
}
