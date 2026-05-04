package org.example.langchain4j.gemini

import dev.langchain4j.model.chat.ChatModel
import dev.langchain4j.model.googleai.GoogleAiGeminiChatModel
import org.example.langchain4j.common.APIKeys

class SimpleGeminiChat {

    fun simpleGeminiChat() {

        val chatModel: ChatModel = GoogleAiGeminiChatModel
            .builder()
            .apiKey(APIKeys.GEMINI_API_KEY)
            .modelName("gemini-2.5-flash-lite")
            .build();

        val response: String? = chatModel.chat("What is the capital of France?")

        println(response)
    }
}

fun main(args: Array<String>) {

    SimpleGeminiChat().simpleGeminiChat()

}