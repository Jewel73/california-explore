package com.jewel.ce.service;

import com.jewel.ce.domain.Tour;
import com.jewel.ce.domain.TourPackage;
import com.jewel.ce.repository.TourPackageRepository;
import com.jewel.ce.repository.TourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TourService {

    @Autowired
    private TourRepository tourRepository;

    @Autowired
    TourPackageRepository tourPackageRepository;

    public Tour createNewTour(Tour tour){

        TourPackage tourPackage = tourPackageRepository.findById(tour.getTourPackage().getCode())
                .orElseThrow(()-> new RuntimeException("tour package does not exist"));

        return tourRepository.save(tour);

    }

    public Iterable<Tour> lookup(){
        return tourRepository.findAll();
    }

    public long total(){
        return tourRepository.count();
    }


}
