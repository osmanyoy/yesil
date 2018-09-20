package com.jpa.training.jpa.leftovers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.validation.Valid;
import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/product")
public class ProductRest {

	@EJB
	private ProductDAO productDAO;

	@GET
	@Path(value = "add/ver1/{name}/{version}")
	@Produces(MediaType.APPLICATION_JSON)
	public Product addProduct(@PathParam("name") final String productName,
	                          @PathParam("version") final String productVersion,
	                          @HeaderParam("end_date") final Date endDate,
	                          @QueryParam("prodType") final EProducType productType,
	                          @QueryParam("oldv") final List<String> oldVersions) {
		Product product = new Product();
		product.setProductName(productName);
		product.setProductVersion(productVersion);
		product.setProductType(productType);
		product.setEndDate(endDate);
		product.setOldVersions(oldVersions);
		this.productDAO.save(product);
		return product;

	}

	@GET
	@Path(value = "add/ver2/{name}/{version}")
	@Produces(MediaType.APPLICATION_JSON)
	public Product addProduct(@Valid @BeanParam final Product product) {
		this.productDAO.save(product);
		return product;
	}

	@GET
	@Path(value = "update/ver2/{name}/{version}")
	@Produces(MediaType.APPLICATION_JSON)
	public Product updateProduct(@Valid @BeanParam final Product product) {
		this.productDAO.update(product);
		return product;
	}

	@POST
	@Path(value = "add/ver3")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Product addProduct3(@Valid final Product product) {
		this.productDAO.save(product);
		return product;
	}

	@GET
	@Path(value = "all")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> getll() {
		return this.productDAO.getall();
	}

	public static class TestData {
		private Date date;
		private String string;

		public Date getDate() {
			return this.date;
		}

		public void setDate(final Date date) {
			this.date = date;
		}

		public String getString() {
			return this.string;
		}

		public void setString(final String string) {
			this.string = string;
		}

	}

	@GET
	@Path("/testdata")
	@Produces(MediaType.APPLICATION_JSON)
	public TestData getTest() {
		TestData testData = new TestData();
		testData.setDate(new Date());
		testData.setString("test");
		return testData;
	}

	@GET
	@Path(value = "/get/byname/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> addProduct(@PathParam("name") final String name) {
		List<Product> nativeProducts3 = this.productDAO.getNativeProducts3(name);
		return nativeProducts3;
	}

	public static void main(final String[] args) {
		String PATTERN_RFC1123 = "EEE, dd MMM yyyy HH:mm:ss zzz";
		SimpleDateFormat dateFormat = new SimpleDateFormat(PATTERN_RFC1123);
		System.out.println(dateFormat.format(new Date()));
	}

}
