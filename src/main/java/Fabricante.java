package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	private String nombre;
	Pais pais;
	int contFabricante = 0;
	private static ArrayList<Fabricante> Fabricantes = new ArrayList<Fabricante>();
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		Fabricantes.add(this);
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	public Pais getPais() {
		return pais;
	}
	
	public static String fabricaMayorVentas() {
		int contador = 0;
		Fabricante Vendedor=null;
		for(Fabricante i:Fabricantes) {
			if(i.contFabricante > contador) {
				contador=i.contFabricante;
				Vendedor=i;
			}
		}
		return Vendedor.nombre;
	}
}
