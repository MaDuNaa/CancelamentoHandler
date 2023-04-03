package com.matheus.bookstore.tecnica;

public class CancelamentoAvancadoHandler implements CancelamentoHandler{
	
	private CancelamentoHandler proximoHandler;
	
	@Override
    public void handleCancelamento(SolicitacaoCancelamento solicitacao) {
        if (solicitacao.isCancelamentoAvancado()) {
            // Trata a solicitação de cancelamento avançado
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

