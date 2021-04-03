import java.util.*;
import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {
    System.out.println("Iniciando o trabalho");

    Ingrediente feijao = new Ingrediente("Feijão", LocalDate.of(2021, 12, 22));
    Ingrediente farinha = new Ingrediente("Farinha", LocalDate.of(2021,04,30));
    Ingrediente arroz = new Ingrediente("Arroz", LocalDate.of(2022,01,27));
    Ingrediente carnePorco = new Ingrediente("Carne de porco", LocalDate.of(2021,04,29));
    Ingrediente linguica = new Ingrediente("Linguiça", LocalDate.of(2021,06,20));

    Funcionario funcMin1 = new Funcionario("Carlos", "Cozinheiro");
    Funcionario funcMin2 = new Funcionario("Sophia", "Cozinheira");
    Funcionario funcMin3 = new Funcionario("Beatriz", "Garçonete");
    Funcionario funcMin4 = new Funcionario("Lucas", "Serviços Gerais");

    List<Funcionario> funcsMin = Arrays.asList(funcMin1, funcMin2, funcMin3, funcMin4);

    List<Ingrediente> ingMin = Arrays.asList(feijao, farinha, arroz, carnePorco, linguica);

    Cozinha cozMin = new Cozinha(2, "Mineira", 2, 30, 14, 20, "Feijoada", ingMin, funcsMin);  

    
    Ingrediente champignon = new Ingrediente("Champignon", LocalDate.of(2021,04,30));
    Ingrediente brocolis = new Ingrediente("Brócolis", LocalDate.of(2021,04,25));
    Ingrediente macarrao = new Ingrediente("Macarrão", LocalDate.of(2021,10,20));
    Ingrediente carne = new Ingrediente("Carne", LocalDate.of(2021, 04, 20));

    Funcionario funcChi1 = new Funcionario("Ho", "Cozinheiro");
    Funcionario funcChi2 = new Funcionario("Chi", "Serviços Gerais");
    Funcionario funcChi3 = new Funcionario("Lee", "Garçom");

    List<Funcionario> funcsChi = Arrays.asList(funcChi1, funcChi2, funcChi3);

    List<Ingrediente> ingChi = Arrays.asList(champignon, brocolis, macarrao, carne);

    Cozinha cozChi = new Cozinha(5, "Chinesa", 10, 21, 10, 21, "Yakissoba", ingChi, funcsChi);

    Ingrediente molho = new Ingrediente("Molho", LocalDate.of(2021, 05, 20));

    Funcionario funcIt1 = new Funcionario("Mario", "Cozinheiro");
    Funcionario funcIt2 = new Funcionario("Luigi", "Garçom");

    List<Funcionario> funcsIt = Arrays.asList(funcIt1, funcIt2);

    List<Ingrediente> ingIt = Arrays.asList(molho, macarrao, carne);

    Cozinha cozIt = new Cozinha(10, "Italiana", 3, 50, 13, 23, "Pizza", ingIt, funcsIt);

  }
}