package com.kamran.energonsdk.core.models.entities

import java.util.Date

interface ConnectorEntity: EmbeddedEntityInterface {
	val id: Int?
	val evseId: Int?
	val type: String?
	val power: Int?
	val status: String
	val info: String?
}