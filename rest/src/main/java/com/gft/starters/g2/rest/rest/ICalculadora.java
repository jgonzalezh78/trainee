package com.gft.starters.g2.rest.rest;

import com.gft.starters.g2.rest.rest.dto.DTOOperacion;
import com.gft.starters.g2.rest.rest.dto.DTORespuesta;

public interface ICalculadora {

	public DTORespuesta suma( DTOOperacion operacion, String modelo);
	public DTORespuesta resta( DTOOperacion operacion, String modelo);
	public DTORespuesta multiplicacion( DTOOperacion operacion, String modelo);
	public DTORespuesta division( DTOOperacion operacion, String modelo);

	
}
