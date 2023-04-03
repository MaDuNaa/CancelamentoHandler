package com.matheus.bookstore.tecnica;

public class CancelamentoPremiumHandler implements CancelamentoHandler{
	
	 private CancelamentoHandler proximoHandler;
	 
	 @Override
	    public void handleCancelamento(SolicitacaoCancelamento solicitacao) {
	        if (solicitacao.isCancelamentoPremium()) {
	            // Trata a solicitação de cancelamento premium
	        } else if (proximoHandler != null) {
	            proximoHandler.handleCancelamento(solicitacao);
	        } else {
	            throw new RuntimeException("Não foi possível tratar a solicitação de cancelamento.");
	        }
	    }
	 
	 public void setProximoHandler(CancelamentoHandler proximoHandler) {
	        this.proximoHandler = proximoHandler;
	    }
}

