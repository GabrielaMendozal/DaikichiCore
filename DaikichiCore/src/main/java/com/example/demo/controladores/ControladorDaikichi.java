package com.example.demo.controladores;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class ControladorDaikichi {
	
	@RequestMapping(value= "" , method= RequestMethod.GET)
	public String despliegaWelcome() {
		
		return "Welcome!";
	}
	
	@RequestMapping(value= "/today" , method= RequestMethod.GET)
	public String despliegaToday() {
		
		return "Today you will find luck in all your endeaovers!";
	}
	
	@RequestMapping(value= "/tomorrow" , method= RequestMethod.GET)
	public String despliegaTomorrow() {
		
		System.out.println("Hola");
		return "Tomorrow, an opportunity will arise, so be sour to be open to new ideas! ";
	}
	
	@RequestMapping (value = "/travel/{ciudad}", method= RequestMethod.GET)
	public String despliegaCiudadPath (@PathVariable("ciudad") String ciudad) {
		
		return "¡Felicitaciones! ¡Pronto viajarás a " + ciudad +  "!";
	}
	
	@RequestMapping (value = "/lotto/{numero}", method= RequestMethod.GET)
	public String despliegaCiudadPath (@PathVariable("numero") int numero) {
		
		if(numero % 2 == 0) {
			return "Harás un gran viaje en un futuro cercano, pero ten cuidado con las ofertas tentadoras";
		}
		else {
			return "Has disfrutado de los frutos de tu trabajo, pero ahora es un buen momento para pasar tiempo con familiares y amigos";
		}
		
	}
}
	
