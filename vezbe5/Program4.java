class Program4 {
  public static void main(String[] args) {
    int duz1;
    do {
      duz1 = Svetovid.in.readInt("Unesite duzinu prvog niza: ");
    } while (duz1 <= 0);
    int[] niz1 = new int[duz1];
    for (int i = 0; i < duz1; i++) {
      niz1[i] = Svetovid.in.readInt("Unesite " + (i + 1) + ". broj prvog niza: ");
    }
    int duz2;
    do {
      duz2 = Svetovid.in.readInt("Unesite duzinu prvog niza: ");
    } while (duz2 <= 0);
    int[] niz2 = new int[duz2];
    for (int i = 0; i < duz2; i++) {
      niz2[i] = Svetovid.in.readInt("Unesite " + (i + 1) + ". broj drugog niza: ");
    }
    
    int[] niz = new int[duz1 > duz2 ? duz1 : duz2];
    int p = 0;
    for (int i = 0; i < duz1; i++) {
      boolean nadjen = false;
      for (int j = 0; j < duz2 && !nadjen; j++) {
        if (niz1[i] == niz2[j]) {
          boolean postoji = false;
          for (int k = 0; k < p && !postoji; k++) {
            if (niz[k] == niz1[i]) {
              postoji = true;
              nadjen = true;
            }
          }
          if (!postoji) {
            niz[p++] = niz1[i];
          }
        }
      }
    }
    
    for (int i = 0; i < p; i++) {
      System.out.println(" " + niz[i]);
    }
    System.out.println();
  }
}