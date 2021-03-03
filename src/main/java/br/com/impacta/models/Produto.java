package br.com.impacta.models;


public class Produto {

  public int codigo;

  public String descricao;

  public Double valor;

  public String montarResumo() {
    String resumo = 
    "codigo: " + this.codigo + ", " +    
    "descricao: " + this.descricao + ", " + 
    "valor: " + this.valor;

    return resumo;
  }

}
