package jp.tomo0611.danimeapiclient.data

import jp.tomo0611.danimeapiclient.model.GetSearchSuggestResponse
import jp.tomo0611.danimeapiclient.network.DAnimeSuggestApiService

interface DAnimeClientRepository {
    suspend fun getSearchSuggests(
        query: String
    ): GetSearchSuggestResponse
}

class NetworkDAnimeClientRepository(
    private val danimeSuggestApiService: DAnimeSuggestApiService
) : DAnimeClientRepository {
    override suspend fun getSearchSuggests(
        query: String
    ): GetSearchSuggestResponse = danimeSuggestApiService.getSearchSuggests(query)
}