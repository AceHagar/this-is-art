package com.odnt.thisisart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("artworks/")
public class ArtController {

    private static List<String> artworks = new ArrayList<>();

    @GetMapping()
    public String displayAllArt(Model model){
        model.addAttribute("title", "All Art");
       model.addAttribute("artworks", artworks);
        return "artworks/index";
    }


    // lives at artworks/create
    @GetMapping("create")
    public String renderAddArtworks(Model model){
        model.addAttribute("title", "Add Artwork");
        return "artworks/create";
    }

    @PostMapping("create")
    public String addNewArtwork(@RequestParam String artworkName) {
        artworks.add(artworkName);
        return "redirect:";
    }

//    @GetMapping("art-works")
//    public String artWorkList(Model model) {
//        List<String> artWorks = new ArrayList<>();
//        artWorks.add("Wally");
//        artWorks.add("Mom");
//        artWorks.add("Nature");
//        model.addAttribute("artWorks", artWorks);
//        return "art-list";
//    }



}
