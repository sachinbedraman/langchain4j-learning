package org.example.langchain4j.common

class APIKeys {
    companion object {
        val GEMINI_API_KEY: String = System.getenv("GOOGLE_AI_GEMINI_API_KEY") ?: ""
    }
}