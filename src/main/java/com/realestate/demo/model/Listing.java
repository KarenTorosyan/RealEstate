package com.realestate.demo.model;

import com.realestate.demo.security.CurrentUser;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "listing")
public class Listing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private String title;

    @Column
    private String keyword;

    @ManyToOne
    private Category category;

    @Column
    private String website;

    @Column
    private String locationAddress;

    @Column
    private String temporaryAddress;

    @ManyToOne
    private ListingCity listingCity;

    @ManyToOne
    private ListingState listingState;

    @Column
    private String country;

    @Column
    private int zipCode;

    @Column
    private String ownerName;

    @Column
    private String email;

    @Column
    private long phone;

    @Column
    private String website2;

    @Column
    private String ownerDesignation;

    @Column
    private String company;

    @Column
    private String facebookLink;

    @Column
    private String twitterUser;

    @Column
    private String googlePlus;

    @Column
    private String linkedIn;

    @Column
    private String description;

    @Column
    private String picUrl;

}
