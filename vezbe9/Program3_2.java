class Program3_2 {
  static int f_n(int f3, int f2, int f1, int n) {
    if (n == 0) {
      return f1;
    }
    return f_n(2 * f3 - f2 + f1, f3, f2, --n);
  }
  
  public static void main(String[] args) {
    int n;
    do {
      n = Svetovid.in.readInt("Unesite n: ");
    } while (n <= 0 || n > 30);
    
    System.out.println(f_n(2, 1, 0, n));
  }
}