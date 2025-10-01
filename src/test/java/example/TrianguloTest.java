package exemplo;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TrianguloTest {

    @DataProvider
    public Object[][] dpEquilatero() {
        return new Object[][] {
                { 5, 5, 5, "Equilátero" },
                { 10, 10, 10, "Equilátero" }
        };
    }

    @DataProvider
    public Object[][] dpIsosceles() {
        return new Object[][] {
                { 5, 5, 3, "Isósceles" },
                { 7, 4, 7, "Isósceles" },
                { 6, 8, 8, "Isósceles" }
        };
    }

    @DataProvider
    public Object[][] dpEscaleno() {
        return new Object[][] {
                { 3, 4, 5, "Escaleno" },
                { 7, 8, 9, "Escaleno" },
                { 10, 12, 15, "Escaleno" }
        };
    }

    @Test(dataProvider = "dpEquilatero")
    public void deveClassificarEquilatero(int a, int b, int c, String esperado) {
        Assert.assertEquals(Triangulo.classificar(a, b, c), esperado);
    }

    @Test(dataProvider = "dpIsosceles")
    public void deveClassificarIsosceles(int a, int b, int c, String esperado) {
        Assert.assertEquals(Triangulo.classificar(a, b, c), esperado);
    }

    @Test(dataProvider = "dpEscaleno")
    public void deveClassificarEscaleno(int a, int b, int c, String esperado) {
        Assert.assertEquals(Triangulo.classificar(a, b, c), esperado);
    }
}
