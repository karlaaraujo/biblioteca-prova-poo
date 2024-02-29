package org.example.controladores;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class MaterialControladorTest {

    @Test
    public void verificaSeQuantidadeCadastroMaiorQueZeroOuFail() {
        assertThrows(RuntimeException.class, () -> MaterialControlador.cadastrarMateriais(0));
    }

    @Test
    public void verificaSeTodosOsDadosSaoPreenchidosOuFail() {

    }

    @Test
    public void verificaSeTituloTemNoMin4CaracteresOuFail() {

    }


}
