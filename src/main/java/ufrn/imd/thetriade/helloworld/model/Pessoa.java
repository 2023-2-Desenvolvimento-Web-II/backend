package ufrn.imd.thetriade.helloworld.model;

import java.util.List;

public class Pessoa extends AbstractEntity {
    private String nome;
    private String cpf;
    private String dataDeNascimento;

    public Pessoa() {
        super();
    }

    public Pessoa(Integer id, String cpf, String nome, String dataDeNascimento) {
        super(id);
        this.cpf = cpf;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }

    public Pessoa(Integer id, String cpf, String nome, String dataDeNascimento, List<Usuario> perfis) {
        super(id);
        this.cpf = cpf;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDataDeNascimento() {
        return dataDeNascimento;
    }
    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
