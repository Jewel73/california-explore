package com.jewel.ce.service;

import com.jewel.ce.domain.TourPackage;
import com.jewel.ce.repository.TourPackageRepository;
import org.springframework.stereotype.Service;

@Service
public class TourPackageService {

    private TourPackageRepository tourPackageRepository;

    TourPackageService(TourPackageRepository tourPackageRepository){
        this.tourPackageRepository = tourPackageRepository;
    }


    public TourPackage createNewTourPackage(TourPackage tourPackage){
        return tourPackageRepository.findById(tourPackage.getCode())
                .orElse(tourPackageRepository.save(tourPackage));
    }

    public Iterable<TourPackage> lookup(){
        return tourPackageRepository.findAll();
    }

    public long total(){return tourPackageRepository.count();}

}
