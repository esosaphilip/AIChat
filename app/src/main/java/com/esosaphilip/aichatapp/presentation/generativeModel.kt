package com.esosaphilip.aichatapp.presentation

import com.google.ai.client.generativeai.BuildConfig
import com.google.ai.client.generativeai.GenerativeModel
import com.google.ai.client.generativeai.type.content


class AiModel() {

    val model = GenerativeModel(
        // The Gemini 1.5 models are versatile and work with multi-turn conversations (like chat)
        modelName = "gemini-1.5-pro",
        systemInstruction = content {
            text("Android theory explained with examples " +
                "and analogy. with special insight to behaivour" +
                " of components explained also.")
                                    },

        // Access your API key as a Build Configuration variable (see "Set up your API key" above)
        apiKey = BuildConfig.API_KEY
    )

}




