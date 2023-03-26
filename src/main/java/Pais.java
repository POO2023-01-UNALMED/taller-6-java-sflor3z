package vehiculos;

import java.util.ArrayList;

public class Pais {
	private String nombre;
	int contPais = 0;
	private static ArrayList<Pais> Paises = new ArrayList<Pais>();
	
	public Pais(String nombre) {
		this.nombre = nombre;
		Paises.add(this);
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public static String paisMasVendedor() {
		int contador = 0;
		Pais Vendedor=null;
		for(Pais i:Paises) {
			if(i.contPais > contador) {
				contador=i.contPais;
				Vendedor=i;
			}
		}
		return Vendedor.getNombre();
	}
}
