# :cyclone: RMI Bhaskara

Exemplo de **Java RMI** (Remote Method Invocation) feito para a matéria de
Sistemas Distribuídos: o cliente envia os coeficientes `a`, `b` e `c` de uma
equação do 2º grau e o servidor devolve as raízes `x'` e `x''` calculadas pela
fórmula de Bhaskara.

![executando](readme_imgs/executing.gif)

## :package: Como funciona

O projeto tem quatro classes, no pacote `rmibhaskara`:

| Classe | Papel |
| --- | --- |
| `BhaskaraService.java` | **Interface** remota: declara os métodos que o cliente pode chamar (`echo` e `bhaskara`). |
| `BhaskaraServant.java` | **Implementação** desses métodos (é onde a fórmula de Bhaskara roda). |
| `ApplicationServer.java` | **Servidor**: cria o registro RMI em `localhost:5099` e publica o serviço na rota `bhaskara`. |
| `Client.java` | **Cliente**: procura o serviço e chama os métodos. |

## :rocket: Como rodar

Precisa só do **JDK** (8 ou mais novo). Não é necessário um `rmiregistry`
separado — o próprio servidor cria o registro.

### Pela linha de comando

Na pasta `src/`:

```sh
# 1. Compilar
javac rmibhaskara/*.java

# 2. Iniciar o servidor (deixe este terminal aberto)
java rmibhaskara.ApplicationServer

# 3. Em outro terminal, rodar o cliente
java rmibhaskara.Client
```

O servidor mostra os valores recebidos e as raízes; o cliente imprime a
resposta que veio do servidor.

### Pelo NetBeans

O projeto já vem com os arquivos do NetBeans. Abra a pasta como projeto, rode
`ApplicationServer` (Run File) e depois `Client` (Run File).

## :pencil2: Trocar os valores de a, b e c

Os coeficientes estão fixos no `Client.java`:

```java
float a = 2;
float b = -16;
float c = -18;
```

Edite esses valores e rode o cliente de novo. (Uma boa evolução seria lê-los
da linha de comando via `args`.)

## :warning: Observações

- O servidor escuta em `localhost:5099`; para acessar de outra máquina, troque
  `localhost` pelo IP do servidor no `Client.java` e libere a porta.
- Este é um exemplo didático de RMI — não tem tratamento para `a = 0` (que não
  é equação do 2º grau) nem para raízes complexas (quando `b² - 4ac < 0`, o
  resultado vem como `NaN`).
