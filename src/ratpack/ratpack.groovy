import org.ratpackframework.app.*
import org.ratpackframework.groovy.app.Routing

(this as Routing).with {

	get('/') { Request request, Response response ->
		response.redirect('index.html')
	}

    get('/search') { Request request, Response response ->
        def artist = request.queryParams.artist[0] ?: "Artist"
        def song = request.queryParams.song[0] ?: "Song"
        response.render "search.html", artist: artist, song: song
    }
}
