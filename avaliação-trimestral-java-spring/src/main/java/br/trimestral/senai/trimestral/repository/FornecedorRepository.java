package br.trimestral.senai.trimestral.repository;

import br.trimestral.senai.trimestral.model.Fornecedor;

public interface FornecedorRepository {

   public Fornecedor FindByNome(String nome);
   public Fornecedor FindByEmail(String email);
   public Fornecedor FindByTelefone(String telefone);


}
