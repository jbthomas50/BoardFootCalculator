package com.CompuderApps.boardfootcalculator;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Project class</h1>
 * Keep track of all the different components associated with the same project.
 * Will be able to hold as many parts as the user desires. Also stores a project
 * name.
 *
 * @version alpha
 * @since 06/2021
 */
public class Project {
    /** Parts List - List of the parts in the project*/
    private List<Part> PartsList;
    /** Name - Name of the project*/
    private String Name;

    /**
     * Default Project class constructor.
     *
     * @version alpha
     * @since 06/2021
     */
    public Project() {
        Name = "No Name";
        PartsList = new ArrayList<Part>();
    }

    /**
     * Project class constructor. Sets {@link com.CompuderApps.boardfootcalculator.Project#PartsList}.
     *
     * @param parts The list of parts in the project
     *
     * @version alpha
     * @since 06/2021
     */
    public Project (List<Part> parts) {
        Name = "No Name";
        PartsList = new ArrayList<Part>(parts);
    }

    /**
     * Project class constructor. Sets {@link com.CompuderApps.boardfootcalculator.Project#PartsList} and {@link com.CompuderApps.boardfootcalculator.Project#Name}.
     *
     * @param parts The list of parts in the project
     * @param name The name of the project
     *
     * @version alpha
     * @since 06/2021
     */
    public Project (List<Part> parts, String name) {
        Name = name;
        PartsList = new ArrayList<Part>(parts);
    }

    /**
     * Get a specific part from the parts list
     *
     * @param pos The index of the part to get from the list of parts.
     *
     * @version alpha
     * @since 06/2021
     */
    public Part getPart(int pos) {
        return PartsList.get(pos);
    }

    /**
     * Get the number of parts contained in the project's part list.
     *
     * @version alpha
     * @since 06/2021
     */
    public int getNumParts() {
        return PartsList.size();
    }

    /**
     * Add the part passed in to the project's existing part list.
     *
     * @param part The part to be added to the project's part list.
     *
     * @version alpha
     * @since 06/2021
     */
    public void addPart(Part part) {
        if (part != null) {
            PartsList.add(part);
        }
    }

    /**
     * Add a group of parts to the project's existing part list.
     *
     * @param parts The group of parts to be added to the project's part list.
     *
     * @version alpha
     * @since 06/2021
     */
    public void addParts (List<Part> parts) {
        if (parts != null) {
            PartsList.addAll(parts);
        }
    }

    /**
     * Get the project's name
     *
     * @version alpha
     * @since 06/2021
     */
    public String getName () {
        return Name;
    }

    /**
     * Set the project's name
     *
     * @param name The string to set the project's name to.
     *
     * @version alpha
     * @since 06/2021
     */
    public void setName (String name) {
        if (!name.isEmpty()) {
            Name = name;
        }
    }

}
