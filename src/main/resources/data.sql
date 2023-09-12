INSERT INTO pessoa (nome, cpf, data_de_nascimento) VALUES
    ('Lucas', '11122233344', '31/05/2000'),
    ('Leonardo', '11122233355', '14/09/2003'),
    ('Ana', '11122233366', '17/06/2002');


INSERT INTO papel (nome, privilegios) VALUES 
    ('Admin', ARRAY['LER', 'ESCREVER', 'IMPRIMIR']),
    ('Usuario', ARRAY['LER']),
    ('Supervisor', ARRAY['LER', 'IMPRIMIR']);

INSERT INTO usuario (nome, senha, pessoa_id) VALUES
    ('LucasGerente', 'g123', 1),
    ('LucasUser', 'u123', 1),
    ('SuperLeo', 'l123', 2),
    ('LeonardoUser', 'leo123', 2),
    ('SuperAna', 'a123', 3),
    ('AnaUser', 'ana123', 3);

INSERT INTO usuario_tem_papel (usuario_id, papel_id) VALUES
    (1, 1),
    (1, 3),
    (2, 2),
    (3, 1),
    (3, 2),
    (3, 3),
    (4, 2),
    (5, 1),
    (5, 2),
    (5, 3),
    (6, 2)