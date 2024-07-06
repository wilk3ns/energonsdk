package com.kamran.energonsdk.core.models.repos

import com.kamran.energonsdk.core.models.entities.ChargerEntity
import java.util.UUID

interface ChargerRepo<ChargerEntity> : Repository<ChargerEntity> {
	@Throws(Exception::class)
	fun find(byId: UUID): ChargerEntity

	@Throws(Exception::class)
	fun find(byCid: String): ChargerEntity
}