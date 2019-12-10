class Program3_3 {
  public static void main(String[] args) {
    int n;
    do {
      n = Svetovid.in.readInt("Unesite n: ");
    } while (n <= 0 || n > 30);
    
    switch (n) {
      case 0:
      case 1:
      case 2:
        System.out.println(n);
        break;
      default:
        int fn = 0;
        int f0 = 0;
        int f1 = 1;
        int f2 = 2;
        for (int i = 2; i < n; i++) {
          fn = 2*f2 - f1 + f0;
          f0 = f1;
          f1 = f2;
          f2 = fn;
        }
        System.out.println(fn);
    }
  }
}