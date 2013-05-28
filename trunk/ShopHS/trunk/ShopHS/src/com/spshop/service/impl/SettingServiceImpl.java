package com.spshop.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.spshop.dao.intf.SettingDAO;
import com.spshop.model.Setting;
import com.spshop.service.AbstractService;
import com.spshop.service.intf.SettingService;

public class SettingServiceImpl extends AbstractService<Setting,SettingDAO, Long> implements SettingService{

	@Override
	public List<Setting> getAllSettings() {
		List <Setting> rs = getDao().findPageByPage(0, 99999);
		
		List<Setting> rsClone = new ArrayList<Setting>();
		
		if(null != rs){
			for (Setting setting : rs) {
				rsClone.add(setting.clone());
			}
		}
		
		return rsClone;
	}
	
}
