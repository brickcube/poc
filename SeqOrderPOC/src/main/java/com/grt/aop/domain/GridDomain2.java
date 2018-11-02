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
@Table(name="grid_domain2")

public class GridDomain2 extends GridDomain {
	private static final long serialVersionUID = -608617466494555565L;
	private String name;
	@Override
	public String toString() {
		return "GridDomain2 [name=" + name + ", seqOrder=" + seqOrder + "]";
	}
}
