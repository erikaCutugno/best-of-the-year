package org.lessons.best.year.java.best_of_the_year.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/")
public class IntroController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("name", "Erika");
        return "index"; 
      
    }
    @GetMapping("/movies")
    public String movies(Model model) {
       String title = "";
       for (Movie movie : getBestMovies()) {
           title += movie.getTitle() + ", ";
       }
       title = title.substring(0, title.length() - 2);
       model.addAttribute("category", "Movies");
       model.addAttribute("title", title);
       return "stringList";
    }
@GetMapping("/songs")
    public String songs(Model model) {
        String title = "";
        for (Song song : getBestSongs()) {
            title += song.getTitle() + ", ";
        }
        title = title.substring(0, title.length() - 2);
        model.addAttribute("category", "Songs");
        model.addAttribute("title", title);
        return "stringList";
    }
   private List<Movie> getBestMovies() {
        List<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("The Shawshank Redemption", 1));
        list.add(new Movie("The Godfather", 2));
        list.add(new Movie("The Dark Knight", 3));
        list.add(new Movie("Pulp Fiction", 4));
        list.add(new Movie("Forrest Gump", 5));
        return list;
    }
    private List<Song> getBestSongs() {
        List<Song> list = new ArrayList<Song>();
        list.add(new Song("Bohemian Rhapsody", 1));
        list.add(new Song("Stairway to Heaven", 2));
        list.add(new Song("Hotel California", 3));
        list.add(new Song("Imagine", 4));
        list.add(new Song("Hey Jude", 5));
        return list;

}
        
    }
