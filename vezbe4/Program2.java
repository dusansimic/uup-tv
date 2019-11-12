class Program2 {
  public static void main(String[] args) {
    int rbr;
    do {
      rbr = Svetovid.in.readInt("Unesite redni broj dana u nedelji: ");
    } while (rbr < 1 || rbr > 7);
    
    switch (rbr) {
      case 1: case 2: case 3: case 4: case 5:
        System.out.println("Dan je radan.");
        break;
      default:
        System.out.println("Dan nije radan.");
    }
  }
}