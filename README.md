# Consultório
Projeto de exemplo simples usando spring boot 2 (2.2.1.RELEASE) + graphQL (5.6.1 - tools)

Para acessar os exemplos do crud em graphQL basta colar o seguinte link no seu nagevador 
[http://localhost:8080/graphiql](http://localhost:8080/graphiql)
# 

#### Exemplo da consulta de todos os pacientes 

```
query{
  consultarTodosPacientes{
    id
    nome
    endereco
    telefone
    dataNasimento
    profissao
  }
}
```

#### Exemplo da consulta de único paciente

```
query {
  consultarPacientePorId(id: 1) {
    id
    nome
    endereco
    telefone
    dataNasimento
    profissao
  }
}

```

#### Exemplo da inclusão de um paciente
```
mutation($pacienteDto: PacienteDTO!) {        
  incluirPaciente(pacienteDTO: $pacienteDto)  
}		

Esquema do objeto.

{
  "pacienteDto": {
    "nome": "Fulana de Tal",
    "endereco": "Rua 1100",
    "telefone": "89997897",
    "dataNasimento": "27-01-2001",
    "profissao": "Atendente"
  }
}												  
```
#### Exemplo da exclusão de um paciente

```
mutation{
  excluirPaciente(id: 1)
}
```

