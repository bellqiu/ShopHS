package com.spshop.model;


public class Setting extends Component{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3791834742878503624L;
	
	private String key;
	private String value;
	
	public Setting() {
	}
	
	public Setting(Setting setting) {
		super(setting);
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Setting clone() {
		Setting inst = new Setting(this);
		inst.key = this.key == null ? null : new String(this.key);
		inst.value = this.value == null ? null : new String(this.value);
		return inst;
	}
	
}
