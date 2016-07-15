package com.wungong.commonmodelservice.model;

import java.util.UUID;

import com.datastax.driver.mapping.annotations.PartitionKey;
import com.datastax.driver.mapping.annotations.Table;

@Table(keyspace = "commonmodelservice", name = "skills")
public class Skill {
	
	@PartitionKey
	private UUID skillId;
	
	private String description;
	
	public Skill(UUID skillId) {
		this.skillId = skillId;
	}

	public UUID getSkillId() {
		return skillId;
	}

	public void setSkillId(UUID skillId) {
		this.skillId = skillId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
