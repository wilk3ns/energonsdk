package com.kamran.energonsdk.core.models.entities

import java.util.Date
import java.util.UUID

interface SiteEntity : EntityInterface {

	val id: UUID?
	val modified: Date?
	val created: Date?
	val customerId: UUID?
	val name: String
	val attributes: String
	val location: LocationEntity?
	val accessibility: String
	val activeStart: Date
	val activeEnd: Date
	val active: String?
	val providerId: UUID?
	val customerName: String
}