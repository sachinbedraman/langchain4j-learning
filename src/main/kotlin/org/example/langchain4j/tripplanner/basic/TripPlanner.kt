package org.example.langchain4j.tripplanner.basic

import dev.langchain4j.service.SystemMessage
import dev.langchain4j.service.UserMessage
import dev.langchain4j.service.V

interface TripPlanner {

    @SystemMessage("You are a professional travel agent.")
    @UserMessage("Plan a trip to {{destination}}, with a budget of {{budget}}, and interests {{interests}}.")
    fun plan(@V("destination") destination: String,
             @V("budget") budget: String,
             @V("interests") interests: String): String?
}