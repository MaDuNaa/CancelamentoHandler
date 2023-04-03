package com.matheus.bookstore.tecnica;

public class CancelamentoBasicoHandler implements CancelamentoHandler{
	
	 private CancelamentoHandler proximoHandler;
	 
	 @Override
	    public void handleCancelamento(SolicitacaoCancelamento solicitacao) {
	        if (solicitacao.isCancelamentoSimples()) {
	            // Trata a solicitação de cancelamento simples
	        } else if (proximoHandler != null) {
	            proximoHandler.handleCancelamento(solicitacao);
	        } else {
	            throw new RuntimeException("Não foi possível tratar a solicitação de cancelamento.");
	        }
	    }
	
	 public void setProximoHandler(CancelamentoHandler proximoHandler) {
	        this.proximoHandler = proximoHandler;
	    }

	public CancelamentoHandler getProximoHandler() {
		return proximoHandler;
	}
	 
	 
	 
	 
	}


