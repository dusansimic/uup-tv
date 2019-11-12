class Program6 {
  public static void main(String[] args) {
    int n;
    do {
      n = Svetovid.in.readInt("Unesite prirodan broj: ");
    } while (n <= 0);
    
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}