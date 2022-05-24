package dto;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ProductTypeEnumDTO {
	P("P"),
	S("S"),
	H("H"),
	I("I"),
	O("O");
	
	private final String value;
	
	private ProductTypeEnumDTO(String value) {
		this.value=value;
	}
	
	@JsonValue
	public String getValue() {
		return this.value;
	}
	
	public static ProductTypeEnumDTO fromValue(String value) {
		for (ProductTypeEnumDTO val: ProductTypeEnumDTO.values()){
			if (val.value.equals(value)) {
				return val;
			}
		}
		throw new IllegalArgumentException(value);
	}
	
}
