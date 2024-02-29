package org.example.entidades;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Locacao {

    private Locatario locatario;

    private Material material;

    private Date data;


    public Locatario getLocatario() {
        return locatario;
    }

    public void setLocatario(Locatario locatario) {
        this.locatario = locatario;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Locacao locacao = (Locacao) o;
        return Objects.equals(locatario, locacao.locatario) && Objects.equals(material, locacao.material) && Objects.equals(data, locacao.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locatario, material, data);
    }
}
