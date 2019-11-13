class Program1 {
  public static void main(String[] args) {
    int duz;
    do {
      duz = Svetovid.in.readInt("Unesite prirodan broj: ");
    } while (duz <= 0);

    int[] niz = new int[duz];
    for (int i = 0; i < duz; i++) {
      niz[i] = Svetovid.in.readInt("Unesite broj: ");
    }

    int broj = Svetovid.in.readInt("Unesite trazeni broj: ");

    int i = 0;
    boolean nadjen = false;
    for (i = 0; i < duz && !nadjen; i++) {
      nadjen = niz[i] == broj;
    }
    i--;
    
    if (nadjen) {
      System.out.println("Uneti broj je nadjen na indeksu " + i);
    } else {
      System.out.println("Uneti broj nije nadjen");
    }
  }
}