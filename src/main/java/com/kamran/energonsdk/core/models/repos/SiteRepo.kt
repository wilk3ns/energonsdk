package com.kamran.energonsdk.core.models.repos

import com.kamran.energonsdk.core.models.entities.SiteEntity
import java.util.UUID

interface SiteRepoSiteRepository<Entity : SiteEntity> : Repository<Entity> {
	@Throws(Exception::class)
	fun find(byId: UUID): Entity
}