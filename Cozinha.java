import java.util.ArrayList;

public class Cozinha {
  private int numeroPratos;
  private String tipo;
  private int numeroCozinheiros;
  private int tempoPreparo;
  private int horaAbertura;
  private int horaFechamento;
  private String pratoPrincipal;
  private ArrayList<Ingrediente> ingredientes;
  private ArrayList<Funcionario> funcionarios;
  
  public Cozinha(int numeroPratos, String tipo, int numeroCozinheiros, int tempoPreparo, int horaAbertura, int horaFechamento, String pratoPrincipal) {
    this.numeroPratos = numeroPratos;
    this.tipo = tipo;
    this.numeroCozinheiros = numeroCozinheiros;
    this.tempoPreparo = tempoPreparo;
    this.horaAbertura = horaAbertura;
    this.horaFechamento = horaFechamento;
    this.pratoPrincipal = pratoPrincipal;
    ingredientes = new ArrayList<Ingrediente>();
    funcionarios = new ArrayList<Funcionario>();
  }

  public int getNumeroPratos() {
    return numeroPratos;    
  }
  
  public void setNumeroPratos(int numeroPratos) {
    this.numeroPratos = numeroPratos;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public int getnumeroCozinheiros() {
    return numeroCozinheiros;
  }

  public void setNumeroCozinheiros(int numeroCozinheiros) {
    this.numeroCozinheiros = numeroCozinheiros; 
  }
  
  public int getTempoPreparo() {
    return tempoPreparo;
  }

  public void setTempoPreparo(int tempoPreparo) {
    this.tempoPreparo = tempoPreparo;
  }

  public int getHoraAbertura() {
    return horaAbertura;
  }

  public void setHoraAbertura(int horaAbertura) {
    this.horaAbertura = horaAbertura;
  }  

  public int getHoraFechamento() {
    return horaFechamento;
  }

  public void setHoraFechamento(int horaFechamento) {
    this.horaFechamento = horaFechamento;
  }

  public String getPratoPrincipal() {
    return pratoPrincipal;
  }

  public void setPratoPrincipal(String pratoPrincipal) {
    this.pratoPrincipal = pratoPrincipal;
  }

  public void inserirIngrediente(Ingrediente ingrediente) {
    ingredientes.add(ingrediente);
  }

  public void inserirFuncionario(Funcionario funcionario) {
    funcionarios.add(funcionario);
  }

  void prepararPratos() {
    System.out.println("O cozinheiro está preparando o prato");
  } 

  void lavarLouca() {
    System.out.println("O funcionário está lavando a louça");
  }
}