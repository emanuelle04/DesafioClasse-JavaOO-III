public class Veiculo{
  public String placa;
  public Procedencia procedencia;
  public String marca;
  public String modelo;
  public int ano_modelo;
  public int ano_fabricacao;
  public String chassi;
  public String renavam;
  public double combustivel;
  public String motor;
  public double quilometragem;
  public double consumo_medio;

Veiculo(String pl, Procedencia proced, String mar, String model,  int ano_m, int ano_f, String cha, String ren,  double comb, String mot, double km, double c_medio){
  placa = pl;
  procedencia = proced;
  marca = mar;
  modelo = model;
  ano_modelo = ano_m;
  ano_fabricacao = ano_f;
  chassi = cha;
  renavam = ren;
  combustivel = comb;
  motor = mot;
  quilometragem = km;
  consumo_medio = c_medio;
}

public void imprimirRelatorio(){
    System.out.printf("Detalhes do Veículo:\nPlaca: %s\nRenavam: %s\nModelo: %s\nAno de Fabricação: %d" ,placa, renavam, modelo, ano_fabricacao);
  }

}