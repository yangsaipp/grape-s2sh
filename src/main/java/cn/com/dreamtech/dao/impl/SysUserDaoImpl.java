package cn.com.dreamtech.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.com.dreamtech.dao.SysUserDao;
import cn.com.dreamtech.domain.SysUser;

public class SysUserDaoImpl extends HibernateDaoSupport implements SysUserDao {

	public SysUser insertSysUser(SysUser sysUser) {
		this.getHibernateTemplate().save(sysUser);
		return sysUser;
	}
	
}
