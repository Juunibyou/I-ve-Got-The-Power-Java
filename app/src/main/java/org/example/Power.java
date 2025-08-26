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

    if (n2 % 2 == 0){return unoptimizedApproach(x2, n2 / 2) * unoptimizedApproach(x2, n2 / 2);}
    else{return x2 * unoptimizedApproach(x2, n2 / 2) * unoptimizedApproach(x2, n2 / 2);}
  }

  public int optimizedApproach(int x3, int n3){
    if (x3 == 0){return 0;}
    if (n3 == 0){return 1;}

    int op = optimizedApproach(x3, n3 / 1);
    if (n3 % 2 == 0){
      return op * op;
    }
    else{
      return x3 * op * op;
    }
  }
}
