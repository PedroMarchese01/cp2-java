# Sistema de Logística para Entregas

O Sistema de Logística para Entregas é uma aplicação desenvolvida em Java com foco em Programação Orientada a Objetos (POO), simulando o funcionamento de uma operação logística de um e-commerce. O sistema permite cadastro de clientes e entregadores, autenticação de usuários, criação de pedidos, gerenciamento de entregas e atualização de status das entregas.

---

# Tecnologias Utilizadas

<div align="left">
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" width="40px" height="40" alt="java logo" />
  <img width="12" />
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/github/github-original.svg" width="40px" height="40" alt="github logo" />
  <img width="12" />
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/git/git-original.svg" width="40px" height="40" alt="git logo" />
  <img width="12" />
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/intellij/intellij-original.svg" width="40px" height="40" alt="intellij logo" />
</div>

---

# Explicação do Sistema

O sistema simula uma empresa de logística de entregas inspirada em marketplaces e plataformas de e-commerce.

O usuário pode:

- Cadastrar clientes
- Cadastrar entregadores
- Realizar login
- Criar pedidos
- Visualizar pedidos
- Realizar entregas
- Atualizar status das entregas

O sistema possui diferentes tipos de entregadores, como entregador de moto e entregador de carro, cada um com comportamentos específicos.

---

# Decisões de Modelagem

Durante o desenvolvimento do projeto, foram aplicados conceitos de Programação Orientada a Objetos para garantir organização, reutilização de código e facilidade de manutenção.

## Herança

Foi criada uma classe abstrata chamada `Entregador`, responsável por reunir atributos e comportamentos comuns entre todos os entregadores.

As classes:
- `EntregadorMoto`
- `EntregadorCarro`

herdam da classe `Entregador`, reutilizando seus métodos e atributos.

---

## Interfaces

Foram utilizadas interfaces para representar comportamentos específicos do sistema.

Interfaces criadas:
- `Autenticavel`
- `RealizaEntrega`
- `CriadorDePedido`

Essas interfaces permitiram desacoplamento entre funcionalidades e maior flexibilidade na modelagem.

---

## Classe Abstrata

A classe `Entregador` foi definida como abstrata, pois não faz sentido existir um entregador genérico no sistema.

Ela foi criada para servir como base para os diferentes tipos de entregadores, obrigando as subclasses a implementarem comportamentos específicos.

---

# Como Executar o Projeto

1. Clonar o repositório:

```bash
git clone https://github.com/PedroMarchese01/cp2-java
```

2. Abrir o projeto na IDE IntelliJ IDEA.

3. Executar a classe `Main`.

4. Utilizar o menu interativo via terminal para navegar pelas funcionalidades do sistema.

---

# Link do Repositório

[Repositorio GitHub](https://github.com/PedroMarchese01/cp2-java)

---

# Diagrama de Classes UML

![Diagrama UML](./images/uml.png)

---

# Perguntas Discursivas

## 1. Herança

A herança foi utilizada para representar os diferentes tipos de entregadores existentes no sistema. Foi criada uma classe abstrata chamada `Entregador`, contendo atributos e métodos comuns entre todos os entregadores, como nome, email, senha e funcionalidades de autenticação.

As classes `EntregadorMoto` e `EntregadorCarro` herdam da classe `Entregador`, reutilizando suas características e implementando comportamentos específicos através do método `tipoDeEntrega()`.

A herança resolveu o problema de repetição de código e facilitou a organização da modelagem do sistema.

---

## 2. Interfaces

As interfaces criadas no sistema foram:
- `Autenticavel`
- `RealizaEntrega`
- `CriadorDePedido`

A interface `Autenticavel` foi utilizada para padronizar funcionalidades relacionadas ao login e logout dos usuários.

A interface `RealizaEntrega` foi utilizada para representar ações relacionadas à realização de entregas.

A interface `CriadorDePedido` foi criada para representar funcionalidades relacionadas à criação e visualização de pedidos.

O uso de interfaces trouxe maior desacoplamento ao sistema, além de permitir maior flexibilidade e reutilização de comportamentos.

---

## 3. Classe Abstrata

A classe abstrata `Entregador` possui o papel de servir como base para os diferentes tipos de entregadores do sistema.

Ela concentra atributos e métodos comuns, evitando repetição de código e facilitando manutenção e escalabilidade.

Essa classe não poderia ser uma classe comum porque não faz sentido existir um entregador genérico no sistema. Apenas tipos específicos, como entregador de moto ou carro, devem ser instanciados.

Além disso, a classe abstrata permite obrigar as subclasses a implementarem métodos específicos, como `tipoDeEntrega()`.

---

# Autores

- Augusto Valerio - RM:562185  
  GitHub: https://github.com/Augusto-Valerio

- Jonas Esteves França - RM:564143  
  GitHub: https://github.com/Jonas-Franca

- Mariana Silva Oliveira - RM:564241  
  GitHub: https://github.com/Marirsil

- Pedro Marchese - RM:563339  
  GitHub: https://github.com/PedroMarchese01

- Vitor Rodrigues Tigre - RM:561746  
  GitHub: https://github.com/VitorTigre
