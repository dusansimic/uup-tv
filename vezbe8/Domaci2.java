class Domaci2 {
  public static void main(String[] args) {
    
    int n;
    do
      n = Svetovid.in.readInt("Unesite prirodan broj od 2 do 15");
    while (n < 3 || n > 12);
    
    int count = 2;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        if ((i&1) == 0)
          System.out.print(count++ + " ");
        else 
          System.out.print("1 ");
      }
      System.out.println();
    }
    
    
  }

}