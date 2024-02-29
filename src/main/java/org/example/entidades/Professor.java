package org.example.entidades;

import java.util.List;

public class Professor extends Locatario {

    private List<Disciplina> disciplinasMinistradas;

    public static final int NUMERO_MAX_DIAS_LOCACAO = 10;

    public List<Disciplina> getDisciplinasMinistradas() {
        return disciplinasMinistradas;
    }

    public void setDisciplinasMinistradas(List<Disciplina> disciplinasMinistradas) {
        this.disciplinasMinistradas = disciplinasMinistradas;
    }
}
