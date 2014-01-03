import static ratpack.groovy.Groovy.groovyTemplate
import static ratpack.groovy.Groovy.ratpack

ratpack {
    handlers {

        get("search") {
            def artist = request.queryParams?.artist ?: "Artist"
            def song = request.queryParams?.song ?: "Song"
            render groovyTemplate("search.html", artist: artist, song: song)
        }

        assets "public", "index.html"
    }
}


