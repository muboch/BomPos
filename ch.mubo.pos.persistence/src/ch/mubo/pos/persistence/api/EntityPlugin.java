package ch.mubo.pos.persistence.api;

import java.util.UUID;

import javax.persistence.PrePersist;

public class EntityPlugin {
	@PrePersist
	public void prePersist(EntityObject entityObject) {
		String actualId = entityObject.getId();
		if (actualId == null || actualId.isEmpty()) {
			entityObject.setId(UUID.randomUUID().toString());
		}
	}
}
