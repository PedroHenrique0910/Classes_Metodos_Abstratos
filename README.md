# Classes_Metodos_Abstratos

Este programa em Java é um sistema simples para calcular impostos com base nos dados de contribuintes individuais e empresas. Aqui está um resumo do que o programa faz:

O programa começa importando as classes necessárias e configurando a localização padrão para os valores numéricos (usando ponto como separador decimal).

Em seguida, ele cria uma lista vazia chamada list para armazenar os contribuintes.

O usuário é solicitado a inserir o número de contribuintes que deseja calcular os impostos.

Um loop for é usado para iterar sobre o número de contribuintes especificado pelo usuário.

Para cada contribuinte, o programa solicita informações como nome, renda anual e, dependendo se é uma pessoa física (individual) ou uma empresa, 
pode solicitar também despesas de saúde (para pessoas físicas) ou o número de funcionários (para empresas).

Com base nas informações coletadas, o programa cria objetos Individual ou Company, dependendo da escolha do usuário, e adiciona esses objetos à lista list.

Após coletar todas as informações dos contribuintes, o programa calcula e exibe os impostos individuais pagos por cada contribuinte e a soma total de impostos pagos.

O programa encerra, fechando o scanner.

Em resumo, o programa permite ao usuário calcular os impostos para um grupo de contribuintes individuais e empresas, 
levando em consideração informações específicas de cada tipo de contribuinte.
