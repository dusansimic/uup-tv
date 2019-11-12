class Program1 {
  public static void main(String[] args) {
    int duz;
    do {
      duz = Svetovid.in.readInt("Unesite duzinu prvog niza: ");
    } while (duz <= 0);
    
    int[] niz = new int[duz];
    for (int i = 0; i < duz; i++) {
      niz[i] = Svetovid.in.readInt("Unesite " + (i + 1) + ". element niza: ");
    }
    
    int duz2 = 0;
    int[] niz2 = new int[duz];
    for (int i = 0; i < duz; i++) {
      boolean dupl = false;
      for (int j = 0; j < i && !dupl; j++) {
        dupl = niz[i] == niz[j];
      }
      if (!dupl) {
        niz2[duz2++] = niz[i];
      }
    }
    
    for (int i = 0; i < duz2; i++) {
      System.out.print(" " + niz2[i]);
    }
    System.out.println();
  }
}