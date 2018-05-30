package teste;

import entidade.ETipoAssociado;
import negocio.NTipoAssociado;

public class TTipoAssociado {
    
    public static void main(String[] args) {
        System.out.println("Teste Automático crud simples tipo associado");
        
        try {
            NTipoAssociado service = new NTipoAssociado();
            ETipoAssociado tipo = new ETipoAssociado();
            tipo.setDescricao("Novo tipo Associado");
            tipo.setValorMensalidade(100.0);
            
            service.salvar(tipo);
            System.out.println("Tipo Associado salvo com sucesso!\n\n\n");
            
            service.listarSet().forEach(x -> System.out.println("Código: " + x.getCodigo() + " || Descrição: " + x.getDescricao()));
            System.out.println("Tipo Associado listado com sucesso!\n\n\n");
            
            tipo.setDescricao("Alterar tipo Associado");
            service.salvar(tipo);
            System.out.println("Tipo Associado alterado com sucesso!\n\n\n");
            
            System.out.println("Descricao : " + service.consultar(tipo.getCodigo()).getDescricao());
            System.out.println("Tipo Associado consultado com sucesso!\n\n\n");
            
            service.deletar(tipo.getCodigo());
            System.out.println("Tipo Associado deletado com sucesso!\n\n\n");
            
            service.listar().forEach(x -> System.out.println("Código: " + x.getCodigo() + " || Descrição: " + x.getDescricao()));
            System.out.println("Tipo Associado listado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
