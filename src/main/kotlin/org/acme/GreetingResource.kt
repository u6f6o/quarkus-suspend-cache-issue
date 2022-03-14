package org.acme

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/hello")
class GreetingResource(
    val greetingService: GreetingService
) {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    suspend fun hello(): String {
        return "Hello ${greetingService.sayMyName()}"
    }
}