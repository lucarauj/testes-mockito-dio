## Desenvolvendo testes utilizando Mockito

--> Adicionando dependências Mockito no projeto (pom.xml):

<dependency>
    <groupId>org.mockito</groupId>
    <artifactId>mockito-core</artifactId>
    <version>4.8.0</version>
    <scope>test</scope>
</dependency>

-> Para métodos static
<dependency>
    <groupId>org.mockito</groupId>
    <artifactId>mockito-inline</artifactId> 
    <version>4.8.0</version>
    <scope>test</scope>
</dependency>


<dependency>
    <groupId>org.mockito</groupId>
    <artifactId>mockito-junit-jupiter</artifactId>
    <version>4.8.0</version>
    <scope>test</scope>
</dependency>

--> Criando uma classe Test:
	- @ExtendWith(MockitoExtension.class)
	- @Mock: "mocando" um objeto
	- @Test

--> Outras anotações utilizadas:
	- @InjectMocks
	- @Spy: "espiando" um objeto
	- @Captor: captura argumentos de um método

