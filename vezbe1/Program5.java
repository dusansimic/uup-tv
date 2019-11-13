class Program5 {
  public static void main(String[] args) {
    double broj1 = Svetovid.in.readDouble("Unesite prvi broj: ");
    double broj2 = Svetovid.in.readDouble("Unesite drugi broj: ");
    char op;
    do {
      op = Svetovid.in.readChar("Unesite operaciju: ");
    } while (op != '+' && op != '*' && op != '/');
    
    if (op == '+') {
      System.out.println(broj1 + " + " + broj2 + " = " + (broj1 + broj2));
    } else if (op == '*') {
      System.out.println(broj1 + " * " + broj2 + " = " + (broj1 * broj2));
    } else {
      if (broj2 == 0) {
        System.out.println("Deljenje nulom nije definisano!");
      } else {
        System.out.println(broj1 + " / " + broj2 + " = " + (broj1 / broj2));
      }
    }
  }
}