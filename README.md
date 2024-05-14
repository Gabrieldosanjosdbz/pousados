# Pousados - Sistema de Gerenciamento de Hotel

Pousados é uma aplicação Java desenvolvida para gerenciamento de um hotel. Este projeto foi realizado como parte de um exercício prático proposto pelo professor de back-end do SENAI. O sistema oferece uma gama de funcionalidades essenciais para a administração eficiente de um hotel, incluindo registro de chegadas, cadastro de clientes, autenticação de usuários e gerenciamento de quartos.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação utilizada para o desenvolvimento da aplicação.
- **NetBeans**: IDE (Integrated Development Environment) utilizada para escrever, compilar e depurar o código.
- **XAMPP**: Conjunto de ferramentas utilizado para criar e gerenciar o banco de dados MySQL utilizado pelo sistema.

## Funcionalidades Principais

- **Registro de Chegadas**: Os funcionários do hotel podem registrar a chegada de hóspedes, atribuindo quartos disponíveis.
- **Cadastro de Clientes**: Permite o cadastro e gerenciamento de informações dos clientes, como nome, contato, e histórico de estadias.
- **Login de Usuário**: Acesso seguro por meio de autenticação de usuário para garantir privacidade e segurança das informações.
- **Gerenciamento de Quartos**: Possibilidade de verificar a disponibilidade dos quartos, indicando se estão ocupados (alugados) ou livres.

## Como Utilizar

1. **Clonar o Repositório**: Clone este repositório em sua máquina local utilizando o seguinte comando:

git clone https://github.com/seu-usuario/pousados.git

3. **Importar Projeto**: Abra o NetBeans IDE e importe o projeto clonado.

4. **Configurar Banco de Dados**: Utilize o XAMPP para criar e configurar o banco de dados MySQL conforme as especificações do sistema.

5. **Executar Aplicação**: Compile e execute o projeto no NetBeans. Certifique-se de configurar corretamente as conexões com o banco de dados no código.

6. **Explorar Funcionalidades**: Utilize a aplicação para explorar as diferentes funcionalidades oferecidas pelo sistema de gerenciamento de hotel.

## Contribuição

Contribuições são bem-vindas! Se você deseja contribuir para o desenvolvimento deste projeto, por favor, siga as orientações abaixo:

1. Fork do Repositório
2. Crie uma branch para sua feature (`git checkout -b feature/MinhaFeature`)
3. Faça commit de suas alterações (`git commit -am 'Adicionando nova funcionalidade'`)
4. Faça push para a branch (`git push origin feature/MinhaFeature`)
5. Crie um novo Pull Request

## Sobre o Projeto

O projeto Pousada - Gerenciamento de Reservas visa atender às necessidades de um gerente de pousada localizada na região Nordeste do Brasil. O sistema foi desenvolvido para gerenciar as reservas de quartos do estabelecimento, oferecendo funcionalidades que abrangem desde a verificação da disponibilidade de quartos até a geração de relatórios diários.

### Funcionalidades Principais

- **Verificação de Disponibilidade de Quartos**: O sistema verifica se existem quartos disponíveis no período desejado pelo cliente.
- **Registro de Reservas**: Ao realizar uma reserva, o sistema solicita os dados do cliente e realiza a reserva dos quartos disponíveis.
- **Status dos Quartos**: Os quartos disponíveis são marcados como "DISPONÍVEIS", enquanto os quartos reservados são marcados como "OCUPADOS".
- **Armazenamento de Informações**: O sistema armazena informações sobre as reservas, como data de entrada, data de saída, valor da diária e número de quartos.
- **Cancelamento Automático de Reservas**: Reservas não pagas até três dias antes da data prevista de entrada são canceladas automaticamente pelo sistema.
- **Relatórios Diários**: O sistema gera relatórios diários, incluindo reservas canceladas, reservas não pagas e reservas a serem efetivadas no dia.
- **Relatório de Reservas por Período**: Possibilidade de gerar um relatório de reservas para um determinado período.

### Requisitos de Interface e Atributos de Qualidade

- **Interface Gráfica**: Deve seguir requisitos de interação homem-máquina, verificados por testes com usuários finais.
- **Disponibilidade**: O sistema deve estar disponível 24 horas por dia.
- **Segurança**: Máxima segurança é garantida, incluindo acesso seguro por nome de usuário e senha, além da proteção de dados sensíveis.
- **Desempenho**: Mensagens de erro devem ser mostradas após a interação do usuário e o sistema deve processar múltiplas reservas simultaneamente.
- **Banco de Dados**: Utiliza MySQL (XAMPP) para armazenar os dados.

### Desenvolvimento

O sistema foi desenvolvido em Java utilizando o framework NetBeans. O código fonte completo está disponível neste repositório e foi devidamente testado. O banco de dados MySQL, populado com pelo menos 20 registros de exemplo, também está incluído.

## Como Contribuir

Contribuições são bem-vindas! Se você deseja contribuir para o desenvolvimento deste projeto, siga as orientações abaixo:

1. Fork do Repositório
2. Crie uma branch para sua feature (`git checkout -b feature/MinhaFeature`)
3. Faça commit de suas alterações (`git commit -am 'Adicionando nova funcionalidade'`)
4. Faça push para a branch (`git push origin feature/MinhaFeature`)
5. Crie um novo Pull Request

Se você tem sugestões de melhorias, novas funcionalidades ou identificou algum problema, sinta-se à vontade para abrir uma nova issue.
