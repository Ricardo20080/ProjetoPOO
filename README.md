# 📚 Sistema de Biblioteca

## 👥 Projeto em Dupla

**Integrantes:**

* Ricardo
* Max

---

## 📌 Descrição

Este projeto consiste no desenvolvimento de um **Sistema de Gerenciamento de Biblioteca** em Java.
O sistema permite cadastrar materiais, usuários e controlar empréstimos através de um menu interativo no terminal.

O objetivo principal é aplicar conceitos fundamentais de **Programação Orientada a Objetos (POO)**, como:

* Encapsulamento
* Herança
* Polimorfismo
* Uso de construtores
* Manipulação de objetos

---

## 🧱 Estrutura do Projeto

O sistema é composto pelas seguintes classes:

* **Material** → Classe base para todos os materiais
* **Livro** → Subclasse de Material
* **Revista** → Subclasse de Material
* **TCC** → Subclasse de Material
* **Usuario** → Representa os usuários da biblioteca
* **Emprestimo** → Controla os empréstimos realizados
* **Main** → Classe principal com o menu do sistema

---

## ⚙️ Funcionalidades

O sistema possui um menu com as seguintes opções:

1. 📖 Cadastrar material
2. 👤 Cadastrar usuário
3. 🔄 Realizar empréstimo
4. 📚 Listar materiais
5. 📋 Listar empréstimos
6. ❌ Sair

---

## 🧠 Conceitos Aplicados

### 🔹 Herança

As classes `Livro`, `Revista` e `TCC` herdam da classe `Material`, reutilizando atributos e comportamentos.

### 🔹 Polimorfismo

Métodos como:

* `exibirInformacoes()`
* `prazoEmprestimo()`

São implementados de forma diferente em cada tipo de material.

### 🔹 Encapsulamento

Os atributos das classes são privados e acessados por meio de **getters e setters**.

### 🔹 Construtores

Todas as classes possuem construtores para inicializar os objetos.

---

## 💻 Tecnologias Utilizadas

* Java
* Programação Orientada a Objetos (POO)

---

## ▶️ Como Executar

1. Compile os arquivos:

```bash
javac *.java
```

2. Execute o programa:

```bash
java Main
```

---

## 📌 Observações

* O sistema é executado via terminal.
* Os dados são armazenados apenas durante a execução (não há banco de dados).
* Ideal para fins educacionais e prática de POO.

---

## 🚀 Possíveis Melhorias

* Persistência de dados (arquivos ou banco de dados)
* Interface gráfica
* Sistema de login
* Controle de devolução de materiais

---

## 📄 Licença

Projeto desenvolvido para fins acadêmicos.
