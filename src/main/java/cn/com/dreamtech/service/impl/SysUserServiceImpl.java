package cn.com.dreamtech.service.impl;

import java.util.List;

import cn.com.dreamtech.dao.SysUserDao;
import cn.com.dreamtech.domain.SysUser;
import cn.com.dreamtech.service.SysUserService;

public class SysUserServiceImpl implements SysUserService {
	private SysUserDao sysUserDao;

	public boolean deleteSysUser(SysUser sysUser) {
		return false;
	}

	public SysUser insertSysUser(SysUser sysUser) {
		return sysUserDao.insertSysUser(sysUser);
	}

	public List<SysUser> queryUserList() {
		return null;
	}

	public SysUser updateSysUser(SysUser sysUser) {
		return null;
	}
	
	public SysUserDao getSysUserDao() {
		return sysUserDao;
	}

	public void setSysUserDao(SysUserDao sysUserDao) {
		this.sysUserDao = sysUserDao;
	}
}
