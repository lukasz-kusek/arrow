package arrow.core

inline fun <A> identity(a: A): A = a

@PublishedApi
internal object ArrowCoreInternalException : RuntimeException(
  "Arrow-Core internal error. Please let us know and create a ticket at https://github.com/arrow-kt/arrow-core/issues/new/choose",
  null
) {
  override fun fillInStackTrace(): Throwable = this
}

const val TailRecMDeprecation: String =
  "tailRecM is deprecated together with the Kind type classes since it's meant for writing kind-based polymorphic stack-safe programs."
