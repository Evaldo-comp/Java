package Exercicios.Exercicio04_17;

public class Quilometragem {
	private int quilometros, quilTotal;
	private int litros, litTotal;
	private float quilporlitro;
	
	
	public void setQuilometros(int quilometros){
		this.quilometros = quilometros;
	}
	
	public int getQuilometros() {
		return quilometros;
	}
	
	public void setLitros(int litros){
		this.litros = litros;
	}
	
	public int getLitros() {
		return litros;
	}
	
	void setQuiloporLitro(float quilporlitro) {
		this.quilporlitro = quilporlitro;
	}
	
	public float getQuilPorLittro() {
		return getQuilometros()/getLitros();
	}
	
	void setQuilTotal(int quilTotal) {
		this.quilTotal = quilTotal;
	}
	
	public int  getQuilTotal() {
		return quilTotal;
	}
	
	void setLitTotal(int litTotal) {
		this.litTotal = litTotal;
	}
	
	public int  getLitTotal() {
		return litTotal;
	}
	

}
