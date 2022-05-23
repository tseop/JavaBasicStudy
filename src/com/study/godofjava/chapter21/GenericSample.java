package com.study.godofjava.chapter21;

public class GenericSample {
	public static void main(String[] args) {
		GenericSample sample = new GenericSample();
		sample.checkCastingDTO();
	}

	public void checkCastingDTO() {
		CastingDTO dto = new CastingDTO();
		dto.setObject(new String());
		String temp1 = (String) dto.getObject();

		dto = new CastingDTO();
		dto.setObject(new StringBuffer());
		StringBuffer temp2 = (StringBuffer) dto.getObject();

		dto = new CastingDTO();
		dto.setObject(new StringBuilder());
		StringBuilder temp3 = (StringBuilder) dto.getObject();

	}

	public void checkCastingGenericDTO() {
		CastingGenericDTO<String> dto = new CastingGenericDTO<String>();
		dto.setObject(new String());
		String temp1 = dto.getObject();

		CastingGenericDTO<StringBuffer> dto2 = new CastingGenericDTO<StringBuffer>();
		dto2.setObject(new StringBuffer());
		StringBuffer temp2 = (StringBuffer) dto2.getObject();

		CastingGenericDTO<StringBuilder> dto3 = new CastingGenericDTO<StringBuilder>();
		dto3.setObject(new StringBuilder());
		StringBuilder temp3 = (StringBuilder) dto3.getObject();
	}
}
