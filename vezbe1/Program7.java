class Program7 {
  public static void main(String[] args) {
    int n;
    do {
      n = Svetovid.in.readInt("Unesite prirodan broj: ");
    } while (n <= 0);
    
    double sum = 0.0;
    for (int i = 1; i <= n; i++) {
      sum += 1.0/i;
    }
    
    System.out.println(sum);
  }
}