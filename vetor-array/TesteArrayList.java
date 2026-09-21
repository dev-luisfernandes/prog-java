package br.com.fiap.main;
import br.com.fiap.entities.Produto;
import javax.swing.*;
import java.util.ArrayList;

public class TesteArrayList {
    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }
    static int inteiro(String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }
    static double real(String j){
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }
    //metodo de exec.
    public static void main(String[] args) {
        //Preparar a lista
        ArrayList<Produto> listaProdutos = new ArrayList<>();

        //Preparar objeto
        Produto objProduto = null;

        //Laço
        do {
            objProduto = new Produto();
            objProduto.setCodigo(inteiro("Código"));
            objProduto.setMarca(texto("Marca"));
            objProduto.setPreco(real("Preço"));
            objProduto.setTipo(texto("Tipo"));
            listaProdutos.add(objProduto);

        } while( JOptionPane.showConfirmDialog(null,
                "Adicionar mais produtos no carrinho?",
                "Carrinho de compras",
                JOptionPane.YES_NO_OPTION

        ) ==0);

        //Saídas
        for(Produto p : listaProdutos){
            System.out.println(
                    "\n\nCódigo" + p.getCodigo() +
                            "\nMarca" + p.getMarca() +
                            "\nPreço" + p.getPreco() +
                            "\nTipo" + p.getTipo()
            );
        }
    }
}