# POO e SOLID em Java

Este repositório reúne projetos e exercícios desenvolvidos em **Java**, com foco em **Programação Orientada a Objetos**, princípios **SOLID**, refatoração e redução de acoplamento.

Os exemplos utilizam projetos Maven para demonstrar, de forma prática, como aplicar conceitos como responsabilidade única, princípio aberto/fechado, interfaces, polimorfismo e separação de responsabilidades.

## Conteúdos Abordados

- Programação Orientada a Objetos em Java
- Classes, objetos e encapsulamento
- Interfaces
- Polimorfismo
- Refatoração de código
- Redução de acoplamento
- Princípio da Responsabilidade Única
- Princípio Aberto/Fechado
- Organização em camadas
- Projetos Maven

## Estrutura do Repositório

```text
.
├── Gamification_S/
├── S_Solid/
├── estimativa-java-ocp/
└── exercicio-acoplamento-maven-sem-ocp/
```

## Descrição dos Projetos

### Gamification_S

Projeto Maven com uma implementação refatorada de um sistema simples de gamificação.

O exemplo trabalha o cálculo de bônus para jogadores de diferentes categorias, separando a lógica de cálculo em classes específicas.

Principais conceitos:

- Interface `BonusCalculator`
- Classes específicas de bônus
- Polimorfismo
- Separação de responsabilidades
- Redução de condicionais concentradas em uma única classe

Classes principais:

- `Player`
- `PlayerType`
- `BonusCalculator`
- `BronzeBonus`
- `SilverBonus`
- `GoldBonus`
- `Main`

### S_Solid

Projeto Maven com um exemplo inicial de geração de bônus em um sistema de gamificação.

O código concentra regras de cálculo em uma classe geradora, servindo como base para discutir responsabilidades, manutenção e possíveis refatorações orientadas aos princípios SOLID.

Principais conceitos:

- Classe de serviço para cálculo de bônus
- Uso de enum para tipos de jogador
- Estruturas condicionais
- Discussão sobre responsabilidade única
- Ponto de partida para refatoração

Classes principais:

- `GameBonusGenerator`
- `Player`
- `PlayerType`
- `Main`

### estimativa-java-ocp

Projeto Maven refatorado para demonstrar redução de acoplamento e aplicação do princípio **OCP (Open/Closed Principle)**.

O exemplo simula a criação de estimativas para tarefas Java, separando regras de produtividade, persistência e notificação por meio de interfaces e classes específicas.

Principais conceitos:

- Open/Closed Principle
- Inversão de dependência por interfaces
- Separação entre domínio, serviço e infraestrutura
- Repositório para persistência
- Notificadores para diferentes canais
- Calculadoras de produtividade intercambiáveis

Pacotes principais:

- `app`
- `dominio`
- `service`
- `infra.notificacao`
- `infra.persistencia`

### exercicio-acoplamento-maven-sem-ocp

Projeto Maven utilizado como exemplo de código mais acoplado, antes da aplicação completa do OCP.

Ele serve como comparação com o projeto `estimativa-java-ocp`, mostrando como a refatoração pode melhorar a organização, facilitar manutenção e reduzir dependências diretas.

Principais conceitos:

- Código com maior acoplamento
- Dependências diretas entre classes
- Persistência e notificação ligadas ao fluxo principal
- Base para comparação com a versão refatorada

## Tecnologias Utilizadas

- **Java**
- **Maven**
- **Programação Orientada a Objetos**
- **SOLID**
- **OCP**
- **Interfaces**
- **Refatoração**

## Como Executar os Projetos

Cada pasta principal contém um projeto Maven independente. Para executar um deles:

1. Abra a pasta do projeto no IntelliJ IDEA, Eclipse ou VS Code.
2. Aguarde a importação das dependências Maven.
3. Execute a classe `Main` do projeto desejado.

Também é possível executar pelo terminal dentro da pasta do projeto:

```bash
mvn clean compile
```

Em projetos com configuração de execução via Maven, utilize:

```bash
mvn clean compile exec:java
```

## Observação

As pastas `target` são geradas automaticamente pelo Maven durante a compilação. Elas armazenam arquivos compilados e artefatos do projeto.

## Objetivo do Repositório

Este repositório tem como objetivo organizar estudos práticos sobre Programação Orientada a Objetos e princípios SOLID em Java, demonstrando como decisões de design impactam manutenção, extensibilidade e clareza do código.

## Autoria

Desenvolvido como parte dos estudos de POO, SOLID e refatoração em Java.
