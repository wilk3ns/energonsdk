package com.kamran.energonsdk.core.models.entities

import java.util.Date
import java.util.UUID

interface ChargerEntity : EntityInterface {
	val id: UUID?
	val modified: Date?
	val created: Date?
	val closed: Date?
	val siteId: UUID?
	val cid: String
	val name: String
	val type: String
	val maximumPower: Int?
	val units: Double?
	val lastBoot: Date?
	val lastSeen: Date?
	val public: Boolean?
	val allowGuests: Boolean?
	val evses: List<EvseEntity>?
	val connectors: List<ConnectorEntity>?
	val state: String
	val siteName: String
	val siteCustomerId: UUID?
	val providerId: UUID?
	val providerCurrency: String
	val providerVat: Int?
	val providerOperatorId: String
	val providerGuestCustomerId: UUID?
}