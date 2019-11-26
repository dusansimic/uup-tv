class Program4 {
  static String proveri(String palindrom) {
    if (palindrom.length() <= 1) {
      return "Jeste palindrom!";
    } else if (palindrom.charAt(0) == palindrom.charAt(palindrom.length() - 1)) {
      return proveri(palindrom.substring(1, palindrom.length() - 1));
    } else {
      return "Nije palindrom!";
    }
  }
  
  public static void main(String[] args) {
    String palindrom = Svetovid.in.readLine("Unesite nesto: ");
    
    System.out.println(proveri(palindrom));
  }
}