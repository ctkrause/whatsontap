package matc.team.entity;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.*;

/**
 * The type Tappers.
 */
@Entity(name = "Tappers")
@Table(name = "beers")
public class Tappers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    @Column(name = "description")
    private String description;

    @Column(name = "type_of_beer")
    private String beerType;

    @Column(name = "brewery")
    private String brewery;

    @Column(name = "location")
    private String restaurant;

    @Column(name = "date_on_tap")
    private LocalDate dateOnTap;

    /**
     * Instantiates a new Tappers.
     */
    public Tappers() {
    }


    /**
     * Instantiates a new Tappers.
     *
     * @param id the id
     */
    public Tappers(int id) {
        this.id = id;
    }

    /**
     * Generates tappers
     * @param description
     * @param beerType
     * @param brewery
     * @param restaurant
     * @param dateOnTap
     */
    public Tappers(String description, String beerType, String brewery, String restaurant, LocalDate dateOnTap) {
        this.description = description;
        this.beerType = beerType;
        this.brewery = brewery;
        this.restaurant = restaurant;
        this.dateOnTap = dateOnTap;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBeerType() {
        return beerType;
    }

    public void setBeerType(String beerType) {
        this.beerType = beerType;
    }

    /**
     * Gets brewery.
     *
     * @return the brewery
     */
    public String getBrewery() {
        return brewery;
    }

    /**
     * Sets brewery.
     *
     * @param brewery the brewery
     */
    public void setBrewery(String brewery) {
        this.brewery = brewery;
    }

    /**
     * Gets restaurant.
     *
     * @return the restaurant
     */
    public String getRestaurant() {
        return restaurant;
    }

    /**
     * Sets restaurant.
     *
     * @param restaurant the restaurant
     */
    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public LocalDate getDateOnTap() {
        return dateOnTap;
    }

    public void setDateOnTap(LocalDate dateOnTap) {
        this.dateOnTap = dateOnTap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tappers tappers = (Tappers) o;
        return id == tappers.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
