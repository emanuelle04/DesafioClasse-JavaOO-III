public class VeiculoCarga extends Veiculo{
  public double capacidade_max;
  public double altura;
  public double largura;
  public double profundidade;

  VeiculoCarga(String pl,Procedencia proced, String mar, String model,  int ano_m, int ano_f, String cha, String ren,  double comb, String mot, double km, double c_medio, double cap_max, double alt, double lar, double prof){

    super(pl, proced, mar, model, ano_m, ano_f, cha, ren, comb, mot, km, c_medio);
    capacidade_max = cap_max;
    altura = alt;
    largura = lar;
    profundidade = prof;

  }

  

}