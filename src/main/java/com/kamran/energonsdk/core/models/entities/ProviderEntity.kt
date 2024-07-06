package com.kamran.energonsdk.core.models.entities

import java.util.Date
import java.util.UUID

interface ProviderEntity : EntityInterface {

	val id: UUID?
	val modified: Date?
	val country: String
	val timeZone: String
	val vat: Int
	val type: String
	val code: String
	val name: String
	val operatorId: String
	val guestCustomerId:  UUID?
	val externalId: String
	val supportPhone: String
	val supportEmail: String
	val termsAndConditions: String
	val currency: String
	val disabled: Boolean?
}