package org.example.entidades;

import java.util.Objects;

public class Material {

    private String titulo;
    private String editora;
    private int ano;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Material material = (Material) o;
        return ano == material.ano && Objects.equals(titulo, material.titulo) && Objects.equals(editora, material.editora);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, editora, ano);
    }
}
