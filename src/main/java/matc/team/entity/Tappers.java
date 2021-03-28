package matc.team.entity;

import java.util.Objects;

/**
 * The type Tappers.
 */
public class Tappers {

    private int id;
    private String name;
    private String brewery;
    private String restaurant;
    private String notes;

    /**
     * Instantiates a new Tappers.
     */
    public Tappers() {
    }

    /**
     * Instantiates a new Tappers.
     *
     * @param id         the id
     * @param name       the name
     * @param brewery    the brewery
     * @param restaurant the restaurant
     * @param notes      the notes
     */
    public Tappers(int id, String name, String brewery, String restaurant, String notes) {
        this.id = id;
        this.name = name;
        this.brewery = brewery;
        this.restaurant = restaurant;
        this.notes = notes;
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

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
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

    /**
     * Gets notes.
     *
     * @return the notes
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets notes.
     *
     * @param notes the notes
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tappers tappers = (Tappers) o;
        return id == tappers.id && Objects.equals(name, tappers.name) && Objects.equals(brewery, tappers.brewery) && Objects.equals(restaurant, tappers.restaurant) && Objects.equals(notes, tappers.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, brewery, restaurant, notes);
    }
}
