package br.com.fiap.entities;

public class Produto {

    private String indentificação;
    private String cor;
    private int ID;

    public String getIndentificação() {
        return indentificação;
    }
    public void setIndentificação(String indentificação) {
        this.indentificação = indentificação;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }

        @Override
        public String toString() {
            return  "\nProduto: " +
                    "\nindentificação = '" + indentificação + '\'' +
                    "\ncor = '" + cor + '\'' +
                    "\nID = " + ID;


    }
}
