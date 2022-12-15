package com.example.java_web_final_project.Service;

import com.example.java_web_final_project.Repo.TravelRepository;
import org.springframework.stereotype.Service;

@Service
public class TravelService {
    private final TravelRepository travelRepository;


    public TravelService(TravelRepository travelRepository) {
        this.travelRepository = travelRepository;
    }
}
