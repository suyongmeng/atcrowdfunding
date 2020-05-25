package com.sym.crowd.service.impl;

import java.util.List;

import com.sym.crowd.entity.Menu;
import com.sym.crowd.entity.MenuExample;
import com.sym.crowd.mapper.MenuMapper;
import com.sym.crowd.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MenuServiceImpl implements MenuService {
	
	@Autowired
	private MenuMapper menuMapper;

	@Override
	public List<Menu> getAll() {
		return menuMapper.selectByExample(new MenuExample());
	}

	@Override
	public void saveMenu(Menu menu) {
		menuMapper.insert(menu);
	}

	@Override
	public void updateMenu(Menu menu) {
		
		// 由于pid没有传入，一定要使用有选择的更新，保证“pid”字段不会被置空
		menuMapper.updateByPrimaryKeySelective(menu);
	}

	@Override
	public void removeMenu(Integer id) {
		menuMapper.deleteByPrimaryKey(id);
	}

}
