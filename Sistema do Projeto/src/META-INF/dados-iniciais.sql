insert into funcionario(id, nome, tipo, cpf, login, senha, status_funcionario, telefone, email) values(1, "Yuri Silva", "Gerente", "504", "Yuri", "1234", "Ativo", "23131", "yuri@aluno");
insert into funcionario(id, nome, tipo, cpf, login, senha, status_funcionario, telefone, email) values(1, "Adryan Luis", "Funcionario", "505", "Adryan", "1234", "Ativo", "32132", "adryan@aluno");
insert into funcionario(id, nome, tipo, cpf, login, senha, status_funcionario, telefone, email) values(1, "Pedro Baschoni", "Atendente", "506", "Pedro", "1234", "Ativo", "12312", "pedro@aluno");

insert into produto(id, preco, quantidade, descricao, tipo) values(1, 4.99, 10, "Refrigerante", "Industrializado");

insert into fornecedor(id, nome, valor_total_Comprado, email, telefone, valor_total_pago, status_fornecedor) values (1, "Sukita", 4000, "sukita.contato@hotmail.com", "2313131", 2000, "Ativo");

INSERT INTO caixa(id, abertura, saida, saldo, saldoFinal, situacao, funcionario_id) VALUES (1, '2023-11-28 01:38:11.648', '2023-11-28 02:27:59.257', 169.38, 169.38, 'F', 1);

INSERT INTO compra(id, dataCompra, valorTotal, fonecedor_id) VALUES (1, "2023-11-11", 1000, 1);
INSERT INTO compra(id, dataCompra, valorTotal, fonecedor_id) VALUES (2, "2023-11-11", 200, 1);

INSERT INTO venda(id, dataVenda, totalVenda, caixa_id) VALUES (1, '2023-11-28 01:52:01.985', 32.46, 1);

INSERT INTO item_pedido(preco, quantidade, produto_id, venda_id) VALUES (4.99, 4, 1, 1);
INSERT INTO item_pedido(preco, quantidade, produto_id, venda_id) VALUES (0.5, 4, 2, 1);
INSERT INTO item_pedido(preco, quantidade, produto_id, venda_id) VALUES (3.5, 4, 3, 1);

INSERT INTO parcela(id, dataPagamento, dataVencimento, valor, compra_id) VALUES (1, '2023-11-11', '2023-12-12', 200, 1);

INSERT INTO sangria(id, motivo, valor, caixa_id) VALUES (1, 'conta de luz', 200, 1);



