package com.magic.bean.support;

import java.util.ArrayList;
import java.util.List;

public class PropertyList {
	private List<PropertyItem> propertyList = new ArrayList();
	
	public List<PropertyItem> getPropertyList() {
		return propertyList;
	}
	
	public void addPropertyItem(PropertyItem propertyItem) {
		this.propertyList.add(propertyItem);
	}
}
