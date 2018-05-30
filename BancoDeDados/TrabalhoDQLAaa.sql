-- 1. Mostre todos os registros completos da tabela Empregados.
SELECT * FROM empregados;

-- 2. Mostre o Nome, Sobrenome e data de contratação de todos os empregados.
SELECT nome, sobrenome, datadecontratacao FROM empregados;

-- 3. Listar o nome completo de todos os empregados (juntar o nome e sobrenome).
SELECT nome || ' ' || sobrenome FROM empregados;

-- 4. Mostre o nome dos fornecedores que operam na Alemanha.
SELECT nomedocontato FROM fornecedores WHERE UPPER(pais) = 'ALEMANHA';

-- 5. Mostrar os fornecedores que tenham Homepage.
SELECT nomedocontato FROM fornecedores WHERE homepage IS NOT NULL;

-- 6. Selecione o nome da empresa, do contato e do cargo renomeando os atributos de retorno da consulta.
SELECT nomedaempresa AS "Nome da Empresa", nomedocontato AS "Nome", cargodocontato AS "Cargo" FROM fornecedores;

-- 7. Listar todos os empregados que foram contratados no ano de 1993.
SELECT * FROM empregados WHERE datadecontratacao LIKE '%93';

-- 8. Listar os nomes funcionários e de seus cargos por ordem descendente.
SELECT nome, cargo FROM empregados ORDER BY nome DESC, cargo DESC;

-- 9. Quais os fornecedores que fornecem os produtos com o código 7 ou 10?
SELECT * FROM fornecedores WHERE codigodofornecedor IN 
(SELECT codigodofornecedor FROM produtos WHERE codigodoproduto = 7 OR codigodoproduto = 10);

-- 10. Qual o nome e preço unitário dos produtos cujo preço é maior que 10 e menor que 50?
SELECT nomedoproduto, precounitario FROM produtos WHERE precounitario BETWEEN 10 AND 50;


                        -- Ate Aki Ja foi tudo passado para o trabalho
                        
                        
-- 11. Quais os Produtos que pertencem à categoria 1 ou 3 (utilizando o operador IN)?
SELECT * FROM produtos WHERE codigodacategoria IN 1 OR codigodacategoria IN 3;

-- 12. Quais os empregados cujo nome tem a seqüência de caracteres “ne”.
SELECT nome FROM empregados WHERE nome LIKE '%ne%';

-- 13. Listar o Produto e o Preço Unitário. Na coluna seguinte, 
--     deverá mostrar o valor mínimo para o produto (desconto de 10%).
SELECT nomedoproduto, precounitario, (precounitario * 0.9) AS "Desconto" FROM produtos;

-- 14. Qual o preço Mínimo, Máximo e Médio de encomenda de cada produto.
SELECT MIN(precounitario), MAX(precounitario), ROUND(AVG(precounitario), 2) FROM produtos ;  

-- 15. Listar o número de empregados por cargo.
SELECT cargo, COUNT(codigodofuncionario) FROM empregados GROUP BY cargo;


                        -- Ate Aki Ja foi tudo passado para o trabalho
                        
                        
-- 16. Qual o total de unidades de cada produto que foram encomendadas.
SELECT p.nomedoproduto, SUM(d.quantidade) AS Total FROM produtos p 
INNER JOIN detalhes_pedido d ON d.codigodoproduto = p.codigodoproduto
GROUP BY p.nomedoproduto;

-- 17. Quais os fornecedores que fornecem produtos da categoria “condimentos”?
SELECT f.nomedocontato FROM fornecedores f
INNER JOIN produtos p ON f.codigodofornecedor = p.codigodofornecedor
INNER JOIN categorias c ON p.codigodacategoria = c.codigodacategoria
WHERE UPPER(c.nomedacategoria) = 'CONDIMENTOS' GROUP BY f.nomedocontato;

-- 18. Listar todos os clientes ao qual o empregado Andrew já fez encomendas.
SELECT nomedocontato FROM clientes c
INNER JOIN pedidos p ON p.codigodocliente = c.codigodocliente
INNER JOIN empregados e ON e.codigodofuncionario = p.codigodofuncionario
WHERE UPPER(e.nome) = 'ANDREW' GROUP BY c.nomedocontato;

