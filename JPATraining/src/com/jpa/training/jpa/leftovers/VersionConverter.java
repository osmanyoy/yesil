package com.jpa.training.jpa.leftovers;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class VersionConverter implements AttributeConverter<Version, String> {

	@Override
	public String convertToDatabaseColumn(final Version attribute) {
		if (attribute == null) {
			return null;
		}
		return "V" + attribute.getMajor() + " " + attribute.getMinor() + " " + attribute.getBuild();
	}

	@Override
	public Version convertToEntityAttribute(final String dbData) {
		if (dbData == null) {
			return null;
		}
		String substring = dbData.substring(1);
		String[] split = substring.split(" ");
		Version version = new Version();
		version.setMajor(Integer.parseInt(split[0]));
		version.setMinor(Integer.parseInt(split[1]));
		version.setBuild(Integer.parseInt(split[2]));
		return version;
	}

}
