class Program3 {
  static int fn(int n) {
    if (n <= 1) {
      return n - 1;
    }
    if (n % 10 < 5) {
      return fn(n - 2) - gn(n - 1);
    }
    return fn(n - 1) + gn(n - 2);
  }
  
  static int gn(int n) {
    if (n <= 1) {
      return n;
    }
    if (n % 2 == 1) {
      return gn(n - 1) - 2 * fn(n - 2);
    }
    return gn(n - 2) + 2 * fn(n - 1);
  }
  
  static int fn_akum(int f0, int f1, int g0, int g1, int i, int n) {
    if (n <= 1) {
      return n - 1;
    }
    if (i > n) {
      return f1;
    }
    int fTmp = i % 10 < 5 ? f0 - g1 : f1 + g0;
    int gTmp = i % 2 == 1 ? g1 - 2 * f0 : g0 + 2 * f1;
    return fn_akum(f1, fTmp, g1, gTmp, i + 1, n);
  }
  
  static int fn_iter(int n) {
    if (n <= 1) {
      return n - 1;
    }
    int f0 = -1, f1 = 0, g0 = 0, g1 = 1;
    for (int i = 2; i <= n; i++) {
      int fi = i % 10 < 5 ? f0 - g1 : f1 + g0;
      int gi = i % 2 == 1 ? g1 - 2 * f0 : g0 + 2 * f1;
      f0 = f1;
      f1 = fi;
      g0 = g1;
      g1 = fi;
    }
    return f1;
  }
  
  public static void main(String[] args) {
    int n;
    do {
      n = Svetovid.in.readInt("Unesite n [0, 40]: ");
    } while (n < 0 || n > 40);
    
    System.out.println(fn(n) + " " + fn_akum(-1, 0, 0, 1, 2, n) + " " + fn_iter(n));
  }
}