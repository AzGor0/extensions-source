package eu.kanade.tachiyomi.animeextension.ar.witanime

import eu.kanade.tachiyomi.animesource.model.SAnime
import eu.kanade.tachiyomi.animesource.online.ParsedAnimeHttpSource
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element

class WitAnime : ParsedAnimeHttpSource() {
    override val name = "WIT ANIME"
    override val baseUrl = "https://witanime.day"
    override val lang = "ar"
    override val supportsLatest = true

    // Placeholder functions to allow it to compile
    override fun animeDetailsParse(document: Document): SAnime = throw Exception("Not used")
    override fun latestUpdatesFromElement(element: Element): SAnime = throw Exception("Not used")
    override fun latestUpdatesNextPageSelector(): String? = null
    override fun latestUpdatesSelector(): String = "div.anime-card-container"
    override fun popularAnimeFromElement(element: Element): SAnime = throw Exception("Not used")
    override fun popularAnimeNextPageSelector(): String? = null
    override fun popularAnimeSelector(): String = "div.anime-card-container"
    override fun searchAnimeFromElement(element: Element): SAnime = throw Exception("Not used")
    override fun searchAnimeNextPageSelector(): String? = null
    override fun searchAnimeSelector(): String = "div.anime-card-container"
}
