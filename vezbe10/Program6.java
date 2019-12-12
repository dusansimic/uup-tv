class Program6 {
  static int f(int n) {
    if (n < 3) {
      return 3 - n;
    } else if (n % 3 == 0) {
      return f(n-1) + f(n-3);
    } else if (n % 3 == 1) {
      return 2*f(n-2) - 3*f(n-3);
    }
    return -f(n-1) + f(n-2) - 2*f(n-3);
  }
  
  static int f_akum(int f0, int f1, int f2, int i, int n) {
    if (n < 3) {
      return 3 - n;
    } else if (i > n) {
      return f2;
    } else if (i % 3 == 0) {
      return f_akum(f1, f2, f2 + f0, i + 1, n);
    } else if (i % 3 == 1) {
      return f_akum(f1, f2, 2*f1 - 3*f0, i + 1, n);
    }
    return f_akum(f1, f2, -f2 + f1 - 2*f0, i + 1, n);
  }
  
  static int f_iter(int n) {
    int[] f = {3, 2, 1};
    if (n < 3) {
      return f[n];
    }
    
    for (int i = 3; i <= n; i++) {
      int fTmp;
      
      if (i % 3 == 0) {
        fTmp = f[2] + f[0];
      } else if (i % 3 == 1) {
        fTmp = 2*f[1] - 3*f[0];
      } else {
        fTmp = -f[2] + f[1] - 2*f[0];
      }
      
      f[0] = f[1];
      f[1] = f[2];
      f[2] = fTmp;
    }
    return f[2];
  }
  
  public static void main(String[] args) {
    int n;
    do {
      n = Svetovid.in.readInt("Unesite n [0, 35]: ");
    } while (!(0 <= n && n <= 35));
    
    System.out.println(f(n) + " " + f_akum(3, 2, 1, 3, n) + " " + f_iter(n));
  }
}