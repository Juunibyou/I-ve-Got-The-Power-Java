package org.example;

public class Power {

  //look into this
  public int naiveApproach(int x1, int n1) {
    if (x1 == 0){return 0;}
    if (n1 == 0){return 1;}

    return x1 * naiveApproach(x1, n1-1);
  }

  public int unoptimizedApproach(int x2, int n2){
    if (x2 == 0){return 0;}
    if (n2 == 0){return 1;}

    //incomplete
  }

  public int optimizedApproach(int x3, int x3){
    
  }

}
