package com.CompuderApps.boardfootcalculator;



/**
 * <h1>Part Class</h1>>
 * Class that holds all of the information about an individual piece.
 *
 * @version alpha
 * @since 06/2021
 */
public class Part {
    /** Part Name */
    private String Name;
    /** Part Length */
    private int Length;
    /** Part Width */
    private int Width;
    /** Part Thickness */
    private int Thickness;
    /** Part Quantity */
    private int Quantity;

    /**
     * Part Default Constructor. Initializes all measurements to 0
     *
     * @version alpha
     * @since 06/2021
     */
    public Part() {
        Name = "Part";
        Length = 0;
        Width = 0;
        Thickness = 0;
        Quantity = 0;
    }

    /**
     * Part Constructor. Initializes all measurements
     *
     * @version alpha
     * @since 06/2021
     */
    public Part(String name, int len, int wid, int thick, int quan) {
        Name = name;
        Length = len;
        Width = wid;
        Thickness = thick;
        Quantity = quan;
    }

    /**
     * Get the part name
     *
     * @version alpha
     * @since 06/2021
     */
    public String getName() {
        return Name;
    }

    /**
     * Set the part name
     *
     * @version alpha
     * @since 06/2021
     */
    public void setName(String name) {
        Name = name;
    }

    /**
     * Get the part length
     *
     * @version alpha
     * @since 06/2021
     */
    public int getLength() {
        return Length;
    }

    /**
     * Set the part length
     *
     * @version alpha
     * @since 06/2021
     */
    public void setLength(int len) {
        if (len > 0) {
            Length = len;
        }
    }

    /**
     * Get the part width
     *
     * @version alpha
     * @since 06/2021
     */
    public int getWidth() {
        return Width;
    }

    /**
     * Set the part width
     *
     * @version alpha
     * @since 06/2021
     */
    public void setWidh(int wid) {
        if (wid > 0) {
            Width = wid;
        }
    }

    /**
     * Get part thickness
     *
     * @version alpha
     * @since 06/2021
     */
    public int getThickness() {
        return Thickness;
    }

    /**
     * Set the part thickness
     *
     * @version alpha
     * @since 06/2021
     */
    public void setThickness(int thick) {
        if (thick > 0) {
            Thickness = thick;
        }
    }

    /**
     * Get the part quantity
     *
     * @version alpha
     * @since 06/2021
     */
    public int getQuantity() {
        return Quantity;
    }

    /**
     * Set the part quantity
     *
     * @version alpha
     * @since 06/2021
     */
    public void setQuantity(int quan) {
        if (quan > 0) {
            Quantity = quan;
        }
    }
}
