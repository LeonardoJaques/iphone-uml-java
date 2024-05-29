## Simulador de iPhone em Java

Este projeto implementa um simulador simplificado de um iPhone em Java, demonstrando a utilização de Programação Orientada a Objetos (POO) e a organização do código em pacotes.

### Funcionalidades

O simulador inclui as seguintes funcionalidades básicas:

* **Reprodutor de Música:**
    * Reproduzir, pausar, parar música
    * Selecionar música
    * Ajustar volume
* **Telefone:**
    * Fazer e receber chamadas
    * Encerrar chamada
    * Enviar e receber SMS
* **Comunicador de Internet:**
    * Navegar na web
    * Enviar e receber e-mails
    * Visualizar mapas

### Estrutura do Projeto

O projeto está organizado em pacotes para melhor modularidade e manutenção:

* `com.yourapp.iphone`: Contém a classe principal `iPhone` que representa o dispositivo.
* `com.yourapp.iphone.components`: Contém as classes que representam os componentes do iPhone (`MusicPlayer`, `Phone`, `InternetCommunicator`).

### Pré-requisitos

* Java Development Kit (JDK) instalado
* Ambiente de desenvolvimento Java (IDE) como IntelliJ IDEA, Eclipse ou Visual Studio Code

### Como Executar

1. Clone este repositório:

   ```bash
   git clone https://github.com/<seu-usuario>/iphone-simulator.git
   ```

2. Compile o código:

   ```bash
   javac com/yourapp/iphone/*.java com/yourapp/iphone/components/*.java
   ```

3. Execute a classe principal:

   ```bash
   java -cp . com.yourapp.iphone.iPhone
   ```

### Observações

* Este é um simulador básico e não possui interface gráfica. As ações são representadas por mensagens no console.
* O projeto pode ser expandido para incluir mais funcionalidades e componentes do iPhone.
* A estrutura de pacotes pode ser personalizada de acordo com as preferências do desenvolvedor.

---

**Disclaimer:** Este projeto é apenas um exercício de programação e não tem nenhuma afiliação com a Apple Inc. ou o produto iPhone.

## Diagrama de Classes UML

## Diagrama de Classes UML
![Diagrama de classes UML do iPhone](https://www.plantuml.com/plantuml/png/NSj12i8m48NXVK-HfU8b2kAo81HqFKqV6fqqfPDf4V7k1go5P7RpyVvQ8arHFLUMISIuypqCCE_Af3kOaUdLg3Yxs_-5L92Jn30M0eQDRHXk6r7_K8cNmEgHS5LFJno9UPjDi71pRXZwx9S4RTEMpOzMwwQm2AxeikhaoN7PvJWxB0sDak1JrQbHpry0)
