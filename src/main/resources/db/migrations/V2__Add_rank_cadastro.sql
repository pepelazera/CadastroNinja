-- V2: Migrations para adicionar a coluna de RANKING na tabela de cadastros

ALTER TABLE cadastros
ADD COLUMN ranking VARCHAR(255);