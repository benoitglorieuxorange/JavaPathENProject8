package com.openclassrooms.tourguide.dto;

import gpsUtil.location.Location;

public record CloseToAttractionDto(
        String attractionName,
        Location attractionLocation,
        Location userLocation,
        Double distance,
        Integer rewardPoints
) {}