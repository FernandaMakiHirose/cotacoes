# Bootcamp Santander: Java + Angular

1.1 Instalação do Ambiente Java
1.2 Criando o Projeto Base Java
1.3 Criando sua Primeira API
1.4 Aplicando Validações de Dados
1.5 Configurando o Banco de Dados
1.6 Criando a Camada Service e Exceptions Handlers
1.7 Publicando nossa API na Nuvem

URL da API no Heroku: https://santander-java.herokuapp.com/bootcamp/swagger-ui.html

- PASSO 1 
o arquivo 'application.properties' foi renomeado para 'application.yml'

- PASSO 2
configurar o server no arquivo 'application.yml' 

- PASSO 3
colocar a versão do programa no arquivo 'pom.xml'
é o local onde indica qual é a versão do programa

- PASSO 4
criando a primeira camada, criação da pasta 'controller', dentro dele criou-se uma java class 'StockController'
adicionando annotations

- PASSO 5
criando a pasta 'model', criando uma subpasta 'dto', criando um java class 'StockDTO' 
dentro dessa java class adicionou as ações do banco de dados, com objetivo de ter uma interação com o controller

PASSO 6 
na arquivo 'StockController' adicionou os endpoints, como no passo 6 pegamos os dados do banco de dados, é possível criá-los

PASSO 7 
no arquivo 'pom.xml' adicionamos uma dependência que vai impossibilitar acessar as classes que existem nessa bibliotecas

PASSO 8
no arquivo 'BootcampApplication' adicionou-se um método para documentar a API

PASSO 9
vamos validar os dados, é importante para que o usuário passe os dados corretos, no arquivo 'pom.xml' adicione uma dependência para validação
no arquivo 'StockDTO' adicione as validações
no arquivo 'StockController'foi necessário adicionar o @Valid para validar os dados no 'put' e no 'post'