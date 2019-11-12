class Program2 {
  public static void main(String[] args) {
    int duz;
    do {
      duz = Svetovid.in.readInt("Unesite duzinu niza: ");
    } while (duz <= 0);
    
    int[] niz = new int[duz];
    for (int i = 0; i < duz; i++) {
      do {
        niz[i] = Svetovid.in.readInt("Unesite " + (i + 1) + ". element niza: ");
      } while (i != 0 && niz[i] < niz[i - 1]);
    }
    
    int traz = Svetovid.in.readInt("Unesite trazeni broj: ");
    boolean nadjen = false;
    int low = 0, high = duz - 1;
    int i = 0;
    while (!nadjen && low >= high) {
      i = (low + high) / 2;
      if (niz[i] < traz) {
        low = i + 1;
      } else if (niz[i] > traz) {
        high = i - 1;
      } else {
        nadjen = true;
        continue;
      }
    }
    
    if (nadjen) {
      System.out.println("Trazeni broj " + traz + " je na indeksu " + i);
    } else {
      System.out.println("Trazeni broj nije nadjen");
    }
  }
}