package com.grt.aop.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(
		callSuper = true
)
@Table(name="grid_domain1")

@Entity
public class GridDomain1 extends GridDomain {
	private static final long serialVersionUID = -608617466494555565L;
	private String name;
	@Override
	public String toString() {
		return "GridDomain1 [name=" + name + ", seqOrder=" + seqOrder + "]";
	}
	
	
}
