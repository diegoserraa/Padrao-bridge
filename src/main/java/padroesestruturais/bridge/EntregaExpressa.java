package padroesestruturais.bridge;

public class EntregaExpressa implements TipoEntrega{

	/**
	 * Apenas um crit�rio qualquer que simula o calculo de valor de uma entrega
	 */
	@Override
	public double calcularEntrega(double precoTotalDoPedido) {
		if(precoTotalDoPedido > 300) {
			return 200;
		}
		return 100;
	}

}
