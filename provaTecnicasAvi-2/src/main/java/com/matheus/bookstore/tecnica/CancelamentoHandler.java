package com.matheus.bookstore.tecnica;

public interface CancelamentoHandler {
	
    void handleCancelamento(SolicitacaoCancelamento solicitacao);

	void setProximoHandler(CancelamentoHandler handlerAvancado);
    
    

}
