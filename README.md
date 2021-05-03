# Bem-vindo ao desafio

<div align="center">
  <img src="https://www.sicredi.com.br/static/assets/novo/logo-cor.svg" width="300px"/>
</div>


## Documentação útil

1. [Projeto Automação WEB](https://github.com/LuisFelipeSeabra/prova_sicredi/tree/master/groceryCrudProject)
2. [Projeto Automação API](https://github.com/LuisFelipeSeabra/prova_sicredi/tree/master/ViaCepAPI)


## Projeto Automação WEB
Foi utilizado o WebSite grocerycrud para criação de testes automatizados e2e.
```
Linguagem: Java
Framework para automação: Selenium Webdriver.
Padrão de projeto: Page Objects
```

#### Desafio:
```
Observação:
O script deve executar no browser Google Chrome

Passos:

1.	Acessar a página https://www.grocerycrud.com/demo/bootstrap_theme
2.	Mudar o valor da combo Select version para “Bootstrap V4 Theme”
3.	Clicar no botão Add Customer

4.	Preencher os campos do formulário com as seguintes informações:

Name: Teste Sicredi
Last name: Teste
ContactFirstName: seu nome
Phone: 51 9999-9999
AddressLine1: Av Assis Brasil, 3970
AddressLine2: Torre D
City: Porto Alegre
State: RS
PostalCode: 91000-000
Country: Brasil
from Employeer: Fixter
CreditLimit: 200

5.	Clicar no botão Save
6.	Validar a mensagem “Your data has been successfully stored into the database. Edit Customer or Go back to list” através de uma asserção
7.	Fechar o browser
```



#### Estruturação do Projeto:
```
├── groceryCrudProject                                # Projeto                                                                                          
    ├── src/main/java                                 #                                                                                                         
        ├── br.df.lseabra.core                        # Pacote de Core                                                                                        
            ├── BasePage.java                         # Classe que será extendida pelas classes de page/ vários métodos que podem ser utilizados
            ├── BaseTest.java                         # classe que será extendida pelas classes de teste/ método de screenshot
            ├── DriverFactory.java                    # Classe contendo propriedades do ChromeDriver
            ├── Propriedades.java                     # Classe de propriedades
            ├── Steps.java                            # Classe java criada para criação de Jornadas(Métodos com diversos outros métodos das pages)
        ├── br.df.lseabra.page                        # Pacote de Pages
        ├── br.df.lseabra.test                        # Pacote de Testes
        ├── br.df.lseabra.suit                        # Pacote de Suites
            ├── SuiteTest.java                        # Suite de teste 
```

#### Executar o Teste
Executar pela IDE de sua preferência os arquivos: 
```
SuiteTest.java                                     # Suite de teste para execução dos testes
```

#### Execuções das Suites:
![image](https://user-images.githubusercontent.com/49051123/116837768-217fb000-aba2-11eb-847b-e5150b60305e.png)


#### Tecnologia

Tecnologias utilizadas no projeto:
  * JRE 1.8.0_281
  * Maven
  * Selenium-java 3.4.0
  * Eclipse


## Projeto Automação API
Foi Desenvolvida uma automação de testes para a API utilizando Rest-Assured.
* URL utilizada: https://viacep.com.br/ws/91060900/json/ 

#### Cenários:
```
* Cenário: Consulta CEP valido
Dado que o usuário inseri um CEP válido
Quando o serviço é consultado
Então é retornado o CEP, logradouro, complemento, bairro, localidade, uf e ibge.

* Cenário: Consulta CEP inexistente
Dado que o usuário inseri um CEP que não exista na base dos Correios
Quando o serviço é consultado 
Então é retornada um atributo erro

* Cenário: Consulta CEP com formato inválido 
Dado que o usuário inseri um CEP com formato inválido
Quando o serviço é consultado 
Então é retornado uma mensagem de erro

* Extras:
1)	Criar um cenário que verifique o retorno do serviço abaixo:
URL: https://viacep.com.br/ws/RS/Gravatai/Barroso/json/
```


#### Estruturação do Projeto:
```
├── ViaCepAPI                                         # Projeto                                                                                          
    ├── src/main/java                                 #                                                                                                         
        ├── br.df.lseabra.core                        # Pacote de Core                                                                                        
            ├── BaseTest.java                         # classe que será extendida pelas classes de teste
            ├── Constantes.java                       # Interface contendo porta, Url e Content type
        ├── br.df.lseabra.test                        # Pacote de Testes
            ├── RConsultasTest.java                   #Classe com testes com os cenários + Extra

```

#### Executar o Teste
Executar pela IDE de sua preferência os arquivos: 
```
ConsultasTest.java                                     # Suite de teste para quando há login de cliente ao entrar no site
```

#### Execução dos testes:
![image](https://user-images.githubusercontent.com/49051123/116837944-d619d180-aba2-11eb-8859-4ab02126e08d.png)


#### Tecnologia:

Tecnologias utilizadas no projeto:
  * JRE 1.8.0_281
  * Maven
  * io.rest-assured 4.0.0 
  * groovy 3.0.5
  * Eclipse

