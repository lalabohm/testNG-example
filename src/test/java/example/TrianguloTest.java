package example;

import org.testng.Assert;
import org.testng.annotations.*;

public class TrianguloTest {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Início da Suíte de Testes do Triângulo");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("Fim da Suíte de Testes do Triângulo");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Preparando a classe de testes");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Finalizando a classe de testes");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Iniciando método de teste");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Finalizando método de teste");
    }

    @Test(priority = 1, groups = "basico")
    public void deveClassificarEquilatero() {
        Assert.assertEquals(Triangulo.classificar(5, 5, 5), "Equilátero");
    }

    @Test(priority = 2, groups = "basico")
    public void deveClassificarIsosceles() {
        Assert.assertEquals(Triangulo.classificar(5, 5, 3), "Isósceles");
    }

    @Test(priority = 3, groups = "basico")
    public void deveClassificarEscaleno() {
        Assert.assertEquals(Triangulo.classificar(4, 5, 6), "Escaleno");
    }

    @Test(priority = 4, groups = "basico")
    public void deveDetectarNaoTriangulo() {
        Assert.assertEquals(Triangulo.classificar(1, 2, 3), "Não é triangulo");
    }

    @Test(priority = 5, groups = "basico")
    public void deveDetectarLadosInvalidos() {
        Assert.assertEquals(Triangulo.classificar(0, 5, 5), "Lados inválidos");
    }
}
