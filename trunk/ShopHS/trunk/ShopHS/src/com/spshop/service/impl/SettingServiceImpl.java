package com.spshop.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.spshop.admin.shared.PagingAndSortingInfo;
import com.spshop.dao.intf.SettingDAO;
import com.spshop.dto.SettingDTO;
import com.spshop.dto.SettingSummaryDTO;
import com.spshop.model.Component;
import com.spshop.model.Setting;
import com.spshop.service.AbstractService;
import com.spshop.service.intf.SettingService;

public class SettingServiceImpl extends AbstractService<Setting,SettingDAO, Long> implements SettingService{

	@Override
	public List<SettingSummaryDTO> getSettings(PagingAndSortingInfo pagingAndSortingInfo){
		List<SettingSummaryDTO> summaryDTOs = new ArrayList<SettingSummaryDTO>();
		
		StringBuffer orderby = new StringBuffer();
		
		if(!pagingAndSortingInfo.getSortingInfo().isEmpty()){
			Boolean keyInfo = pagingAndSortingInfo.getSortingInfo().get("key");
			if(null != keyInfo){
				orderby.append("order by key "+ (keyInfo?"asc":"desc"));
			}
			Boolean valueInfo = pagingAndSortingInfo.getSortingInfo().get("value");
			if(null != valueInfo){
				orderby.append(", value"+ (valueInfo?"asc":"desc"));
			}
		}
		
		String hql = "from Setting " + orderby.toString();
		
		List<Component> rs = getDao().queryByHQL(hql, pagingAndSortingInfo.getStart(),pagingAndSortingInfo.getLength());
		
		if(null != rs){
			for (Component component : rs) {
				Setting setting = (Setting) component;
				SettingSummaryDTO dto = new SettingSummaryDTO();
				dto.setDetailId(setting.getId());
				dto.setKey(setting.getKey());
				
				dto.setValue(setting.getValue());
				summaryDTOs.add(dto);
			}
			
		}
		
		return summaryDTOs;
	}

	@Override
	public long countSettings() {
		

		String hql = "select count(id) from Setting ";
		
		List<Object> rs= (List<Object>) getDao().queryByHQL(hql);
		
		
		return Long.valueOf(rs.get(0).toString());
	}

	@Override
	public List<SettingDTO> getAllSettings() {
		List<SettingDTO> summaryDTOs = new ArrayList<SettingDTO>();
		String hql = "from Setting ";
		
		List<Component> rs = getDao().queryByHQL(hql, 0, 999 );
		
		if(null != rs){
			for (Component component : rs) {
				Setting setting = (Setting) component;
				SettingDTO dto = new SettingDTO();
				dto.setDetailId(setting.getId());
				dto.setKey(setting.getKey());
				dto.setValue(setting.getValue());
				summaryDTOs.add(dto);
			}
		}
		
		return summaryDTOs;
	}

	@Override
	public SettingDTO save(SettingDTO settingDTO) {
		Setting setting = new Setting();
		setting.setId(settingDTO.getDetailId());
		setting.setKey(settingDTO.getKey());
		setting.setValue(settingDTO.getValue());
		
		setting = getDao().save(setting);
		
		settingDTO.setDetailId(setting.getId());
		
		return settingDTO;
	}

	@Override
	public SettingDTO byID(long id) {
		
		Setting setting = getDao().fetchById(id);
		
		SettingDTO dto = new SettingDTO();
		dto.setKey(setting.getKey());
		dto.setDetailId(setting.getId());
		dto.setValue(setting.getValue());
		
		return dto;
	}
	
}