-- 19. Listar a quantidade e os nomes dos produtos vendidos.
SELECT p.nomedoproduto, SUM(d.quantidade) AS Total FROM produtos p 
INNER JOIN detalhes_pedido d ON d.codigodoproduto = p.codigodoproduto
GROUP BY p.nomedoproduto;

-- 20. Qual o Preço Unitário do produto mais barato de cada categoria.
SELECT ct.nomedacategoria, MIN(pr.precounitario) FROM produtos pr
INNER JOIN categorias ct ON ct.codigodacategoria = pr.codigodacategoria
GROUP BY ct.nomedacategoria;


                        -- Ate Aki Ja foi tudo passado para o trabalho
                        
    
-- Comando INSERT
-- 1. Insira o Empregado com os seguintes dados na tabela empregados (Nome: Paulo;
-- Sobrenome: Costa; Cargo: Vendedor; Titulo: Engenheiro; Data Nasc: 14/04/1979; Data
-- Contratação: Data atual).
INSERT INTO empregados (codigodofuncionario, nome, sobrenome, cargo, datadenascimento, datadecontratacao) VALUES 
(10, 'Paulo', 'Costa', 'Vendedor', '14/04/1979', '23/05/2018');

-- 2. Insira o empregado do exercício anterior sem definir a seqüência dos atributos de
-- inserção.
INSERT INTO empregados VALUES 
  (11, 'Costa', 'Paulo', 'Vendedor', null, '14/04/1979', '23/05/2018', 
  null, null, null, null, null, null, null, null, null, null);


-- 3. Insira na tabela detalhes_pedidos os seguintes dados (código do pedido: 10248, código
-- do produto: 51, preço unitário: 55.89, quantidade: 90, desconto: 0.15) e (código do
-- pedido: 10248, código do produto: 65, preço unitário: 75.01, quantidade: 120, desconto:
-- 0.10) em um único comando de inserção.
-- 4. Cria uma tabela denominada produtos_tmp com a mesma estrutura da tabela produtos.
-- Posteriormente importe todos os valores da tabela produtos para a tabela produtos_tmp.


                        -- Ate Aki Ja foi tudo passado para o trabalho
                        
    
-- Comando UPDATE
-- 1. Diminua o preço unitário de cada produto em 10%.
UPDATE produtos SET precounitario = precounitario * 0.90;

-- 2. Aplique na tabela detalhes_pedido o desconto sobre o preço unitário de cada produto.
UPDATE detalhes_pedido SET precounitario = precounitario * (DESCONTO + 1);


-- 3. Atualize o campo observação da tabela funcionários com o texto “Funcionário Modelo”
-- para todos os funcionários que estão contratados a mais de 8 anos.
UPDATE empregados SET observacoes = 'Funcionário Modelo' WHERE 
NOT datadecontratacao BETWEEN TO_DATE('25-05-10', 'DD-MM-YY') AND TO_DATE('30-05-18', 'DD-MM-YY');

-- 4. Aumente o desconto em 5% para os pedidos onde a quantidade do produto ultrapassa 20 unidades.
UPDATE detalhes_pedido SET desconto = desconto + 0.05 WHERE codigodoproduto IN 
(SELECT codigodoproduto FROM detalhes_pedido GROUP BY codigodoproduto HAVING SUM(quantidade) > 20);


-- Comando DELETE
-- 1. Excluir os empregados que possuam o sobrenome terminado com a letra a.
DELETE FROM empregados WHERE UPPER(sobrenome) LIKE '%A';

-- 2. Excluir os empregados que não possuem supervisor.
DELETE FROM empregados WHERE supervisor IS NULL;

-- 3. Excluir os produtos cujo Preço Unitário esteja entre 1e 5 reais.
DELETE FROM produtos WHERE precounitario BETWEEN 1 AND 5;

-- 4. Excluir os produtos que possuem seu valor abaixo do valor médio dos produtos de sua
-- categoria.
DELETE FROM produtos WHERE precounitario < (SELECT AVG(precounitario) FROM produtos); 




