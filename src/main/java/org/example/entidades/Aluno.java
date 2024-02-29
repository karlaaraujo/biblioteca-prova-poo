package org.example.entidades;

public class Aluno extends Locatario {
    private String numeroMatricula;
    public static final int NUMERO_MAX_DIAS_LOCACAO = 5;

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }
}
