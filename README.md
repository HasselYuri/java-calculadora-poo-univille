# java-calculadora-poo-univille
Calculadora desenvolvida em Java, aplicando e demonstrando os conceitos de Orientação a Objetos (Classes, Herança, Polimorfismo, Encapsulamento, Abstração e Relacionamentos).
# Calculadora Univille em Java - Aplicação de POO

Este repositório contém o projeto de uma Calculadora desenvolvida em Java, com o objetivo principal de demonstrar a aplicação correta dos princípios da Programação Orientada a Objetos (POO) e os relacionamentos entre classes.

## Arquitetura do Projeto

O código foi estruturado de forma modular para isolar responsabilidades, seguindo a filosofia POO.

| Classe | Responsabilidade Principal | Relacionamento Principal |

| `Main` | Ponto de entrada e controle de fluxo do Menu. | Associa com `Calculadora` e `Scanner`. |

| `Calculadora` | Gerencia o fluxo de cálculos e o `Historico`. | **Composição** (com `Historico`) e **Associação** (com `Scanner`). |

| `Historico` | Armazena e exibe a lista de operações. | **Agregação** (das instâncias de `Operacao`). |

| `Operacao` | Define o contrato abstrato para todo cálculo. | **Abstração** e base para **Herança**. |

| `Soma`, `Divisao`, `Potenciacao`, etc. | Implementam a lógica de cálculo específica. | **Herança** de `Operacao` e **Polimorfismo**. |
