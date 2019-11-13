class Program1 {
  public static void main(String[] args) {
    int n;
    do {
      n = Svetovid.in.readInt("Unesite prirodan broj: ");
    } while (n <= 0);
    
    int min = Svetovid.in.readInt("Unesite 1. broj:" );
    for (int i = 1; i < n; i++) {
      int tmp = Svetovid.in.readInt("Unesite " + (i + 1) + ". broj: ");
      if (tmp < min) {
        min = tmp;
      }
    }
    
    System.out.println(min);
  }
}