INSERT INTO pessoa (nome, cpf, data_de_nascimento) VALUES
    ('Lucas', '11122233344', '31/05/2000'),
    ('Leonardo', '11122233355', '14/09/2003'),
    ('Ana', '11122233366', '17/06/2002');


INSERT INTO papel (nome, privilegios) VALUES 
    ('Admin', '["LER", "ESCREVER", "IMPRIMIR"]'),
    ('Usuario', '["LER"]'),
    ('Supervisor', '["LER", "IMPRIMIR"]');


-- // TODO Corrigir depois colocando os papeis
INSERT INTO usuario (nome, senha, pessoa_id) VALUES
    ('Lucas CEO', 'ceo123', 1),
    ('Lucas Gerente', 'g123', 1),
    ('Leonardo', 'leo123', 2),
    ('Ana', 'ana123', 3);