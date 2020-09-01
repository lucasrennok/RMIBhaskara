# :cyclone: RMI Bhaskara
> Lucas Rennó Kallás

This code was made to Distributed Systems Subject.

![executing](/readme_imgs/executing.gif)

The RMI was made in Java with **NetBeans 8.2**. To test it I created a method that receives variables a, b and c from Client and use Bhaskara Formula to get the results x' and x'' and send them in a ArrayList as a response.

## :star: Code

#### :anger: ApplicationServer.java
This is the server, it will wait for a request and send a response based on methods implemented at BhaskaraServant.java

![Server](/readme_imgs/Server.PNG)

#### :anger: BhaskaraServant.java
There are the implemented functions declared at BhaskaraService.java

Bhaskara method is implemented on it:

![Bhaskara](/readme_imgs/BhaskaraMethod.PNG)

##### :exclamation: Implemented Methods

1. echo(String input), this function receives input and returns "From server: " + input
2. bhaskara(float a, float b, float c), this function receives a, b and c and returns an ArrayList that contains x' and x'' found with Bhaskara Formula

**:question: Bhaskara Formula:**

![Bhaskara Formula](https://images.educamaisbrasil.com.br/content/banco_de_imagens/guia-de-estudo/D/formula-bhaskara-matematica.jpg)

#### :anger: BhaskaraService.java
This is the interface that shows to the Client the methods which it can call. And the methods that will be implemented at BhaskaraServant.java.

![Service](/readme_imgs/BhaskaraService.PNG)

#### :anger: Client.java
This is the client, it can call the functions that are in BhaskaraService.java and the server will return a response.

![Client](/readme_imgs/Client.PNG)

### :punch: Want to use it?

- Make a fork
- I recommend to download NetBeans to use :eyes:

Enjoy it, :smiley: