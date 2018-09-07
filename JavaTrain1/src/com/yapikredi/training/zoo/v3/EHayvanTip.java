package com.yapikredi.training.zoo.v3;

public enum EHayvanTip {
	KEDI(1),KOPEK(2),ASLAN(3),PAPAGAN(4),FIL(5);
	
	private int index;

	private EHayvanTip(int index) {
		this.index = index;
	}

	public int getIndex() {
		return index;
	}
	
	public static EHayvanTip getHayvanTipi(int index) {
		EHayvanTip[] values = EHayvanTip.values();
		for (EHayvanTip eHayvanTip : values) {
			if (eHayvanTip.getIndex() == index) {
				return eHayvanTip;
			}
		}
		return null;
	}
	
}
