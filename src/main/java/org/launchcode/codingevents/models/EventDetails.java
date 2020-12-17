package org.launchcode.codingevents.models;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Time;
import java.util.Date;

/**
 * Created by Chris Bay
 */
@Entity
public class EventDetails extends AbstractEntity {

    @NotBlank(message= "Event name is required")
    private String eventName;

    @NotBlank(message= "Bride's name is required")
    private String brideName;

    @NotBlank(message= "Groom's first name is required")
    private String groomName;

    @NumberFormat
    private int phoneNumber;
    @Email(message = "Invalid email. Try again.")
    private String contactEmail;

    @DateTimeFormat
    private Date eventDate;
    @DateTimeFormat
    private Time startTime;
    @DateTimeFormat
    private Time endTime;
    private String ceremonyType;
    private String ceremonyLocation;
    private String receptionLocation;



    private String officiant;
    private String ceremonyMusician;
    private String receptionMusician;
    private String photographer;
    private String videographer;
    private String florist;
    private String caterer;
    private String stationery;
    private String hairStylist;
    private String makeupArtist;
    private String seamstress;
    private String tent;
    private String decor;
    private String rentals;
    private String others;

    @OneToOne(cascade = CascadeType.ALL)
    @Valid
    @NotNull
    private EventEntourage eventEntourage;


    @Size(max = 500, message = "Description too long!")
    private String description;


    public EventDetails(@NotBlank(message="Event Name is required") String eventName, @NotBlank(message = "Bride's name is required") String brideName, @NotBlank(message = "Groom's name is required") String groomName, int phoneNumber, @Email(message = "Invalid email. Try again.") String contactEmail, Date eventDate, Time startTime, Time endTime, String ceremonyType, String ceremonyLocation, String officiant, String receptionLocation, String ceremonyMusician, String receptionMusician, String photographer, String videographer, String florist, String caterer, String stationery, String hairStylist, String makeupArtist, String seamstress, String tent, String decor, String rentals, String others, @Valid @NotNull EventEntourage eventEntourage, @Size(max = 500, message = "Description too long!") String description) {
        this.eventName = eventName;
        this.brideName = brideName;
        this.groomName = groomName;
        this.phoneNumber = phoneNumber;
        this.contactEmail = contactEmail;
        this.eventDate = eventDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.ceremonyType = ceremonyType;
        this.ceremonyLocation = ceremonyLocation;
        this.officiant = officiant;
        this.receptionLocation = receptionLocation;
        this.ceremonyMusician = ceremonyMusician;
        this.receptionMusician = receptionMusician;
        this.photographer = photographer;
        this.videographer = videographer;
        this.florist = florist;
        this.caterer = caterer;
        this.stationery = stationery;
        this.hairStylist = hairStylist;
        this.makeupArtist = makeupArtist;
        this.seamstress = seamstress;
        this.tent = tent;
        this.decor = decor;
        this.rentals = rentals;
        this.others = others;
        this.eventEntourage = eventEntourage;
        this.description = description;
    }

    public EventDetails() {}

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getBrideName() {
        return brideName;
    }

    public void setBrideName(String brideName) {
        this.brideName = brideName;
    }

    public String getGroomName() {
        return groomName;
    }

    public void setGroomName(String groomName) {
        this.groomName = groomName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    public String getCeremonyType() {
        return ceremonyType;
    }

    public void setCeremonyType(String ceremonyType) {
        this.ceremonyType = ceremonyType;
    }

    public String getCeremonyLocation() {
        return ceremonyLocation;
    }

    public void setCeremonyLocation(String ceremonyLocation) {
        this.ceremonyLocation = ceremonyLocation;
    }

    public String getOfficiant() {
        return officiant;
    }

    public void setOfficiant(String officiant) {
        this.officiant = officiant;
    }

    public String getReceptionLocation() {
        return receptionLocation;
    }

    public void setReceptionLocation(String receptionLocation) {
        this.receptionLocation = receptionLocation;
    }

    public String getCeremonyMusician() {
        return ceremonyMusician;
    }

    public void setCeremonyMusician(String ceremonyMusician) {
        this.ceremonyMusician = ceremonyMusician;
    }

    public String getReceptionMusician() {
        return receptionMusician;
    }

    public void setReceptionMusician(String receptionMusician) {
        this.receptionMusician = receptionMusician;
    }

    public String getPhotographer() {
        return photographer;
    }

    public void setPhotographer(String photographer) {
        this.photographer = photographer;
    }

    public String getVideographer() {
        return videographer;
    }

    public void setVideographer(String videographer) {
        this.videographer = videographer;
    }

    public String getFlorist() {
        return florist;
    }

    public void setFlorist(String florist) {
        this.florist = florist;
    }

    public String getCaterer() {
        return caterer;
    }

    public void setCaterer(String caterer) {
        this.caterer = caterer;
    }

    public String getStationery() {
        return stationery;
    }

    public void setStationery(String stationery) {
        this.stationery = stationery;
    }

    public String getHairStylist() {
        return hairStylist;
    }

    public void setHairStylist(String hairStylist) {
        this.hairStylist = hairStylist;
    }

    public String getMakeupArtist() {
        return makeupArtist;
    }

    public void setMakeupArtist(String makeupArtist) {
        this.makeupArtist = makeupArtist;
    }

    public String getSeamstress() {
        return seamstress;
    }

    public void setSeamstress(String seamstress) {
        this.seamstress = seamstress;
    }

    public String getTent() {
        return tent;
    }

    public void setTent(String tent) {
        this.tent = tent;
    }

    public String getDecor() {
        return decor;
    }

    public void setDecor(String decor) {
        this.decor = decor;
    }

    public String getRentals() {
        return rentals;
    }

    public void setRentals(String rentals) {
        this.rentals = rentals;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    public EventEntourage getEventEntourage() {
        return eventEntourage;
    }

    public void setEventEntourage(EventEntourage eventEntourage) {
        this.eventEntourage = eventEntourage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
