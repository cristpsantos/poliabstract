package entities;

public class PessoaFisica extends Pessoa {

	private Double gastosSaude;
	
	public PessoaFisica() {
		super();
	}
		
	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}
	
	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public Double imposto() {
		double imp = 0.0;
		
		if (getGastosSaude() != 0.0) {
			
			if (getRendaAnual() < 20000.00) {
				
				imp =(getRendaAnual() * 0.15) - (getGastosSaude() * 0.50);
			} else {
				
				imp = (getRendaAnual() * 0.25) - (getGastosSaude() * 0.50);
			}
		} else {
			if (getRendaAnual() >= 20000.00) {
				
				imp = getRendaAnual() * 0.15;
			} else {
				
				imp = getRendaAnual() * 0.25;
			}
		}
		
		return imp;
	}

}
