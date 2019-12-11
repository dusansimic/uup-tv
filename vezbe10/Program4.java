class Program4 {
  static int fn(int n, int r) {
    if (n < r) {
      return 1;
    }
    return fn(n - 1, r) - gn(n - 2, r) + fn(n - r, r) - gn(n - r, r);
  }
  
  static int gn(int n, int r) {
    if (n < r) {
      return 2;
    }
    return gn(n - 1, r) + fn(n - 2, r) - fn(n - r, r) - gn(n - r, r);
  }
  
  // Efikasnije od onog koji je radjen na vezbama.
  static int fn_akum(int fr, int f0, int f1, int gr, int g0, int g1, int i, int n, int r) {
    if (n < r) {
      return 1;
    }
    if (i > n) {
      return f1;
    }
    int fnTmp = f1 - g0 + fr - gr;
    int gnTmp = g1 + f0 - fr - gr;
    return fn_akum(f0, f1, fnTmp, g0, g1, gnTmp, i + 1, n, r);
  }
  
  static int fn_iter(int n, int r) {
    if (n < r) {
      return 1;
    }
    
    int fr = 1, f0 = 1, f1 = 1, gr = 2, g0 = 2, g1 = 2;
    for (int i = r; i <= n; i++) {
      int fi = f1 - g0 + fr - gr;
      int gi = g1 + f0 - fr - gr;
      fr = f0;
      f0 = f1;
      f1 = fi;
      gr = g0;
      g0 = g1;
      g1 = gi;
    }
    return f1;
  }
  
  public static void main(String[] args) {
    int n;
    do {
      n = Svetovid.in.readInt("Unesite n [0, 50]: ");
    } while (n < 0 || n > 50);
    int r;
    do {
      r = Svetovid.in.readInt("Unesite r [2, 20]: ");
    } while (r < 2 || r > 20);
    
    System.out.println(fn(n, r) + " " + fn_akum(1, 1, 1, 2, 2, 2, r, n ,r) + " " + fn_iter(n, r));
  }
}