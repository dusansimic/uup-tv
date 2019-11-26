class Program5 {
  static String nadji(int[] niz, int trazeni, int levo, int desno) {
    if (levo > desno) {
      return "Nije nadjen!";
    }
    int indeks = (levo + desno) / 2;
    if (niz[indeks] < trazeni) {
      return nadji(niz, trazeni, indeks + 1, desno);
    } else if (niz[indeks] > trazeni) {
      return nadji(niz, trazeni, levo, indeks - 1);
    } else {
      return "Nadjen na indeksu " + indeks;
    }
  }
  
  public static void main(String[] args) {
    int duz;
    do {
      duz = Svetovid.in.readInt("Unesite prvi prirodan broj: ");
    } while (duz <= 0);
    
    int[] niz = new int[duz];
    for (int i = 0; i < duz; i++) {
      niz[i] = Svetovid.in.readInt("Unesite " + i + ". broj: ");
    }
    
    int trazeni = Svetovid.in.readInt("Unesite prvi prirodan broj: ");
    
    System.out.println(nadji(niz, trazeni, 0, duz - 1));
  }
}