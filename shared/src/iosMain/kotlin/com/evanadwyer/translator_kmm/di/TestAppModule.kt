package com.evanadwyer.translator_kmm.di

import com.evanadwyer.translator_kmm.testing.FakeHistoryDataSource
import com.evanadwyer.translator_kmm.testing.FakeTranslateClient
import com.evanadwyer.translator_kmm.testing.FakeVoiceToTextParser
import com.evanadwyer.translator_kmm.translate.domain.translate.Translate
import com.evanadwyer.translator_kmm.voice_to_text.domain.VoiceToTextParser

class TestAppModule: AppModule {

    override val historyDataSource = FakeHistoryDataSource()
    override val client = FakeTranslateClient()
    override val translateUseCase = Translate(client, historyDataSource)
    override val voiceParser = FakeVoiceToTextParser()
}