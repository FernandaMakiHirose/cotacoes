PASSO 1 
- vá no terminal do visual studio, mude o terminal para o 'git bash'
- digite no terminal: ng new nomedoprojeto
- vai perguntar se você quer usar o 'angular routing', pode falar que sim apenas se seu projeto tiver mais de uma página
- vai perguntar qual css você vai usar, clique em 'css'

PASSO 2
- vá no arquivo 'package.json' e configure o 'start', ficou assim:
"start": "ng serve --o" 
(com isso vai subir a aplicação direto no navegador, sem precisar adicionar códigos)

PASSO 3
- entre na pasta do seu projeto e digite: npm start
(vai rodar o projeto)
<<<<<<< HEAD

PASSO 4 
- entender o que é um componente, os componentes ficam nos arquivos 'app.component.css', 'app.component.html' e 'app.component.ts' (define as ações)

PASSO 5 
- vamos criar um módulo, digite no terminal:
ng generate module nomedomodulo
(os módulos servem para do Angular servem para separar a aplicação por domínio e dar uma encapsulada dentro do módulo, então se criar um componente dentro do módulo ele só vai ser visível dentro desse módulo a não ser que ele seja exportado)

PASSO 6 
- vamos importar o módulo, toda vez que um módulo é criado precisamos importar ele no arquivo 'app.module.ts' no 'imports'

PASSO 7
- vamos criar um componente, digite no terminal:
ng generate component dashboard/dashboard-page

PASSO 8 
- adicionando rotas, rotas são a url, vamos adicionar isso no 'app-routing.module.ts' e no arquivo 'app.component.html' adicionar <router-outlet></router-outlet> 

PASSO 9
- no arquivo 'index.html' é necessário adicionar esse valor (ele vai deixar tudo padronizado): 
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/8.0.1/normalize.min.css" integrity="sha512-NhSC1YmyruXifcj/KFRWoC561YpHpc5Jtzgvbuzx5VozKpWvQ+4nXhPdFgmx8xqexRcpAglTj9sIBWINXa8x5w==" crossorigin="anonymous" /> 

PASSO 10
- vamos criar um header, ele não vai ficar no módulo dashboard porque ele faz parte do contexto de layout, no terminal digite:
ng g m nomedomodulo
(criou um módulo), dentro desse módulo criado, criou um arquivo 'layout', é necessário criar componentes dentro dele, no terminal digite:
ng g c shared/layout/header

PASSO 11
- no 'shared.modules.ts' adicionou-se o 'exports' passando o nome do componente header criado 
- no 'app.module.ts', no 'imports' adicionou o 'SharedModule' e no 'app.component.html' adiciomou <app-header></app-header>

PASSO 12
no 'header.component.html' é onde vamos colocar o header onde adicionamos sua imagem e configuramos suas dimensões
no 'header.component.css' vai ficar o css

PASSO 13
criando o stock card, digite no terminal:
ng g c dashboard/stock-card

PASSO 14 
na pasta 'shared' criou a pasta 'models', dentro crie 'stock-models.ts', criamos uma classe 'Stock' e exportamos ela
digite no terminal: ng g service dashboard/dashboard
(foi criado dois arquivos, pode remover o 'dashboard.service.spec.ts'
como o service foi criado é necessário criar métodos para fazer chamadas na API e utilizar algumas dependências do angular no 'dashboard.service.ts')


=======

PASSO 4 
- entender o que é um componente, os componentes ficam nos arquivos 'app.component.css', 'app.component.html' e 'app.component.ts' (define as ações)

PASSO 5 
- vamos criar um módulo, digite no terminal:
ng generate module nomedomodulo
(os módulos servem para do Angular servem para separar a aplicação por domínio e dar uma encapsulada dentro do módulo, então se criar um componente dentro do módulo ele só vai ser visível dentro desse módulo a não ser que ele seja exportado)

PASSO 6 
- vamos importar o módulo, toda vez que um módulo é criado precisamos importar ele no arquivo 'app.module.ts' no 'imports'

PASSO 7
- vamos criar um componente, digite no terminal:
ng generate component pastaquevaigerarocomponent/nomedocomponente

PASSO 8 
- adicionando rotas, rotas são a url, vamos adicionar isso no 'app-routing.module.ts' e no arquivo 'app.component.html' adicionar <router-outlet></router-outlet> 

PASSO 9
- no arquivo 'index.html' é necessário adicionar esse valor (ele vai deixar tudo padronizado): 
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/8.0.1/normalize.min.css" integrity="sha512-NhSC1YmyruXifcj/KFRWoC561YpHpc5Jtzgvbuzx5VozKpWvQ+4nXhPdFgmx8xqexRcpAglTj9sIBWINXa8x5w==" crossorigin="anonymous" /> 

