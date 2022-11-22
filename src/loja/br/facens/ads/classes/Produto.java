/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja.br.facens.ads.classes;

/**
 *
 * @author douglas
 */
public class Produto {
    private String produto;
    private String descricao;
    private String fornecedor;
    private float custo;
    private float venda;
    private float icms;
    private int tamanho;
    
    public Produto(){}
    
    private void cadProd(String produto, String descricao, String fornecedor, float custo, float venda, float icms, int tamanho){
        this.produto = produto;
        this.descricao = descricao;
        this.fornecedor = fornecedor;
        this.custo = custo;
        this.venda = venda;
        this.icms = icms;
        this.tamanho = tamanho;
    }    
    private void atuProd(String produto, String descricao, String fornecedor, float custo, float venda, float icms, int tamanho){
        this.produto = produto;
        this.descricao = descricao;
        this.fornecedor = fornecedor;
        this.custo = custo;
        this.venda = venda;
        this.icms = icms;
        this.tamanho = tamanho;
    }
    
    public String getProduto() {
        return produto;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public float getCusto() {
        return custo;
    }

    public float getVenda() {
        return venda;
    }

    public float getIcms() {
        return icms;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }

    public void setVenda(float venda) {
        this.venda = venda;
    }

    public void setIcms(float icms) {
        this.icms = icms;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
