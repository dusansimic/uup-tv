class Program7 {
  static int f(int n) {
    if (n < 2) {
      return 2 - n;
    }
    return 2 + f(n-1)/g(n-2);
  }
  
  static int g(int n) {
    if (n < 2) {
      return n + 1;
    }
    return 1 + g(n-1)/f(n-2);
  }
  
  static int f_akum(int f0, int f1, int g0, int g1, int i, int n) {
    if (n < 2) {
      return 2 - n;
    } else if (i > n) {
      return f1;
    }
    return f_akum(f1, 2 + f1/g0, g1, 1 + g1/f0, i + 1, n);
  }
  
  static int f_iter(int n) {
    int[] f = {2, 1};
    if (n < 2) {
      return f[n];
    }
    int[] g = {1, 2};
    
    for (int i = 2; i <= n; i++) {
      int fTmp = 2 + f[1]/g[0];
      int gTmp = 1 + g[1]/f[0];
      
      f[0] = f[1];
      f[1] = fTmp;
      g[0] = g[1];
      g[1] = gTmp;
    }
    
    return f[1];
  }
  
  public static void main(String[] args) {
    int n;
    do {
      n = Svetovid.in.readInt("Unesite n [0, 40]: ");
    } while (!(0 <= n && n <= 40));
    
    System.out.println(f(n) + " " + f_akum(2, 1, 1, 2, 2, n) + " " + f_iter(n));
  }
}