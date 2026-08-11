package br.com.fiap.main;
//importar a classe
import br.com.fiap.entities.Cliente;
import br.com.fiap.entities.Endereco;
import br.com.fiap.entities.Produto;


public class TesteCliente {

    public static void main(String[] args) {

        Cliente objcliente= new Cliente();
        Endereco objendereco= new Endereco();
        Produto objtproduto= new Produto();

        objcliente.setNome("lucas");
        objcliente.setIdade(11);
        objcliente.setCpf("444.555.666.77");
        objcliente.setAltura(1.75);

        objendereco.setRua("rua iguapei");
        objendereco.setNumero(88);
        objendereco.setCidade("são paulo");
        objendereco.setBairro("são paulo");

        objtproduto.setIndentificação("carrinho");
        objtproduto.setCor("azul");
        objtproduto.setID(121);


        System.out.println(
            objcliente + "\n"+ objendereco+ "\n"+ objtproduto);

    }

}
