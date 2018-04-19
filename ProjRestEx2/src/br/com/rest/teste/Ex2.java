package br.com.rest.teste;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/variavel")
public class Ex2 {
	
	@GET
	@Path("Multiplicar0/{param1}")
	public String multiplicar0(@PathParam("param1") int a) {
		String out = String.valueOf(a * 0);
		return out;
	}
	
	@GET
	@Path("Multiplicar1/{param1}")
	public String multiplicar1(@PathParam("param1") int a) {
		String out = String.valueOf(a * 1);
		return out;
	}
	
	@GET
	@Path("Trianguloperimetro/{param1}/{param2}/{param3}")
	public String trianguloperimetro(@PathParam("param1") int a, @PathParam("param2") int b, @PathParam("param3") int c) {
		String out = String.valueOf(a + b + c);
		return out;
	}
	@GET
	@Path("Trianguloarea/{param1}/{param2}/{param3}")
	public String trianguloarea(@PathParam("param1") int a, @PathParam("param2") int b, @PathParam("param3") int c) {
		String out = String.valueOf(((b*c)/2));
		String triangulo = "e este eh um triangulo";
		if((a-b) < c && c < (a+b)) {
			triangulo += " verdadeiro";
		}else {
			triangulo += " falso";
		}
		return "A area do triangulo eh : "+ out+" "+triangulo;
		
	}

}
