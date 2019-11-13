class Program6 {
  public static void main(String[] args) {
    double x = Svetovid.in.readDouble("Unesite realan broj: ");
    int n;
    do {
      n = Svetovid.in.readInt("Unesite prirodan broj: ");
    } while (n <= 0);
    
    //System.out.println(Math.pow(x, n));
    
    double rez = 1.0;
    for (int i = 0; i < n; i++) {
      rez *= x;
    }
    System.out.println(rez);
  }
}