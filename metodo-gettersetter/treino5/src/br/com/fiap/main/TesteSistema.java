package br.com.fiap.main;

    import br.com.fiap.entities.Usuario;
    import br.com.fiap.entities.Endereco;
    import br.com.fiap.entities.Carro;


public class TesteSistema {

    public static void main(String[] args) {



    Usuario objusuario = new Usuario();
    Endereco objendereco = new Endereco();
    Carro objcarro = new Carro();

    objusuario.setNome("luis");
    objusuario.setCpf("898.898.898-89");
    objusuario.setIdade(17);

    objusuario.setEndereco(objendereco);

    objendereco.setRua("pror");
    objendereco.setCep("88989-88");
    objendereco.setNumero(6);

    objcarro.setModelo("porsche 911");
    objcarro.setCor("azul");
    objcarro.setAno(2026);

        System.out.println(

                (objusuario +"\n "+"\n" + objcarro)

        );

        }
    }
