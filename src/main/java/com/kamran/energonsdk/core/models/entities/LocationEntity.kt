package com.kamran.energonsdk.core.models.entities

interface LocationEntity : EntityInterface {

	val id: String
	val address: String
	val postalCode: String
	val city: String
	val latitude: Double?
	val longitude: Double?
}