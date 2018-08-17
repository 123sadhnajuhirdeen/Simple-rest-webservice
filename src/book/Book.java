package book;
//annotation

import javax.ws.rs.core.MediaType;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/book")
public class Book {
	
	@GET
	@Produces(MediaType.TEXT_XML)        //consume
	public String sayHelloXML()
	{
		String response = "<?xml version='1.0'?>" + "<hello>Hello XML</hello>";
		return response;
	}
	
//	@GET
//	@Produces(MediaType.TEXT_HTML)        //consume
//	public String sayHelloHTML()
//	{
//		String response = "<h1>Hello HTML</h1>";
//		return response;
//	}
	
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)        //consume
//	public String sayHelloJSON()
//	{
//		String response = null;
//		return response;
//	}
	
	

}
