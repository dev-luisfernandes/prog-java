package br.com.fiap.entities;
//extends é utilizado para falar que é uma extensão da super classe pessoa
public class PessoaFisica  extends Pessoa{

    private String cpf;
    private String rg;
    private String dataNascimento;
    private DadosBancarios dadosBancarios; //atributo de referencia

    public PessoaFisica() {
    }

    public PessoaFisica(String cpf, String rg, String dataNascimento) {
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.dadosBancarios = dadosBancarios;
    }

    public PessoaFisica(String nome, String email, String fone, double renda, String cpf, String rg, String dataNascimento) {
        //atributos da classe super em to string
        super(nome, email, fone, renda);
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public DadosBancarios getDadosBancarios() {
        return dadosBancarios;
    }


    @Override
    public String toString() {
        return "--Pessoa Física--" +
                "\nCPF = " + cpf +
                "\nRG = " + rg +
                "\nData de Nascimento = " + dataNascimento +
                "\nDados Bancários = " + dadosBancarios;
    }
}
