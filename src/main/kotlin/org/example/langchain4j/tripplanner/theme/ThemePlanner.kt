package org.example.langchain4j.tripplanner.theme

import dev.langchain4j.agentic.Agent
import dev.langchain4j.service.UserMessage
import dev.langchain4j.service.V

interface ThemePlanner {

    @Agent("You are a professional theme suggesting agent.")
    @UserMessage("Recommend the top destination for {{theme}} in the state of {{state}} in {{country}}.")
    fun recommend(
        @V("theme") theme: String,
        @V("state") state: String,
        @V("country") country: String
    ): String?
}