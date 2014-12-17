package cn.com.dreamtech.actions;

import java.io.File;

import cn.com.dreamtech.service.SysUserService;

public class SysUserAction {
	private SysUserService sysUserService;
	private File file;
	
	public SysUserService getSysUserService() {
		return sysUserService;
	}

	public void setSysUserService(SysUserService sysUserService) {
		this.sysUserService = sysUserService;
	}

	public String list() {
		//SysUser user = new SysUser();
		//System.out.println(sysUserService.insertSysUser(user));
		System.out.println(file.getPath());
		System.out.println(file.getName());
		return "success";
	}

	public void setFile(File file) {
		this.file = file;
	}

	public File getFile() {
		
		
		return file;
	}
	
}
