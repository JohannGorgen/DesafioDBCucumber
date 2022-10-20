Feature: Cadastro


  Scenario Outline: Cadastrar um usuário
    Given que eu acesse o site de cadastro
    And acesse o menu lateral
    When eu preencher o formulário com "<nome>", "<sobrenome>", "<email>", "<endereço>", "<universidade>", "<profissão>" , "<genero>" , "<idade>"
    Then o usuário deve ser cadastrado corretamente

    Examples:
      | nome | sobrenome | email                   |   endereço     | universidade | profissão | genero    |  idade  |
      | João | da Silva  | joao_da_silva@gmail.com | rua São Paulo  |     USP      | Médico    | Masculino |   25    |