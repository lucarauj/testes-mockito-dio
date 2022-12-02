<h1 align="center"> Desenvolvendo testes utilizando Mockito </h1>

### Adicionando dependências Mockito no projeto (`pom.xml`):

```xml
<dependency>
    <groupId>org.mockito</groupId>
    <artifactId>mockito-core</artifactId>
    <version>4.8.0</version>
    <scope>test</scope>
</dependency>
```
```xml
<dependency>
    <groupId>org.mockito</groupId>
    <artifactId>mockito-junit-jupiter</artifactId>
    <version>4.8.0</version>
    <scope>test</scope>
</dependency>
```

### Dependência para métodos static

```xml
<dependency>
    <groupId>org.mockito</groupId>
    <artifactId>mockito-inline</artifactId> 
    <version>4.8.0</version>
    <scope>test</scope>
</dependency>
```


### Anotações básicas utilizadas em uma classe Test:
	- @ExtendWith(MockitoExtension.class)
	- @Mock: "mocando" um objeto
	- @Test: anotação que define um método teste

### Outras anotações utilizadas:
	- @InjectMocks: usada para criar e injetar instâncias simuladas
	- @Spy: "espiando" um objeto
	- @Captor: captura argumentos de um método

