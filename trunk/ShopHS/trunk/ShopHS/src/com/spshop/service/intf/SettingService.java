package com.spshop.service.intf;

import java.util.List;

import com.spshop.dao.intf.SettingDAO;
import com.spshop.model.Setting;

public interface SettingService extends BaseService<Setting, SettingDAO, Long>{
	List<Setting> getAllSettings();
}
