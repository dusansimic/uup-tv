class Program2 {
  static int fn(int n) {
    if (n == 1) {
      return 2;
    }
    return fn(n - 1) + gn(n - 1);
  }
  
  static int gn(int n) {
    if (n == 1) {
      return 3;
    }
    return 2 * gn(n - 1) - fn(n - 1);
  }
  
  static int fn_akum(int f1, int g1, int i, int n) {
    if (n == 1) {
      return f1;
    } else {
      if (i > n) {
        return f1;
      } else {
        return fn_akum(f1 + g1, 2 * g1 - f1, i + 1, n);
      }
    }
  }
  
  static int fn_iter(int n) {
    if (n == 1) {
      return 2;
    }
    int fi = 2, gi = 3;
    for (int i = 2; i <= n; i++) {
      int fiTmp = fi + gi;
      int giTmp = 2 * gi - fi;
      fi = fiTmp;
      gi = giTmp;
    }
    return fi;
  }
  
  public static void main(String[] args) {
    int n;
    do {
      n = Svetovid.in.readInt("Unesite n [1, 30]: ");
    } while (n < 1 || n > 30);
    
    System.out.println(fn(n) + " " + fn_akum(2, 3, 2, n) + " " + fn_iter(n));
  }
}