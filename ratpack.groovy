import static org.ratpackframework.groovy.templating.Template.groovyTemplate
import static org.ratpackframework.groovy.RatpackScript.ratpack

ratpack {
    handlers {
        get {
            response.redirect('index.html')
        }

        get("search") {
            def artist = request.queryParams?.artist ?: "Artist"
            def song = request.queryParams?.song ?: "Song"
            render groovyTemplate("search.html", artist: artist, song: song)
        }

        assets "public"
    }
}


