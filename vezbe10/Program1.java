class Program1 {
  static int fn(int n) {
    if (n == 0) {
      return 1;
    } else if (n == 1) {
      return 3;
    } else if (n == 2) {
      return 2;
    } else if (n % 2 == 1) {
      return fn(n - 1) - 2 * fn(n - 2);
    } else {
      return fn(n - 2) + 3 * fn(n - 3);
    }
  }
  
  static int fn_akum(int f0, int f1, int f2, int i, int n) {
    if (n > 2) {
      if (i > n) {
        return f2;
      } else if (i % 2 == 1) {
        return fn_akum(f1, f2, f2 - 2 * f1, i + 1, n);
      } else {
        return fn_akum(f1, f2, f1 + 3 * f0, i + 1, n);
      }
    } else {
      if (n == 0) {
        return 1;
      } else if (n == 1) {
        return 3;
      } else {
        return 2;
      }
    }
  }
  
  static int fn_iter(int n) {
    int[] f = { 1, 3, 2 };
    if (n > 2) {
      for (int i = 3; i <= n; i++) {
        int fi;
        if (i % 2 == 1) {
          fi = f[2] - 2 * f[1];
        } else {
          fi = f[1] + 3 * f[0];
        }
        f[0] = f[1];
        f[1] = f[2];
        f[2] = fi;
      }
      return f[2];
    } else {
      return f[n];
    }
  }
  
  public static void main(String[] args) {
    int n;
    do {
      n = Svetovid.in.readInt("Unesite n [0, 40]: ");
    } while (n < 0 || n > 40);
    
    System.out.println(fn(n) + " " + fn_akum(1, 3, 2, 3, n) + " " + fn_iter(n));
  }
}