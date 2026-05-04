package org.example.langchain4j.tripplanner

import dev.langchain4j.agent.tool.Tool

public class TripTools {

    class TripTools {
        @Tool("Generate a day-by-day travel itinerary for the user.")
        fun generateItinerary(city: String, days: Int, interest: String?): String {
            // Logic to fetch or build a basic plan
            return "Day 1: Sightseeing in " + city + "..."
        }
    }

}