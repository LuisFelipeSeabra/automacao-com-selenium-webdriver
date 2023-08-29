# Bem-vindo ao desafio

<div align="center">
  <img src="https://www.learntek.org/blog/wp-content/uploads/2018/05/Selenium-3-webdriver.jpg" width="300px"/>
</div>


## Documentação útil

1. [Projeto Automação WEB](https://github.com/LuisFelipeSeabra/prova_sicredi/tree/master/groceryCrudProject)



## Projeto Automação WEB
Foi utilizado o WebSite grocerycrud para criação de testes automatizados e2e.
```
Linguagem: Java
Framework para automação: Selenium Webdriver.
Padrão de projeto: Page Objects
```

#### Desafio:
```
- Observação:
O script deve executar no browser Google Chrome

- Passos:

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


