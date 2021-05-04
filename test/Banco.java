package TP3;

import java.util.Vector;

public class Banco {
    private String nombre;
    private Vector<Cuenta> cuentas;
    private Vector<Clientes> clientela;
     
    public Banco() {
    	 clientela = new Vector<Clientes>();
    	 cuentas = new Vector<Cuenta>();
     }
     
    public Banco(String nom, Cuenta c, Clientes s) {
    	 this.nombre = nom;
    	 this.cuentas.add(c);
    	 this.clientela.add(s);
    	
     } 
     
    public void addCliente (Clientes s) {
    	 if (!this.clientela.contains(s))
             this.clientela.add(s); //funciona por equals el contains
     }
     
    public void removeCliente(Clientes c) {
 		clientela.remove(c); //funciona x el equals, xq sino debe eliminar mismo objeto y no datos que estan guardados en ese objeto
 	}
     
    public void addCuenta (Cuenta c) {
    	if (!this.cuentas.contains(c))
    		this.cuentas.add(c);
    }
 	
    public void deleteCuenta (Cuenta c) {
    	this.cuentas.remove(c);
    }

	public String getNombre() {
		return nombre;
	}

	public Cuenta getCuentas(int numsocio) {
		for (Cuenta m: this.cuentas)
		{
			if (m.getNrocliente() == numsocio)
				return m;
		}
		return null;
	}

	public Clientes getClientela(int numsocio) {
		for (Clientes m: this.clientela)
		{
			if(m.getNumsocio() == numsocio)
				return m;
		}
		return null; 
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
    
 //delete,add,get en cliente y cuenta se repite codigo, entonces habria que hacer herencia desde banco
 //para agarrar esos metodos, dar lo que devuelve y ya
     

