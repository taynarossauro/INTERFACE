# Sistema_de_Gestão_de_Funcionários

Este projeto implementa um sistema de gestão de funcionários que calcula o bônus anual com base na categoria do funcionário. A interface `Funcionario` define o método `calcularBonus()`, que é implementado em diferentes classes para calcular o bônus conforme o tipo de funcionário.

## 🚀 Começando

O objetivo deste exercício é aplicar conceitos de interfaces e polimorfismo em Java, implementando diferentes cálculos de bônus para funcionários assalariados e horistas. A classe principal (`Main`) é responsável por criar as instâncias dos funcionários e exibir o valor do bônus no console.

### Características

•⁠  ⁠Interface `Funcionario` com o método:

- `calcularBonus()`: define o cálculo do bônus anual.

•⁠  ⁠Classes que implementam a interface `Funcionario`:

1. **FuncionarioAssalariado**: O bônus é um valor fixo de R$ 5.000,00.
2. **FuncionarioHorista**: O bônus é calculado como 10% do total anual recebido pelo funcionário.

•⁠  ⁠Classe principal `Main` que cria instâncias de `FuncionarioAssalariado` e `FuncionarioHorista` e exibe o valor do bônus de cada um.

### Exemplo de Execução

1. Criação de uma instância de `FuncionarioAssalariado`:
    - Saída no console: `Bônus do Funcionário Assalariado: R$ 5.000,00`

2. Criação de uma instância de `FuncionarioHorista` com um total anual de R$ 30.000,00:
    - Saída no console: `Bônus do Funcionário Horista: R$ 3.000,00`

## 🔧 Instalação

1. Clone o repositório.
2. Abra o projeto na sua IDE favorita (Eclipse, IntelliJ, etc.).
3. Execute a classe `Main` para visualizar o cálculo do bônus de cada funcionário no console.

## 🛠️ Construído com

•⁠  ⁠Linguagem: `Java`  
•⁠  ⁠IDE: `Eclipse`  

## 📌 Versão

Versão 1.0

**Autor:** Taynara Raquel
