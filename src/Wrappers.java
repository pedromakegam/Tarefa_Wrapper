public class Wrappers {


    private int idade = 90;
    private Integer idade2 = idade;


    public int getIdade() {
        return idade;
    }

    public Integer getIdade2() {
        return idade2;

    }

  public Wrappers(){

      System.out.println("Idade: " + getIdade());

  }

}
