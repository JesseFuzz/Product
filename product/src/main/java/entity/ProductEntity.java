package entity;

import java.time.OffsetDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import dto.ProductTypeEnumDTO;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
public class ProductEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="prd_id")
	private Long id;
	
	@Column(name="prd_name", nullable=false)
	private String name;
	
	@Enumerated(EnumType.STRING)
	@Column(name="prd_id", length=1, nullable=false)
	private ProductTypeEnumDTO type=ProductTypeEnumDTO.P;
	
	@Column(name="prd_identifier")
	private String identifier;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ProductTypeEnumDTO getType() {
		return type;
	}

	public void setType(ProductTypeEnumDTO type) {
		this.type = type;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getIdentifierType() {
		return identifierType;
	}

	public void setIdentifierType(String identifierType) {
		this.identifierType = identifierType;
	}

	public Boolean getOwn() {
		return own;
	}

	public void setOwn(Boolean own) {
		this.own = own;
	}

	public OffsetDateTime getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(OffsetDateTime dateCreated) {
		this.dateCreated = dateCreated;
	}

	@Column(name="prd_reference")
	private String reference;
	
	@Column(name="prd_identifier_type")
	private String identifierType;
	
	@Column(name="prd_own")
	private Boolean own = Boolean.FALSE;
	
	@Column(name="prd_date_created")
	private OffsetDateTime dateCreated = OffsetDateTime.now();
	
}
