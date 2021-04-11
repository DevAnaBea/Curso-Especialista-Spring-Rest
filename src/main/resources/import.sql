insert into cozinha (id, nome) values (1,'Brasileira');
insert into cozinha (id, nome) values (2,'Fast-Food');

insert into restaurante (nome, taxa_frete, cozinha_id) values ('Tempero da Vovó', 5, 1)
insert into restaurante (nome, taxa_frete, cozinha_id) values ('Burguesa Hamburgueria Artesanal', 4.50, 2)
insert into restaurante (nome, taxa_frete, cozinha_id) values ('SamBar & Restaurante', 7, 1)


insert into estado (id, nome) values (1, 'Rio de Janeiro');
insert into estado (id, nome) values (2, 'São Paulo');
insert into estado (id, nome) values (3, 'Espirito Santo');


insert into cidade (id, nome, estado_id) values (1, 'Rio de Janeiro', 1)
insert into cidade (id, nome, estado_id) values (2, 'São Gonçalo', 1)
insert into cidade (id, nome, estado_id) values (3, 'São Paulo', 2)
insert into cidade (id, nome, estado_id) values (4, 'Guarulhos', 2)
insert into cidade (id, nome, estado_id) values (5, 'Vitória', 3)
insert into cidade (id, nome, estado_id) values (6, 'Guarapari', 3)

insert into forma_pagamento (id, descricao) values (1, 'Dinheiro')
insert into forma_pagamento (id, descricao) values (2, 'Cartão de Crédito')
insert into forma_pagamento (id, descricao) values (3, 'Cartão de Débito')
insert into forma_pagamento (id, descricao) values (4, 'Vale Refeição')

insert into permissao (id, nome, descricao) values (1, 'CONSULTAR_RESTAURANTES', 'Tem permissão para consultar restaurantes')
insert into permissao (id, nome, descricao) values (2, 'EDITAR_RESTAURANTES', 'Tem permissão para editar restaurantes')