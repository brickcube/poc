package com.grt.aop.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(
		callSuper = true
)
@Entity
@Table(name="entity_class")
public class EntityClass extends Domain {
	private static final long serialVersionUID = -2851471165542934013L;
	private String name;

	@OneToMany
	@JoinTable(name="grid_domain1")
	private List<GridDomain1> gridDomain1EntityList;
	@OneToMany
	@JoinTable(name="grid_domain2")
	private List<GridDomain2> gridDomain2EntityList;
	@OneToMany
	@JoinTable(name="grid_domain3")
	private List<GridDomain3> gridDomain3EntityList;
	@Override
	public String toString() {
		return "EntityClass [name=" + name + ", gridDomain1EntityList=" + gridDomain1EntityList
				+ ", gridDomain2EntityList=" + gridDomain2EntityList + ", gridDomain3EntityList="
				+ gridDomain3EntityList + "]";
	}

	
}
