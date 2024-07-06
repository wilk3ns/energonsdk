package com.kamran.energonsdk.core.models.repos

import com.kamran.energonsdk.core.models.entities.ProviderEntity
import java.util.UUID

interface ProviderRepo<Entity : ProviderEntity> : Repository<Entity> {
	@Throws(Exception::class)
	fun find(byId: UUID): Entity
}