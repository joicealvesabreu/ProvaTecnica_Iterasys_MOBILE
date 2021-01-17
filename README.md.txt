								Prova Tecnica Iterasys

			Automação MOBILE  - Ferramentas APPIUM/Cucumber/Selenuium/Maven - Linguagem JAVA
								Metodo BDD

			------------------------------Estrutura do Projeto--------------------------------
Pasta: br.com.provaInterasys.mobile

Pasta src/main/java

Pacote: br.com.provaInterasys.mobile.screenFactory

driverScreen -> Classe que gerencia o servidor appium.
screenPageFactory-> Classe utilizada para armazenar elementos e ações da página principal da aplicação Mobile.

Pacote: br.com.provaInterasys.mobile.utility

printcreen ->Classe utilizada para tirar print do teste.

Pasta src/test/java

Pacote: br.com.provaInterasys.mobile.run

testRunner-> Classe utilizada para rodar o teste.

Pacote: br.com.provaInterasys.mobile.screenStep

hooks -> Classe utilizada para implementar os hooks After e Before do cucumber, para rodarem antes e depois de cada teste.

testeScreen -> Classe utilizada para implementar os passos a passo do teste utilizando a escrita gerkin

Pasta src/test/resources

Pasta: feature

Test.feature > Feature cucumber com a história de cenarios de teste relacionado ao teste.



