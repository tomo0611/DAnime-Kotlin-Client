package jp.tomo0611.danime_client

import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.client.statement.*

class DAnimeClient {

    private val client = HttpClient()

    suspend fun greeting(): String {
        val response = client.get("https://animestore.docomo.ne.jp/animestore/rest/WS030101?partId=23972005")
        return response.bodyAsText()
    }
}