# EngenhariaSoftwareIII.2
## Unit test

### O que é Teste de Unitário?
O teste unitário consiste em verificar o comportamento das menores unidades em sua aplicação.

Tecnicamente, isso seria uma classe ou até mesmo um método de classe em línguas orientadas a objetos, e seria um procedimento ou função em línguas processuais e funcionais.

### O que Faz um Teste Unitário um Teste Unitário?
Michael Feathers (autor de “Working Effectively with Legacy Code”) colocou a distinção no nível do processo e do sistema.

Os testes unitários precisam funcionar isoladamente porque precisam funcionar rapidamente.

Todo o conjunto de testes unitários de uma aplicação precisa funcionar em minutos, de preferência em segundos. Você verá o porquê mais tarde.

É por isso que os testes unitários não podem utilizar nenhum processo ou sistema externo. Nenhuma operação de E/S (input/output) de qualquer tipo (banco de dados, arquivo, console, rede) exceto o registro de falhas nos testes e talvez a leitura da configuração padrão de alternância de recursos no início de uma execução de teste.

### Quais São os Benefícios dos Testes Unitários?

-Você economiza muito tempo nos testes de regressão.

-Você recebe um alerta sempre que, inadvertidamente, quebra um comportamento existente. Permitindo que você o enfrente imediatamente enquanto ainda está totalmente imerso no que você está trabalhando. Significa menos bugs escapando.

-Menos bugs escapando significa que você tem mais tempo para desenvolver valor.

-Trabalhando sem medo de quebrar o código existente sem saber, você possui mais recursos cognitivos preciosos. Significa que você será mais criativo e inovador, e capaz de criar soluções melhores.

-Você recebe documentação viva, respirando, nunca desatualizada – pelo menos quando você dá a cada teste unitário um nome significativo (mais sobre isso depois).
-Uma documentação sempre atualizada permite que você acelere os novos contratados.

-Trabalhando sem medo de quebrar o código existente sem saber, novos membros da equipe se tornam produtivos mais rapidamente.

-Menos bugs também significa que você reduzirá a carga da equipe de suporte e os liberará para se concentrar no sucesso do cliente ao invés de controlar os danos.


______________________________________________________________________________________________________________________________________________________________________________

## TDD

TDD é a sigla para Test Driven Development, que em português significa Desenvolvimento Orientado por Testes. Esse é um método de desenvolvimento muito comum atualmente.

Ele se baseia na aplicação de pequenos ciclos de repetições. Em cada um deles, um teste é aplicado. 

O objetivo é desenvolver uma função que permita que esse teste tenha um resultado positivo. Ou seja, a função está pronta para ser implementada. 

### COMO É UM TDD?
Um TDD é aplicado da seguinte forma. Primeiramente, os desenvolvedores criam um teste que irá falhar de qualquer forma. Afinal de contas, ainda não existe um recurso para ele.

Em seguida o time desenvolve a função que deve fazer o teste passar e então reaplicar ele. Se o resultado é positivo, os profissionais implantam o novo recurso no código, e então partem para o desenvolvimento de um novo teste.

Esse ciclo é repetido até o final do projeto, quando o programa ou aplicativo é finalizado. 

### QUAIS AS VANTAGENS DE USAR O TDD NO DIA A DIA DE DESENVOLVIMENTO? 
-O TDD é uma excelente alternativa para quem atua de forma autônoma, mas também para quem trabalha em equipes de desenvolvimento. Isso porque, você consegue ter um feedback rápido. 

-Se você fez a função mas não obteve um resultado positivo no teste, ela pode ser modificada logo em seguida. Mas além disso, esse método também traz uma série de outras vantagens, tais como: 

-é possível focar em problemas específicos de desenvolvimento; 

-Crie códigos mais limpos e simples, e que também são fáceis de refatorar;

-Mais facilidade para corrigir bugs por meio dos ciclos de desenvolvimento;

-Flexibilidade no código; 

-Mais produtividade;

-Foco na resolução de problemas; 

-Índice menor de retrabalho;

-Por meio do TDD, você poderá se tornar mais produtivo e criar códigos mais limpos para o cliente. 
