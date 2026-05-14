package org.example.langchain4j.tripplanner.theme

import dev.langchain4j.model.googleai.GoogleAiGeminiChatModel
import dev.langchain4j.service.AiServices
import org.example.langchain4j.common.APIKeys

fun main(args: Array<String>) {

    val model = GoogleAiGeminiChatModel.builder()
        .apiKey(APIKeys.GEMINI_API_KEY)
        .modelName("gemini-2.5-flash-lite")
        .temperature(0.1)// or gemini-1.5-pro
        .build()

    val planner: ThemePlanner = AiServices.builder(ThemePlanner::class.java)
        .chatModel(model)
        .build()


    val themeResult: String? = planner.recommend("Wildlife", "Karnataka", "India")
    println(themeResult)

    println("<<<<<<<<< ------------------------- >>>>>>>>")

    val accommodationSuggestor: AccomodationSuggestor = AiServices.builder(AccomodationSuggestor::class.java)
        .chatModel(model)
        .build()

    val accommodationResult = accommodationSuggestor.recommend(themeResult)
    println(accommodationResult)


}