package com.gft.starters.g2.poo.generics;

import java.util.ArrayList;
import java.util.List;

import com.gft.starters.g2.poo.transporte.ITransporte;
import com.gft.starters.g2.poo.transporte.terrestre.Autobus;
import com.gft.starters.g2.poo.transporte.terrestre.Escolar;
import com.gft.starters.g2.poo.transporte.terrestre.ITerrestre;
import com.gft.starters.g2.poo.transporte.terrestre.Torton;

public class TestGenerics {

	public static void main(String args[]){
		
		List<ITransporte> list = new ArrayList();
		Autobus a  = new Escolar();
		list.add(a);
		
		List<ITerrestre> listPublic = new ArrayList<ITerrestre>();
		Torton torton  = new Torton();
		listPublic.add(torton);
		listPublic.add(a);
		
		
		
	}
	
	public List<? extends Autobus> getAlgo(List<? extends ITransporte > enrada ){
		
		return null;
	}
	
	
}
