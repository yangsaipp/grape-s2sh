package cn.com.dreamtech.service;

import java.util.List;

import cn.com.dreamtech.domain.SysUser;

public interface SysUserService {
	
	/**
	 * 增加
	 * @param sysUser
	 * @return
	 */
	SysUser insertSysUser(SysUser sysUser);
	
	/**
	 * 修改
	 * @param sysUser
	 * @return
	 */
	SysUser updateSysUser(SysUser sysUser);
	
	/**
	 * 删除
	 * @param sysUser
	 * @return
	 */
	boolean deleteSysUser(SysUser sysUser);
	
	/**
	 * 查询
	 * @return
	 */
	List<SysUser> queryUserList();
	
}
