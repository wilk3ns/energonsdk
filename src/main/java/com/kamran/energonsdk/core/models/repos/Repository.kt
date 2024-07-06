package com.kamran.energonsdk.core.models.repos

interface Repository<T> {
	@Throws(Exception::class)
	fun list(): List<T>

	@Throws(Exception::class)
	fun upsert(element: T): T

	@Throws(Exception::class)
	fun upsert(collection: List<T>): List<T>

	@Throws(Exception::class)
	fun remove(element: T)

	@Throws(Exception::class)
	fun drop()
}