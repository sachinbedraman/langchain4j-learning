package org.example.langchain4j.tripplanner

import dev.langchain4j.model.googleai.GoogleAiGeminiChatModel
import dev.langchain4j.model.googleai.GoogleAiGeminiModelCatalog
import dev.langchain4j.service.AiServices
import org.example.langchain4j.common.APIKeys


fun main(args: Array<String>) {

    val model = GoogleAiGeminiChatModel.builder()
        .apiKey(APIKeys.GEMINI_API_KEY)
        .modelName("gemini-2.5-flash-lite")
        .temperature(0.1)// or gemini-1.5-pro
        .build()

    // 2. Create the TripPlanner service
    val planner: TripPlanner = AiServices.builder<TripPlanner>(TripPlanner::class.java)
        .chatModel(model)
        .build()


    // 3. Generate a plan
    val result: String? = planner.plan("Tokyo", "$2000", "Food and Tech culture")
    println(result)

}