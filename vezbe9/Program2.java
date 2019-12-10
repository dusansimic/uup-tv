class Program2 {
  public static void main(String[] args) {
    int n;
    do {
      n = Svetovid.in.readInt("Unesite n: ");
    } while (n <= 0);
    
    int[] niz = new int[n];
    for (int i = 0; i < n; i++) {
      niz[i] = Svetovid.in.readInt("Unesite " + (i + 1) + ". element: ");
    }
    
    if (n == 1) {
      System.out.println(1);
    } else {
      int maxDuz = 0;
      for (int i = 1; i < n; i++) {
        int duz;
        for (duz = 1; duz < n - i && niz[i + duz] > niz[i + duz - 1]; duz++);
        if (duz > maxDuz) {
          maxDuz = duz;
        }
      }
      System.out.println(maxDuz);
    }
  }
}