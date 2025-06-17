package jp.tomo0611.danimeapiclient.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GetSearchSuggestResponse(
    // @SerialName("history") val history: String,
    @SerialName("suggestions") val suggestions: List<SearchSuggestion>
)

@Serializable
data class SearchSuggestion(
    @SerialName("keyword") val keyword: String,
    @SerialName("keyword_hl") val keyword_hl: String,
    @SerialName("meta") val meta: String,
    @SerialName("weight") val weight: Int
)