PASSO 10
- vamos criar um header, ele não vai ficar no módulo dashboard porque ele faz parte do contexto de layout, no terminal digite:
ng g m nomedomodulo
(criou um módulo), dentro desse módulo criado, criou um arquivo 'layout', é necessário criar componentes dentro dele, no terminal digite:
ng g c nomedomodulo/layout/nomedocomponente

PASSO 11
- no 'shared.modules.ts' adicionou-se o 'exports' passando o nome do componente header criado 
- no 'app.module.ts', no 'imports' adicionou o 'SharedModule' e no 'app.component.html' adiciomou <app-header></app-header>
>>>>>>> ec8c90df595042eceed77f1f1221e81ef2369ea9


### Links com mais informações sobre CSS

- Guia completo do Flexbox - [https://css-tricks.com/snippets/css/a-guide-to-flexbox/](https://css-tricks.com/snippets/css/a-guide-to-flexbox/)
- Flexbox Froggy - [https://flexboxfroggy.com/](https://flexboxfroggy.com/)
- Conceitos básicos de Flexbox - [https://developer.mozilla.org/pt-BR/docs/Web/CSS/CSS_Flexible_Box_Layout/Basic_Concepts_of_Flexbox](https://developer.mozilla.org/pt-BR/docs/Web/CSS/CSS_Flexible_Box_Layout/Basic_Concepts_of_Flexbox)
- Conceitos básicos do CSS Grid - [https://tableless.com.br/um-pouco-sobre-css-grid-layout/](https://tableless.com.br/um-pouco-sobre-css-grid-layout/)
- Guia completo do CSS Grid - [https://css-tricks.com/snippets/css/complete-guide-grid/](https://css-tricks.com/snippets/css/complete-guide-grid/)
- Unidades de medidas relativas - [https://desenvolvimentoparaweb.com/css/unidades-css-rem-vh-vw-vmin-vmax-ex-ch/](https://desenvolvimentoparaweb.com/css/unidades-css-rem-vh-vw-vmin-vmax-ex-ch/)

## PASSO 4: Integração com a API

### Entendo um pouco melhor sobre Javascript/Typescript

- Entendendo o Hoisting do javascript - [https://medium.com/opensanca/hoisting-em-javascript-9f22b1f78448](https://medium.com/opensanca/hoisting-em-javascript-9f22b1f78448)
- Um pouco sobre Promises e assincronismo - [https://medium.com/trainingcenter/entendendo-promises-de-uma-vez-por-todas-32442ec725c2](https://medium.com/trainingcenter/entendendo-promises-de-uma-vez-por-todas-32442ec725c2)
- Template Strings / Interpolação de Strings - [https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Template_literals](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Template_literals)
- Tipos do Typescript - [https://bognarjunior.wordpress.com/2018/09/16/typescript-tipos-de-dados/](https://bognarjunior.wordpress.com/2018/09/16/typescript-tipos-de-dados/)

### Bindings e diretivas do Angular

- Property Binding - [https://angular.io/guide/property-binding](https://angular.io/guide/property-binding)
- Binding de atributos - [https://angular.io/guide/attribute-binding](https://angular.io/guide/attribute-binding)
- Inputs e Outputs - [https://angular.io/guide/inputs-outputs](https://angular.io/guide/inputs-outputs)
- Diretivas Básicas - [https://angular.io/guide/built-in-directives](https://angular.io/guide/built-in-directives)

### Códigos das sombras e transições CSS

header.component.css:

```css
.header {
  width: 100%;
  padding: 1rem 1.5rem;
	...

  box-shadow: 0 3px 6px rgba(0,0,0,0.16), 0 3px 6px rgba(0,0,0,0.23);
}
```

stock-card.component:

```css
.stock-card-container {
  width: 21.375rem;
  height: 13.8125rem;
  background-color: var(--secondary-color);
	...

  box-shadow: 0 1px 3px rgba(0,0,0,0.12), 0 1px 2px rgba(0,0,0,0.24);
  transition: all 0.3s cubic-bezier(.25,.8,.25,1);
}

.stock-card-container:hover {
  box-shadow: 0 14px 28px rgba(0,0,0,0.25), 0 10px 10px rgba(0,0,0,0.22);
}
```

## Aula 6: Publicando o Projeto no GitHub Pages

### Links

- GitHub - [https://github.com/](https://github.com/)
- angular-cli-ghpages - [https://github.com/angular-schule/angular-cli-ghpages/#readme](https://github.com/angular-schule/angular-cli-ghpages/#readme)

### Comando do Angular CLI para realizar o Deploy

```json
"scripts": {
	....
	"deploy":  "ng deploy --base-href=https://<seu-usuario>.github.io/<repositorio>/",
	...
}
```

Será necessário substituir o `<seu-usuário>` pelo seu nome de usuário do Github e o `<repositorio>` pelo nome do repositório criado anteriormente.
