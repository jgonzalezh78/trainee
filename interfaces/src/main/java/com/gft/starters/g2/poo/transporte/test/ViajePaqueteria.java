package com.gft.starters.g2.poo.transporte.test;

import com.gft.starters.g2.poo.transporte.terrestre.ICarga;
import com.gft.starters.g2.poo.transporte.terrestre.Torton;

public abstract class ViajePaqueteria  {


	public void envio(){
		//ICarga iCarga = new Trailer();
		ICarga iCarga = new Torton();
		iCarga.traslado();
		iCarga.frenar();
		((Torton)iCarga).accionTorton();
	}
	
	
}

