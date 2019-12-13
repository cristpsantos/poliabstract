package entities;

public class PessoaPj extends Pessoa{

	private Integer numFunc;
	
	public PessoaPj() {
		super();
	}

	public PessoaPj(String nome, Double rendaAnual, Integer numFunc) {
		super(nome, rendaAnual);
		this.numFunc = numFunc;
	}
	
	public Integer getNumFunc() {
		return numFunc;
	}

	public void setNumFunc(Integer numFunc) {
		this.numFunc = numFunc;
	}

	@Override
	public Double imposto() {
		double imp = 0.0;
		
		if (getNumFunc() > 10) {
			
			imp = getRendaAnual() * 0.14;
			
		} else {
			
			imp = getRendaAnual() * 0.16;
		} 
		return imp;
	}

}
