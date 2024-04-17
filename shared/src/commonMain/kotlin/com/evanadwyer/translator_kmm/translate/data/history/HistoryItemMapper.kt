package com.evanadwyer.translator_kmm.translate.data.history

import com.evanadwyer.translator_kmm.translate.domain.history.HistoryItem
import database.HistoryEntity

fun HistoryEntity.toHistoryItem(): HistoryItem {
    return HistoryItem(
        id,
        fromLanguageCode,
        fromText,
        toLanguageCode,
        toText
    )
}