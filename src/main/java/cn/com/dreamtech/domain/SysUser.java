package cn.com.dreamtech.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * system user
 * @author Administrator
 *
 */
@Entity
@Table(name="user")
public class SysUser  implements Serializable {
	private static final long serialVersionUID = -4261859212616366346L;
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="class_no_id")
	private String id;
	private String name;
	private String password;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
