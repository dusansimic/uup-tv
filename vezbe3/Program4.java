class Program4 {
  public static void main(String[] args) {
    int broj1, broj2;
    do {
      broj1 = Svetovid.in.readInt("Unesite broj 1: ");
    } while (broj1 <= 0);
    do {
      broj2 = Svetovid.in.readInt("Unesite broj 2: ");
    } while (broj2 <= 0);
    
    System.out.print("Najmanji zajednicki delitelj za " + broj1 + " i " + broj2 + " je ");
    
    while (broj1 != broj2) {
      if (broj1 > broj2) {
        broj1 -= broj2;
      } else if (broj2 > broj1) {
        broj2 -= broj1;
      }
    }
    
    System.out.println(broj1 + ".");
  }
}