class Program8 {
  static int f(int n) {
    if (n < 3) {
      return n % 2 == 0 ? 1 : 3;
    } else if (n % 2 == 1) {
      return g(n-1)/f(n-2) + 2*g(n-2)/f(n-3);
    }
    return 2*f(n-1)/g(n-2) + f(n-2)/g(n-3);
  }
  
  static int g(int n) {
    return n < 3 ? 2 : g(n-1)/f(n-1) + g(n-2)/f(n-2) + g(n-3)/f(n-3);
  }
  
  static int f_akum(int f0, int f1, int f2, int g0, int g1, int g2, int i, int n) {
    if (n < 3) {
      return n % 2 == 0 ? 1 : 3;
    } else if (i > n) {
      return f2;
    }
    return f_akum(f1, f2, (n % 2 == 0) ? (2*f2/g1 + f1/g0) : (g2/f1 + 2*g1/f0), g1, g2, g2/f2 + g1/f1 + g0/f0, i + 1, n);
  }
  
  static int f_iter(int n) {
    int[] f = {1, 3, 1};
    if (n < 3) {
      return f[n];
    }
    int[] g = {2, 2, 2};
    
    for (int i = 3; i <= n; i++) {
      int fTmp = (n % 2 == 0) ? (2*f[2]/g[1] + f[1]/g[0]) : (g[2]/f[1] + 2*g[1]/f[0]);
      int gTmp = g[2]/f[2] + g[1]/f[1] + g[0]/f[0];
      
      f[0] = f[1];
      f[1] = f[2];
      f[2] = fTmp;
      g[0] = g[1];
      g[1] = g[2];
      g[2] = gTmp;
    }
    
    return f[2];
  }
  
  public static void main(String[] args) {
    int n;
    do {
      n = Svetovid.in.readInt("Unesite n [0, 25]: ");
    } while (!(0 <= n && n <= 25));
    
    System.out.println(f(n) + " " + f_akum(1, 3, 1, 2, 2, 2, 3, n) + " " + f_iter(n));
  }
}