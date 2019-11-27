class Domaci1 {

  public static void main(String[] args) {
  
    int n;
    do
      n = Svetovid.in.readInt("Unesite prirodan broj od 2 do 15");
    while (n < 2 || n > 15);
    
    int count = 1;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) 
        System.out.print(count++ + " ");
      System.out.println();
    }   
  
  }

}