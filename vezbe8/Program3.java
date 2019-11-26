class Program3 {
  static void nzd(int broj1, int broj2) {
    if (broj1 < broj2) {
      nzd(broj1, broj2 - broj1);
    } else if (broj1 > broj2) {
      nzd(broj1 - broj2, broj1);
    } else {
      System.out.println(broj1);
    }
  }
  
  public static void main(String[] args) {
    int broj1, broj2;
    do {
      broj1 = Svetovid.in.readInt("Unesite prvi prirodan broj: ");
    } while (broj1 <= 0);
    do {
      broj2 = Svetovid.in.readInt("Unesite drugi prirodan broj: ");
    } while (broj2 <= 0);
    
    nzd(broj1, broj2);
  }
}