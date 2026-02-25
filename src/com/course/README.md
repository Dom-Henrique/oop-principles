# 🚀 Projeto: Sistema de Gestão de Plataforma de Cursos Online
# 🎯 Objetivo

Desenvolver uma aplicação backend (console inicialmente) para gerenciar uma plataforma de cursos online, semelhante a:

Udemy

Coursera

O sistema deve permitir controle completo de usuários, cursos, matrículas, progresso e pagamentos.

# 📌 Requisitos Funcionais
## 1️⃣ Gestão de Usuários

O sistema deve permitir:

Cadastro de usuários

Diferentes tipos de usuários com comportamentos distintos

Atualização de dados

Desativação de conta

Listagem de usuários

## Cada usuário deve ter:

Nome

Email (único)

Data de cadastro

Status da conta

Tipo de usuário

## Alguns usuários podem:

Criar cursos

Comprar cursos

Avaliar cursos

Administrar o sistema

## 2️⃣ Gestão de Cursos

O sistema deve permitir:

Criação de cursos

Publicação e despublicação

Atualização de informações

Listagem por categoria

Busca por palavra-chave

## Cada curso deve ter:

Título

Descrição

Preço

Instrutor responsável

Categoria

Status (rascunho, publicado, arquivado)

Avaliações

Lista de alunos matriculados

## 3️⃣ Matrículas

O sistema deve permitir:

Usuário se matricular em curso publicado

Cancelamento de matrícula

Registro de data de matrícula

Controle de progresso do aluno (percentual concluído)

**Regras:**

Não pode se matricular duas vezes no mesmo curso

Não pode se matricular em curso não publicado

Usuário desativado não pode se matricular

## 4️⃣ Sistema de Avaliação

Após concluir o curso, o aluno pode:

Avaliar com nota (1 a 5)

Escrever comentário

Editar avaliação

**O sistema deve:**

Calcular média do curso

Listar avaliações

## 5️⃣ Pagamentos

Simular sistema de pagamento:

Métodos de pagamento diferentes

Registro de transação

Status da transação

Possibilidade de falha no pagamento

**Regras:**

Matrícula só é confirmada após pagamento aprovado

Pagamento pode estar pendente, aprovado ou recusado

## 6️⃣ Relatórios

O sistema deve gerar:

Total de vendas por curso

Receita total da plataforma

Top 5 cursos mais vendidos

Média de avaliações por curso

Ranking de instrutores por receita

# 📌 Requisitos Técnicos (POO Avançado)

O projeto DEVE obrigatoriamente usar:

## ✔ Encapsulamento

Nenhum atributo público

Uso correto de getters/setters

Validações internas

## ✔ Herança

Pelo menos uma hierarquia de tipos com especializações reais

## ✔ Polimorfismo

Métodos sobrescritos

Uso de referências genéricas para comportamentos distintos

## ✔ Interfaces

Contratos para comportamentos variáveis

Exemplo: pagamento, avaliação, relatórios

## ✔ Enums

Devem existir enums para:

Status de conta

Status de curso

Status de pagamento

Tipo de usuário

Categoria do curso

## ✔ Exceptions customizadas

Criar exceções específicas para:

Usuário já cadastrado

Curso não publicado

Pagamento recusado

Avaliação inválida

Matrícula duplicada

## ✔ Collections

Obrigatório usar:

List

Set

Map

Uso adequado de equals() e hashCode()

## ✔ Generics

Aplicar generics onde fizer sentido.

## ✔ Princípios SOLID

O projeto deve respeitar:

SRP (Single Responsibility Principle)

OCP (Open/Closed Principle)

LSP

ISP

DIP

## ✔ Boas práticas obrigatórias

Classes imutáveis quando fizer sentido

Uso de Optional quando aplicável

Separação entre domínio e serviço

Camada de regras de negócio separada

Não misturar regra com entrada de dados

# 📌 Requisitos Extras (nível sênior)

Para elevar o nível:

Implementar Strategy para pagamentos

Implementar Factory para criação de objetos

Implementar Comparator personalizado

Implementar logs de operações

Criar sistema de persistência em memória simulada

Criar testes unitários (JUnit)

# 📌 Restrições

Não usar frameworks (Spring ainda não)

Apenas Java puro

Sem banco de dados real

Interface apenas via console

📈 Nível Esperado Após Concluir

Se você fizer isso corretamente, estará confortável com:

Modelagem orientada a objetos real

Arquitetura de sistemas

Código limpo

Design Patterns

Pensamento de desenvolvedor pleno/sênior