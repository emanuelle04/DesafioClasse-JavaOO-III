public class VeiculoPasseio extends Veiculo{
  public String cor_externa;
  public String cor_interna;
  public int num_portas;
  public int num_passageiros;

  VeiculoPasseio(String pl,Procedencia proced, String mar, String model,  int ano_m, int ano_f, String cha, String ren,  double comb, String mot, double km, double c_medio, String cor_e, String cor_i, int num_po, int num_pa){

    super(pl, proced, mar, model, ano_m, ano_f, cha, ren, comb, mot, km, c_medio);
    cor_externa = cor_e;
    cor_interna = cor_i;
    num_portas = num_po;
    num_passageiros = num_pa;

  }

  

}