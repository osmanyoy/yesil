package com.jpa.training.jpa.leftovers;

import java.util.Date;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EntityResult;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.FieldResult;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.SqlResultSetMappings;
import javax.persistence.TableGenerator;
import javax.persistence.Version;
import javax.validation.constraints.Size;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

@NamedQueries({ @NamedQuery(name = "Product.getByProductName",
                            query = "select p from Product p where p.productName = ?1"),
        @NamedQuery(name = "Product.getByProductVersion",
                    query = "select p from Product p where p.productVersion = ?1") })
@NamedNativeQueries({ @NamedNativeQuery(name = "Product.native.getByProductName",
                                        query = "select * from product where productName=:pName",
                                        resultClass = Product.class),
        @NamedNativeQuery(name = "Product.native.getByProductName2",
                          query = "select p.prodId, p.productName as pn,p.endDate as ed,p.productType as pt,p.productVersion as pv, p.versionInfo as vi from product p where productName=:pName",
                          resultClass = Product.class) })

@SqlResultSetMappings({ @SqlResultSetMapping(name = "customMap1",
                                             entities = { @EntityResult(entityClass = Product.class,
                                                                        fields = { @FieldResult(column = "pn",
                                                                                                name = "productName"),
                                                                                @FieldResult(column = "ed",
                                                                                             name = "endDate"),
                                                                                @FieldResult(column = "pt",
                                                                                             name = "productType"),
                                                                                @FieldResult(column = "pv",
                                                                                             name = "productVersion"),
                                                                                @FieldResult(column = "prodId",
                                                                                             name = "prodId"),
                                                                                @FieldResult(column = "vi",
                                                                                             name = "versionInfo") }) })

})
@Entity
// @SequenceGenerator(sequenceName = "mySequence", initialValue = 100,
// allocationSize = 200, name = "seq")
@TableGenerator(allocationSize = 200,
                pkColumnName = "my_id",
                valueColumnName = "my_value",
                table = "my_seq_table",
                name = "mytablegen",
                initialValue = 100,
                pkColumnValue = "product")
public class Product {
	@Id
	// @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	@GeneratedValue(strategy = GenerationType.TABLE,
	                generator = "mytablegen")
	@QueryParam("pid")
	private long prodId;

	@PathParam("name")
	@Column(length = 30)
	@Size(min = 5,
	      max = 30,
	      message = "5 ile 30 arasýnda olmalý. yoksa patlar")
	private String productName;

	@PathParam("version")
	private String productVersion;

	@HeaderParam("end_date")
	private Date endDate;

	@QueryParam("prodType")
	@Enumerated(EnumType.STRING)
	private EProducType productType;

	@QueryParam("oldv")
	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "prod_old_ver")
	private List<String> oldVersions;

	@Convert(converter = VersionConverter.class)
	private Version versionInfo;

	@Version
	private int vIndex;

	@PrePersist
	public void xyzBeforePersist() {
		System.out.println("PrePersist : " + this);
	}

	@PostPersist
	public void xyzAfterPersist() {
		System.out.println("PostPersist : " + this);
	}

	@PreUpdate
	public void xyzBeforeUpdate() {
		System.out.println("PreUpdate : " + this);
	}

	@PostUpdate
	public void xyzAfterUpdate() {
		System.out.println("PostUpdate : " + this);
	}

	@PreRemove
	public void xyzBeforeRemove() {
		System.out.println("PreRemove : " + this);
	}

	@PostRemove
	public void xyzAfterRemove() {
		System.out.println("PostRemove : " + this);
	}

	@PostLoad
	public void xyzAfterSelect() {
		System.out.println("PostLoad : " + this);
	}

	public long getProdId() {
		return this.prodId;
	}

	public void setProdId(final long prodId) {
		this.prodId = prodId;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(final String productName) {
		this.productName = productName;
	}

	public String getProductVersion() {
		return this.productVersion;
	}

	public void setProductVersion(final String productVersion) {
		this.productVersion = productVersion;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(final Date endDate) {
		this.endDate = endDate;
	}

	public EProducType getProductType() {
		return this.productType;
	}

	public void setProductType(final EProducType productType) {
		this.productType = productType;
	}

	public List<String> getOldVersions() {
		return this.oldVersions;
	}

	public void setOldVersions(final List<String> oldVersions) {
		this.oldVersions = oldVersions;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + this.prodId + ", productName=" + this.productName + ", productVersion="
		        + this.productVersion + ", endDate=" + this.endDate + ", productType=" + this.productType
		        + ", oldVersions=" + this.oldVersions + "]";
	}

	public Version getVersionInfo() {
		return this.versionInfo;
	}

	public void setVersionInfo(final Version versionInfo) {
		this.versionInfo = versionInfo;
	}

	public int getvIndex() {
		return this.vIndex;
	}

	public void setvIndex(final int vIndex) {
		this.vIndex = vIndex;
	}

}
