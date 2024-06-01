package com.esosaphilip.aichatapp.presentation

import androidx.lifecycle.ViewModel
import com.google.ai.client.generativeai.type.content

class AiViewModel(private val aiModel: AiModel ): ViewModel() {
    suspend fun aiHistory(aiText: String, userText: String) {
        val chatHistory = listOf(
                content(role = "user") { text(userText) },
                content(role = "model") { text(aiText)  }
        )

        val chat = aiModel.model.startChat(chatHistory)
        val response = chat.sendMessage("How many paws are in my house?")
    }
}