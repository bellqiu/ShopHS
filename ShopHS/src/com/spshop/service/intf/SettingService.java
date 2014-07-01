package com.spshop.service.intf;

import java.util.List;

import com.spshop.admin.shared.PagingAndSortingInfo;
import com.spshop.dao.intf.SettingDAO;
import com.spshop.dto.SettingDTO;
import com.spshop.dto.SettingSummaryDTO;
import com.spshop.model.Setting;

public interface SettingService extends BaseService<Setting, SettingDAO, Long>{
	List<SettingSummaryDTO> getSettings(PagingAndSortingInfo pagingAndSortingInfo);
	long countSettings();
	List<SettingDTO> getAllSettings();
	SettingDTO save(SettingDTO settingDTO);
	SettingDTO byID(long id);
}
