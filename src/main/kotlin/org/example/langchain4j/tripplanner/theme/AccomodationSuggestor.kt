package org.example.langchain4j.tripplanner.theme

import dev.langchain4j.agentic.Agent
import dev.langchain4j.service.SystemMessage

interface AccomodationSuggestor {

    @Agent("You are a professional agent who suggests good resorts/hotels/accommodation.")
    @SystemMessage("Recommend a good resort/accommodation based on the theme input.")
    fun recommend(
        themeOutput: String?
    ): String?
}