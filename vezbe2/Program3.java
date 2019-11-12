class Program3 {
  public static void main(String[] args) {
    int broj1 = (int) (Math.random() * 100) + 1;
    int broj2;
    int n = 0;
    do {
      broj2 = Svetovid.in.readInt("Pogadjajte broj: ");
      n++;
      if (broj2 > broj1) {
        System.out.println("Uneti broj je veci od trazenog!");
      } else if (broj2 < broj1) {
        System.out.println("Uneti broj je manje od trazenog!");
      }
    } while (broj2 != broj1);
    System.out.println("Cestitamo, uneli ste trazeni broj u " + n + " pokusaja!");
  }
}