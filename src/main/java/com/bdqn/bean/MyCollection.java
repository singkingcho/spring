package com.bdqn.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class MyCollection {

	private List<String> addressList;
	
	private Set<Girl> girls;
	
	private Map<String, Object> maps;
	
	private Properties properties;

	public List<String> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<String> addressList) {
		this.addressList = addressList;
	}

	public Set<Girl> getGirls() {
		return girls;
	}

	public void setGirls(Set<Girl> girls) {
		this.girls = girls;
	}

	public Map<String, Object> getMaps() {
		return maps;
	}

	public void setMaps(Map<String, Object> maps) {
		this.maps = maps;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	
	
	
}
