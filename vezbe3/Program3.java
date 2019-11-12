class Program3 {
  public static void main(String[] args) {
    int broj;
    do {
      broj = Svetovid.in.readInt("Unesite prirodan broj: ");
    } while (broj <= 0);
    
    boolean parne = true;
    while (broj > 0 && parne) {
      parne = ((broj % 10) % 2) == 0;
      broj /= 10;
    }
    
    if (parne) {
      System.out.println("Sve cifre broja su parne!");
    } else {
      System.out.println("Nisu sve cifre broja parne!");
    }
  }
}