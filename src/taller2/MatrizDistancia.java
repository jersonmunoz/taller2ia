package taller2;

public class MatrizDistancia {
	private int [][] matriz;
	private int numero = 0;
	
	public MatrizDistancia(int numero) {
		super();
		this.matriz=new int [numero][numero];
		this.numero= numero;
	}

	public int [][] getMatriz() {
		for(int i =0;i<numero;i++) {
			System.out.print("[");
			for(int j=0;j<numero;j++) {
				System.out.print(matriz[i][j]+",");
			}
			System.out.print("]");
		}
			return this.matriz;
	}
}
