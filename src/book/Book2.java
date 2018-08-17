package book;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/book2")
public class Book2 {
	
	@GET
	@Produces(MediaType.TEXT_HTML)        //consume
	@Path("{name}")
	public String sayHelloHTML(@PathParam("name") String name)
	{
		String response = "<?xml version='1.0'?>" + "<hello>Hello " + name +"</hello>";
 		return response;
	}

}
