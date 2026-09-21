package br.com.fiap.main;

    import br.com.fiap.entities.Cliente;
    import br.com.fiap.entities.Pedido;
    import br.com.fiap.entities.Produto;

public class TesteSistema {

    public static void main(String[] args) {

        Cliente objcliente = new Cliente();
        Pedido objpedido = new Pedido();
        Produto objproduto = new Produto();

        objcliente.setNome("luis");
        objcliente.setCpf("555-555-555-55");
        objcliente.setIdade(11);
        objcliente.setPedido(objpedido);

        objpedido.setNumero(77);
        objpedido.setProduto(objproduto);


        objproduto.setNome("carro");
        objproduto.setPreco(88.8);
        objproduto.setQuantidade(2);

        System.out.println(

                (objcliente +"\n")

        );



    }

}
