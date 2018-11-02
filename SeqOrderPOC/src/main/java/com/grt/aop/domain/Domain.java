package com.grt.aop.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;

@MappedSuperclass
public class Domain implements Serializable {
	private static final long serialVersionUID = -4733053783651501405L;
	@Id
	@GeneratedValue(
			generator = "uuid2"
	)
	@GenericGenerator(
			name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator"
	)
	protected String id;
	protected Date createDate;
	protected String createdBy;
	protected Date updateDate;
	protected String updatedBy;
}
