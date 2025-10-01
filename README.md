# Seminário de Segurança e Teste de Software

## Projeto Exemplo com TestNG

Este projeto foi desenvolvido para o **seminário da disciplina Segurança e Teste de Software**, com o objetivo de demonstrar o uso do **TestNG**, um dos frameworks mais utilizados para automação de testes em Java.

---

## O que é o TestNG?

O **TestNG (Test Next Generation)** é um framework de testes inspirado no JUnit e no NUnit, mas que oferece mais recursos e flexibilidade. Ele é amplamente utilizado para testes **unitários, de integração e funcionais**, além de ser muito adotado em conjunto com ferramentas de automação como o Selenium.

---

## Vantagens do TestNG

- Organização dos testes em **grupos** e **prioridades**.
- Suporte a **execução paralela** de testes.
- **Relatórios HTML/XML** automáticos após a execução.
- Suporte a **parametrização** de testes (DataProvider).
- Integração fácil com ferramentas de **CI/CD** (Jenkins, GitHub Actions, etc.).
- Ciclo de vida de testes mais **flexível** do que o JUnit tradicional.

---

## TestNG vs JUnit

| Característica             | JUnit          | TestNG                 |
| -------------------------- | -------------- | ---------------------- |
| **Grupos de Testes**       | ❌ Não suporta | ✅ Sim                 |
| **Execução Paralela**      | Limitada       | ✅ Completo            |
| **Parametrização**         | Limitada       | ✅ DataProvider        |
| **Relatórios Automáticos** | Básico         | ✅ Avançado            |
| **Anotações**              | Mais simples   | ✅ Mais diversificadas |

---

## Principais Anotações do TestNG

- `@BeforeSuite` → executa uma vez antes de todos os testes da suíte.
- `@AfterSuite` → executa uma vez após todos os testes da suíte.
- `@BeforeTest` / `@AfterTest` → executa antes/depois de cada bloco de testes.
- `@BeforeClass` / `@AfterClass` → executa antes/depois de todos os métodos de uma classe.
- `@BeforeMethod` / `@AfterMethod` → executa antes/depois de **cada método @Test**.
- `@Test` → identifica um método de teste (pode ter `priority`, `groups`, `dependsOnMethods`, etc.).
- `@DataProvider` → fornece dados externos para execução parametrizada de testes.

---

## Estrutura de Pastas do Projeto

O projeto segue a **convenção do Maven**:

projeto-testng/
├─ pom.xml # arquivo obrigatório do Maven
├─ testng.xml # arquivo de configuração do TestNG (opcional, mas recomendado)
├─ src/
│ ├─ main/
│ │ └─ java/
│ │ └─ br/edu/idp/exemplo/
│ │ └─ Triangulo.java # código principal (se houver lógica de app)
│ └─ test/
│ └─ java/
│ └─ br/edu/idp/exemplo/
│ └─ TestTriangulo.java # código de teste (com TestNG)

---

## Como executar

1. Certifique-se de ter o **Maven** e o **JDK** instalados.
2. Clone este repositório.
3. Na raiz do projeto, execute:

   ```bash
   mvn test
   ```
