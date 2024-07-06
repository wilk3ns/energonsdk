package com.kamran.energonsdk.core.models.entities

interface EvseEntity : EmbeddedEntityInterface {
	val id: Int?
	val code: String
	val status: String
	val price: String?
}