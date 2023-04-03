package com.matheus.bookstore.tecnica;

public class SolicitacaoCancelamento {

	    private boolean cancelamentoSimples;
	    private boolean cancelamentoAvancado;
	    private boolean cancelamentoPremium;
	    
		public boolean isCancelamentoSimples() {
			return cancelamentoSimples;
		}
		public void setCancelamentoSimples(boolean cancelamentoSimples) {
			this.cancelamentoSimples = cancelamentoSimples;
		}
		public boolean isCancelamentoAvancado() {
			return cancelamentoAvancado;
		}
		public void setCancelamentoAvancado(boolean cancelamentoAvancado) {
			this.cancelamentoAvancado = cancelamentoAvancado;
		}
		public boolean isCancelamentoPremium() {
			return cancelamentoPremium;
		}
		public void setCancelamentoPremium(boolean cancelamentoPremium) {
			this.cancelamentoPremium = cancelamentoPremium;
		}
		@Override
		public String toString() {
			return "SolicitacaoCancelamento [cancelamentoSimples=" + cancelamentoSimples + ", cancelamentoAvancado="
					+ cancelamentoAvancado + ", cancelamentoPremium=" + cancelamentoPremium + "]";
		}
	    
	    
	
	
}
