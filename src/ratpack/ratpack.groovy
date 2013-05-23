import org.ratpackframework.groovy.templating.TemplateRenderer
import static org.ratpackframework.groovy.RatpackScript.ratpack

ratpack {
    handlers {
        get {
            response.redirect('index.html')
        }

        get("search") {
            def artist = request.queryParams.artist[0] ?: "Artist"
            def song = request.queryParams.song[0] ?: "Song"
            get(TemplateRenderer).render "search.html", artist: artist, song: song
        }

        assets "public"
    }
}


