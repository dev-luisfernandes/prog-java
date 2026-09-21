package br.com.fiap.entities;

public class MediaFinal {

    private int rm;
    private String nome;
    private String turma;
    private double mediaSemestre1;
    private double mediaSemestre2;
    private double mediaFinal;
    private String informacaoMedia;

    public int getRm() {
        return rm;
    }

    public void setRm(int rm) {
        this.rm = rm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public double getMediaSemestre1() {
        return mediaSemestre1;
    }

    public void setMediaSemestre1(double mediaSemestre1) {
        this.mediaSemestre1 = mediaSemestre1;
    }

    public double getMediaSemestre2() {
        return mediaSemestre2;
    }

    public void setMediaSemestre2(double mediaSemestre2) {
        this.mediaSemestre2 = mediaSemestre2;
    }

    public double getMediaFinal() {
        return mediaFinal;
    }

    public void setMediaFinal(double mediaFinal) {
        this.mediaFinal = mediaFinal;
    }

    public String getInformacaoMedia() {
        return informacaoMedia;
    }

    public void setInformacaoMedia(String informacaoMedia) {
        this.informacaoMedia = informacaoMedia;
    }

    @Override
    public String toString() {
        return
                "\nRM = " + rm +
                "\nNome = '" + nome + '\'' +
                "\nTurma = '" + turma + '\'' +
                "\nMedia Semestre 1 = " + mediaSemestre1 +
                "\nMedia Semestre 2 = " + mediaSemestre2 +
                "\nMEDIA FINAL = " + mediaFinal() +
                "\nINFORMAÇÃO= '" + informacaoMedia() + '\'';
    }

    // pontuacaoSemestre1
    public double pontuacaoSemestre1() {
        return mediaSemestre1 * 40 / 100;
    }

    // pontuacaoSemestre2
    public double pontuacaoSemestre2() {
        return mediaSemestre2 * 60 / 100;
    }

    // mediaFinal
    public double mediaFinal() {
        return pontuacaoSemestre1() + pontuacaoSemestre2();
    }

    // informacaoMedia
    public String informacaoMedia() {
        String informacao = null;
        if (mediaFinal() >= 6) {
            informacao = "Aeeê fiquei na media, passei uhull!";
        } else {
            informacao = "Eita... fiquei abaixo da media, sniff sniff";
        }
        return informacao;
    }

    public void mediaFinal(double mediaFinal) {
    }

    public void informacaoMedia(String informacaoMedia) {
    }
}
