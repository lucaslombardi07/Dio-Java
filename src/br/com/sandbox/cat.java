package br.com.sandbox;

public class cat {
    private String nome;
    private String cor;
    private Integer idade;

    public cat() {}

    public cat(String nome, String cor, Integer idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
/*

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
*/






}
