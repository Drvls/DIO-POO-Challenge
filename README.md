# 🎓 Desafio de Projeto - Orientação a Objetos com Java

> Projeto desenvolvido como desafio prático de POO no Bootcamp Java & QA da DIO em parceria com a Almaviva Solutions.

---

## 📚 Tabela de Conteúdos

- [Sobre o Desafio](#-sobre-o-desafio)
- [O que foi praticado](#-o-que-foi-praticado)
- [Estrutura do Projeto](#-estrutura-do-projeto)
- [Diagrama de Classes](#-diagrama-de-classes)
- [Como Executar](#-como-executar)
- [Tecnologias](#-tecnologias)
- [Autor](#-autor)

---

## 🧾 Sobre o Desafio

O objetivo deste desafio foi **praticar os pilares da Programação Orientada a Objetos (POO)** em Java, modelando um sistema simples de Bootcamp onde desenvolvedores se inscrevem em conteúdos, progridem e acumulam XP.

O projeto não foi pensado para resolver um problema de negócio real, mas sim para exercitar conceitos fundamentais do paradigma OO que são exigidos no mercado de trabalho.

---

## 🧠 O que foi praticado

### Abstração
A classe `Content` é abstrata, ela define o contrato de que todo conteúdo deve saber calcular seu XP (`calculateXP()`), mas deixa cada subclasse decidir como esse cálculo funciona. Isso representa o conceito real de bootcamp, onde cursos e mentorias são tipos de conteúdo com regras diferentes.

### Encapsulamento
Todos os atributos das classes são privados (`private`) e acessados apenas via getters e setters. Isso protege o estado interno dos objetos e evita modificações inesperadas de fora da classe.

### Herança
`Course` e `Mentoring` estendem `Content`, herdando os atributos `title` e `description`, e são obrigadas a implementar `calculateXP()` de forma própria:
- `Course`: XP = `defaultXP (10)` × carga horária do curso
- `Mentoring`: XP = `defaultXP (10)` + 20 fixo (mentorias têm bônus por serem ao vivo)

### Polimorfismo
O método `calculateXP()` é chamado da mesma forma para qualquer tipo de `Content`, mas cada classe retorna um valor diferente. Em `Dev.calculateXP()`, o stream percorre os conteúdos concluídos e chama `calculateXP()` sem se preocupar se é um curso ou mentoria, polimorfismo em ação.

---

## 📁 Estrutura do Projeto

```
src/
├── Main.java                          # Ponto de entrada — simulação do sistema
└── org/alexvsi/challenge/poo/domain/
    ├── Content.java                   # Classe abstrata base para conteúdos
    ├── Course.java                    # Conteúdo do tipo Curso (extends Content)
    ├── Mentoring.java                 # Conteúdo do tipo Mentoria (extends Content)
    ├── Bootcamp.java                  # Agrega conteúdos e devs inscritos
    └── Dev.java                       # Representa um desenvolvedor no bootcamp
```

---

## 🗺 Diagrama de Classes

```
         +------------------+
         |    <<abstract>>  |
         |     Content      |
         +------------------+
         | - title: String  |
         | - desc: String   |
         | + defaultXP: 10f |
         +------------------+
         | + calculateXP()* |
         +--------+---------+
                  |
        +---------+---------+
        |                   |
+-------+-------+   +-------+-------+
|    Course     |   |   Mentoring   |
+---------------+   +---------------+
| - courseLoad  |   | - date        |
+---------------+   +---------------+
| + calculateXP |   | + calculateXP |
| = 10 * load   |   | = 10 + 20     |
+---------------+   +---------------+

+----------------------+       +----------------------------+
|      Bootcamp        |       |           Dev              |
+----------------------+       +----------------------------+
| - name               |       | - name                     |
| - description        |       | - subscribedContent: Set   |
| - startDate          |<------| - completedContent: Set    |
| - endDate            |       +----------------------------+
| - contents: Set      |       | + subscribeBootcamp()      |
| - subscribedDevs: Set|       | + progress()               |
+----------------------+       | + calculateXP()            |
                               +----------------------------+
```

---

## 🔍 Decisões técnicas relevantes

**Por que `Set` e não `List`?**
`Set` não permite duplicatas. Um dev não pode se inscrever no mesmo conteúdo duas vezes, e um conteúdo não pode aparecer duplicado no bootcamp. `LinkedHashSet` foi usado para manter a ordem de inserção, importante para o método `progress()` funcionar corretamente (sempre completa o primeiro conteúdo inscrito).

**Por que `Optional` no método `progress()`?**
`stream().findFirst()` retorna um `Optional<Content>`, um container que pode ou não ter valor. Usar `isPresent()` antes de acessar evita `NullPointerException` quando não há mais conteúdos inscritos. É a forma idiomática de lidar com ausência de valor em Java moderno.

**Por que `mapToDouble` no `calculateXP()`?**
Stream de objetos não tem `sum()` direto. `mapToDouble()` converte cada `Content` para seu valor de XP (double primitivo), criando um `DoubleStream` que oferece o método `sum()`.

---

## ▶ Como Executar

**Pré-requisitos:** Java 21+, IntelliJ IDEA (ou outra IDE com suporte a Java)

```bash
# Clone o repositório
git clone https://github.com/Drvls/seu-repositorio.git

# Entre na pasta
cd desafio-poo-java

# Execute pela IDE ou via terminal
javac -d out src/**/*.java
java -cp out Main
```

**Saída esperada:**
```
Dravls dev => Vinicius
Conteúdos inscritos: [Course{...}, Mentoring{...}, Mentoring{...}]
Conteúdos concluidos: [Course{...}]
XP: 80.0

Groner dev => LGroner
Conteúdos inscritos: [Mentoring{...}, Mentoring{...}]
Conteúdos concluidos: [Course{...}, Course{...}]
XP: 200.0
```

---

## 🛠 Tecnologias

- Java 21 LTS ☕
- IntelliJ IDEA
- Git & GitHub

---

## 👤 Autor

- **Nome:** Alexsandro Vinicius
- **LinkedIn:** [linkedin.com/in/sam-vinicius](https://www.linkedin.com/in/sam-vinicius/)
- **GitHub:** [github.com/Drvls](https://github.com/Drvls)

---

*Projeto desenvolvido durante o Bootcamp Java & QA — DIO × Almaviva Solutions*
