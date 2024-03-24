public class Estudante {
  public String nome;
  public int anoParaFormatura;
  public double media;
  
  public Estudante() {

  }

  public Estudante(String nome, int anoParaFormatura, double media) {
    this.nome = nome;
    this.anoParaFormatura = anoParaFormatura;
    this.media = media;
  }

  public void setAnoParaFormatura(int anoParaFormatura) {
    this.anoParaFormatura = anoParaFormatura;
  }
}
