package com.grt.aop.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(
		callSuper = true
)
@Entity
@Table(name="grid_domain3")

public class GridDomain3 extends GridDomain {
	private static final long serialVersionUID = -608617466494555565L;
	private String name;
	@Override
	public String toString() {
		return "GridDomain3 [name=" + name + ", seqOrder=" + seqOrder + "]";
	}
}
