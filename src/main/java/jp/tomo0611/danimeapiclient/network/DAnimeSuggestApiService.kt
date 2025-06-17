package jp.tomo0611.danimeapiclient.network

import jp.tomo0611.danimeapiclient.model.GetSearchSuggestResponse
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface DAnimeSuggestApiService {

    @GET("suggest")
    suspend fun getSearchSuggests(
        @Query("q") query: String,
        @Query("uid") uid: String = "anime",
        @Query("type") type: Int = 17,
        @Header("User-Agent") userAgent: String = "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:141.0) Gecko/20100101 Firefox/141.0"
    ): GetSearchSuggestResponse

}