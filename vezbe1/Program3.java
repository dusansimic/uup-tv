class Program3 {
  public static void main(String[] args) {
    int br = Svetovid.in.readInt("Unesite ceo broj: ");
    //System.out.println("Apsolutna vrednost od " + br + " je " + Math.abs(br));
    int abs = br < 0 ? -br : br;
    System.out.println("Apsolutna vrednost od " + br + " je " + abs);
  }
}