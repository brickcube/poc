package com.grt.aop.domain;

import javax.persistence.MappedSuperclass;

import lombok.Data;
import lombok.EqualsAndHashCode;

@MappedSuperclass
@Data
@EqualsAndHashCode(callSuper=true)
public abstract class GridDomain extends Domain {
	private static final long serialVersionUID = -3017168866723059794L;
	protected Integer seqOrder;
	@Override
	public String toString() {
		return "GridDomain [seqOrder=" + seqOrder + "]";
	}

}
