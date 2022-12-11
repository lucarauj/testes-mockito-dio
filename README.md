[![NPM](https://img.shields.io/npm/l/react)](https://github.com/lucarauj/testes-mockito-dio/blob/main/LICENSE)

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

## Aluno

Lucas Araujo

<a href="https://www.linkedin.com/in/lucarauj"><img alt="lucarauj | LinkdeIN" width="40px" src="https://user-images.githubusercontent.com/43545812/144035037-0f415fc7-9f96-4517-a370-ccc6e78a714b.png" /></a>
