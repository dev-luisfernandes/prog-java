package br.com.fiap.entities;

public class MediaSemestral {

    private double cp1;
    private double cp2;
    private double sprint1;
    private double sprint2;
    private double gs;

    public MediaSemestral() {
    }

    public MediaSemestral(double cp1, double cp2, double sprint1, double sprint2, double gs) {
        this.cp1 = cp1;
        this.cp2 = cp2;
        this.sprint1 = sprint1;
        this.sprint2 = sprint2;
        this.gs = gs;
    }

    public double getCp1() {
        return cp1;
    }

    public void setCp1(double cp1) {
        this.cp1 = cp1;
    }

    public double getCp2() {
        return cp2;
    }

    public void setCp2(double cp2) {
        this.cp2 = cp2;
    }

    public double getSprint1() {
        return sprint1;
    }

    public void setSprint1(double sprint1) {
        this.sprint1 = sprint1;
    }

    public double getSprint2() {
        return sprint2;
    }

    public void setSprint2(double sprint2) {
        this.sprint2 = sprint2;
    }

    public double getGs() {
        return gs;
    }

    public void setGs(double gs) {
        this.gs = gs;
    }

    @Override
    public String toString() {
        return "MEDIA SEMESTRAL " +
                "\nNota da CP1 =" + cp1 +
                "\nNota da CP2 =" + cp2 +
                "\nNota da Sprint 1 =" + sprint1 +
                "\nNota da Sprint 2 =" + sprint2 +
                "\nNota da Global Solution =" + gs +
                "\n\nMEDIA NOTA DAS CPS: " + calcularMediaCps() +
                "\nPONTUAÇÃO ALCANÇADA DAS CPS  DENTRE O MÁXIMO DE 2 PONTOS: " + pontosCps() +
                "\nMEDIA NOTA DAS SPRINTS: " + calcularMediaSprints() +
                "\nPONTUAÇÃO ALCANÇADA DAS SPRINTS DENTRE O MÁXIMO DE 2 PONTOS: " + pontosSprints() +
                "\nPONTUAÇÃO ALCANÇADA DAS CPS E SPRINTS DENTRE O MÁXIMO DE 4 PONTOS: " + pontosCpsComSprints() +
                "\nMEDIA DE NOTA PARCIAL DAS CPS COM SPRINTS: " + mediaCpsComSprints() +
                "\nPONTOS ALCANÇADOS DA GS DENTRE O MÁXIMO DE 6 PONTOS: " + pontosGs() +
                "\nMEDIA SEMESTRAL: " + mediaSemestral();
    }

    // calcularMediaCps
    public double calcularMediaCps(){
        double soma = cp1 + cp2;
        return soma /2;
    }

    // pontosCps
    public double pontosCps(){
        return calcularMediaCps() * 20 /100;
    }

    // calcularMediaSprints
    public double calcularMediaSprints(){
        double soma = sprint1 + sprint2;
        return soma / 2;
    }

    // pontosSprints
    public double pontosSprints(){
        return calcularMediaSprints() * 20 /100;
    }

    // mediaCpsComSprints
    public double mediaCpsComSprints(){
        double soma = calcularMediaCps() + calcularMediaSprints();
        return soma / 2;
    }

    // pontosCpsComSprints
    public double pontosCpsComSprints(){
        return pontosCps() + pontosSprints();
    }

    // pontosGs
    public double pontosGs(){
        return gs * 60 /100;
    }

    // mediaSemestral
    public double mediaSemestral(){
        return  pontosGs() + pontosCpsComSprints();
    }
}
