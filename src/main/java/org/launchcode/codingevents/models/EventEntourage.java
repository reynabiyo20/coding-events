package org.launchcode.codingevents.models;
import javax.persistence.Entity;

@Entity
public class EventEntourage extends AbstractEntity{

    private String mOBName;
    private String fOBName;
    private String maidOfHonor;
    private String bestMan;
    private String bridesMaid;
    private String groomsMen;
    private String juniorFlowerGirl;
    private String flowerGirl;
    private String RingBearer;
    private String usher;

    public EventEntourage(String mOBName, String fOBName, String maidOfHonor, String bestMan, String bridesMaid, String groomsMen, String juniorFlowerGirl, String flowerGirl, String ringBearer, String usher) {
        this.mOBName = mOBName;
        this.fOBName = fOBName;
        this.maidOfHonor = maidOfHonor;
        this.bestMan = bestMan;
        this.bridesMaid = bridesMaid;
        this.groomsMen = groomsMen;
        this.juniorFlowerGirl = juniorFlowerGirl;
        this.flowerGirl = flowerGirl;
        RingBearer = ringBearer;
        this.usher = usher;
    }

    public String getmOBName() {
        return mOBName;
    }

    public void setmOBName(String mOBName) {
        this.mOBName = mOBName;
    }

    public String getfOBName() {
        return fOBName;
    }

    public void setfOBName(String fOBName) {
        this.fOBName = fOBName;
    }

    public String getMaidOfHonor() {
        return maidOfHonor;
    }

    public void setMaidOfHonor(String maidOfHonor) {
        this.maidOfHonor = maidOfHonor;
    }

    public String getBestMan() {
        return bestMan;
    }

    public void setBestMan(String bestMan) {
        this.bestMan = bestMan;
    }

    public String getBridesMaid() {
        return bridesMaid;
    }

    public void setBridesMaid(String bridesMaid) {
        this.bridesMaid = bridesMaid;
    }

    public String getGroomsMen() {
        return groomsMen;
    }

    public void setGroomsMen(String groomsMen) {
        this.groomsMen = groomsMen;
    }

    public String getJuniorFlowerGirl() {
        return juniorFlowerGirl;
    }

    public void setJuniorFlowerGirl(String juniorFlowerGirl) {
        this.juniorFlowerGirl = juniorFlowerGirl;
    }

    public String getFlowerGirl() {
        return flowerGirl;
    }

    public void setFlowerGirl(String flowerGirl) {
        this.flowerGirl = flowerGirl;
    }

    public String getRingBearer() {
        return RingBearer;
    }

    public void setRingBearer(String ringBearer) {
        RingBearer = ringBearer;
    }

    public String getUsher() {
        return usher;
    }

    public void setUsher(String usher) {
        this.usher = usher;
    }
}
