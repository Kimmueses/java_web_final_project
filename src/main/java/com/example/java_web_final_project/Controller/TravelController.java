package com.example.java_web_final_project.Controller;

import com.example.java_web_final_project.Models.Travel;
import com.example.java_web_final_project.Repo.TravelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/travel")
public class TravelController {

    @Autowired
    private TravelRepository travelRepository;

    // CRUD methods (Get, Post, Put, Delete)
    @GetMapping
    public List<Travel> getTravels() {
        return travelRepository.findAll();
    }

    @PostMapping
    public String saveTravel(@RequestBody Travel travel) {
        travelRepository.save(travel);
        return "Saved!";
    }
    @PutMapping
    public String updateTravel(@PathVariable int id, @RequestBody Travel travel) {
        Travel updatedTravel = travelRepository.findById(id).get();
        updatedTravel.setCountry(travel.getCountry());
        updatedTravel.setLandmark(travel.getLandmark());
        travelRepository.save(updatedTravel);
        return "Updated!";
    }

    @DeleteMapping
    public String deleteTravel(@PathVariable int id) {
        Travel deleteTravel = travelRepository.findById(id).get();
        travelRepository.delete(deleteTravel);
        return "Deleted travel with id: "+id;
    }


}

