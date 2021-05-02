INSERT INTO users
VALUES
(1, 'user@email.com', 'Nome Sobrenome', 'senha123'),
(2, 'carol@email.com', 'Ana Carolina Andrade', 'senha123'),
(3, 'filipi@email.com', 'Filipi Firmino', 'senha123'),
(4, 'mateus@email.com', 'Mateus Leite', 'senha123');

INSERT INTO logs
VALUES
(1, '2020-01-18', 'Tempo de conexão excedido', 'ERROR', '408', 'autenticação'),
(2, '2020-02-08', 'Algumas informações não puderam ser carregadas', 'WARNING', '199', 'pagamentos'),
(3, '2020-03-05', 'O servidor está rodando na porta 4001.', 'INFO', '100', 'cadastro'),
(4, '2020-04-28', 'URI muito longo.', 'ERROR', '414', 'controle de estoque'),
(5, '2020-05-10', 'Esse parâmetro necessita de uma chave.', 'WARNING', '199', 'cadastro'),
(6, '2020-06-12', 'Persistência de alertas.', 'WARNING', '299', 'autenticação'),
(7, '2020-08-26', 'Não autorizado.', 'ERROR', '401', 'bigdata'),
(8, '2020-09-05', 'Falta uma dependência na sua requisição.', 'INFO', '100', 'pagamentos'),
(9, '2020-10-12', 'Espaço de armazenamento insuficiente.', 'ERROR', '507', 'bigdata'),
(10, '2020-11-24', 'Temperatura elevada.', 'WARNING', '199', 'monitoramento de servidor'),
(11, '2021-01-21', 'Erro interno do servidor.', 'ERROR', '500', 'analytics'),
(12, '2021-03-14', 'Página não encontrada.', 'ERROR', '404', 'logística'),
(13, '2021-04-18', 'As definições de vírus estão desatualizadas.', 'WARNING', '199', 'firewall');
