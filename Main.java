class Main {
  public static void main(String[] args) {
    System.out.println("Iniciando o trabalho");

    Cozinha cozMin = new Cozinha();
    cozMin.tipo = "Mineira";
    // cozMin.numeroPratos = 10;
    cozMin.tempoPreparo = 30;
    cozMin.numeroCozinheiros = 5;
    cozMin.getNumeroPratos();
    cozMin.setNumeroPratos(10);
    
    Cozinha cozIt = new Cozinha();
    cozIt.tipo = "Italiana";
    cozIt.numeroPratos = 10;
    cozIt.numeroCozinheiros = 8;
    cozIt.tempoPreparo = 50;


  }
}