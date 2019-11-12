class Program6 {
  public static void main(String[] args) {
    int n;
    do {
      n = Svetovid.in.readInt("Unesite prirodan broj: ");
    } while (n <= 0);
    int i = 1, j = 1;
    boolean found = false;
    for (i = 1; i <= n && !found; i++) {
      for (j = 1; j <= n && !found; j++) {
        int tmpI = i;
        int zbir = 0;
        while (tmpI > 0) {
          zbir += Math.pow(tmpI % 10, 2);
          tmpI /= 10;
        }
        int tmpJ = j;
        while (tmpJ > 0) {
          zbir += Math.pow(tmpJ % 10, 2);
          tmpJ /= 10;
        }
        
        found = (i * j) == zbir;
      }
    }
    System.out.println(i + " " + j);
  }
}