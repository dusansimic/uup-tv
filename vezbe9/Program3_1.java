class Program3_1 {
  static int f_n(int n) {
    if (n < 3) {
      return n;
    }
    
    return 2*f_n(n-1) - f_n(n-2) + f_n(n-3);
  }
  public static void main(String[] args) {
    int n;
    do {
      n = Svetovid.in.readInt("Unesite n: ");
    } while (n <= 0 || n > 30);
    
    System.out.println(f_n(n));
  }
}