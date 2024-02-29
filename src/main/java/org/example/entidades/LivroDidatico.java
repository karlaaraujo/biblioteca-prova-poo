package org.example.entidades;

public class LivroDidatico extends Material {
    private String disciplinaAssociada;
    private String tipoLivro;

    public String getDisciplinaAssociada() {
        return disciplinaAssociada;
    }

    public void setDisciplinaAssociada(String disciplinaAssociada) {
        this.disciplinaAssociada = disciplinaAssociada;
    }

    public String getTipoLivro() {
        return tipoLivro;
    }

    public void setTipoLivro(String tipoLivro) {
        this.tipoLivro = tipoLivro;
    }
}
