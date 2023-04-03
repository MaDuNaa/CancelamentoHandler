package com.matheus.bookstore.tecnica;

public class Main {
	
	 public static void main(String[] args) {
	        CancelamentoHandler handler = new CancelamentoBasicoHandler();
	        CancelamentoHandler handlerAvancado = new CancelamentoAvancadoHandler();
	        CancelamentoHandler handlerPremium = new CancelamentoPremiumHandler();

	        handler.setProximoHandler(handlerAvancado);
	        handlerAvancado.setProximoHandler(handlerPremium);
	        
	    
	        SolicitacaoCancelamento solicitacao = new SolicitacaoCancelamento();
	        solicitacao.setCancelamentoPremium(true);

	        
	        handler.handleCancelamento(solicitacao);
	        
	        System.out.print(solicitacao);
	    }
	}

