package com.example.vrs.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "destinations")
public class Destination {

    @Id
    private long id;

    @OneToMany(mappedBy = "destination")
    @Nullable
    private List<Attraction> attractions = new ArrayList<>();

    @OneToMany(mappedBy = "destination")
    @Nullable
    private List<Hotel> hotels = new ArrayList<>();

    @OneToMany(mappedBy = "destination")
    @Nullable
    private List<Review> reviews = new ArrayList<>();

    @NotEmpty
    private String name;

    @NotEmpty
    private String weather;

    @NotEmpty
    private Long kidFriendlyScore;

    @NotEmpty
    private Long foodQualityScore;

    @NotEmpty
    private Long priceIndex;

    @NotEmpty
    private Long instagramAbilityScore;

    @NotEmpty
    private String nativeLanguage;

    @NotEmpty
    private String purpose;

    @NotEmpty
    private Long hotelQualityScore;

    @NotEmpty
    private String popularity;

    @NotEmpty
    private String recTripLength;

    @NotEmpty
    private String country;

    @NotEmpty
    private String continent;

    @NotEmpty
    private String currency;

    @NotEmpty
    private Long attractionScore;

    @NotEmpty
    private String safetyScore;

}
