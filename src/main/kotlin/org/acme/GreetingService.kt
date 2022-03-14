package org.acme

import io.quarkus.cache.CacheResult
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class GreetingService {

    @CacheResult(cacheName = "names")
    suspend fun sayMyName(): String {
        return "Dirk"
    }
}