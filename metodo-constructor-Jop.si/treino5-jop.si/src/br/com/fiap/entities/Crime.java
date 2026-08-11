package br.com.fiap.entities;

public class Crime {

    private int artigo;
    private String data;
    private String status;

    public Crime() {
    }

    public Crime(int artigo, String data, String status) {
        this.artigo = artigo;
        this.data = data;
        this.status = status;
    }

    public int getArtigo() {
        return artigo;
    }

    public void setArtigo(int artigo) {
        this.artigo = artigo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Crime{" +
                "artigo=" + artigo +
                ", data='" + data + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
