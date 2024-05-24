package br.ce.wcaquino.servicos;

import br.ce.wcaquino.exceptions.NaoPodeDividirPorZeroException;
import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

    @Test
    public void deveSomarDoisValores(){
        int a = 5;
        int b = 3;
        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.soma(a, b);

        Assert.assertEquals(8, resultado);
    }

    @Test
    public void deveSubtrairDoisValores(){
        int a = 5;
        int b = 3;
        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.subtrair(a, b);

        Assert.assertEquals(8, resultado);
    }

    @Test
    public void deveMultiplicaçãoDoisValores(){
        int a = 5;
        int b = 3;
        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.multiplica(a, b);

        Assert.assertEquals(8, resultado);
    }
    @Test(expected = NaoPodeDividirPorZeroException.class)
    public void deveDivideDoisValores() throws NaoPodeDividirPorZeroException {
        int a = 5;
        int b = 3;
        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.divide(a, b);

        Assert.assertEquals(8, resultado);
    }
}
