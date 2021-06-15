package com.CompuderApps.boardfootcalculator;

public class Part {
    private String Name;
    private int Length;
    private int Width;
    private int Thickness;
    private int Quantity;

    public Part() {
        Length = 0;
        Width = 0;
        Thickness = 0;
    }

    public Part(String name, int len, int wid, int thick, int quan) {
        Name = name;
        Length = len;
        Width = wid;
        Thickness = thick;
        Quantity = quan;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getLength() {
        return Length;
    }

    public void setLength(int len) {
        if (len > 0) {
            Length = len;
        }
    }

    public int getWidth() {
        return Width;
    }

    public void setWidh(int wid) {
        if (wid > 0) {
            Width = wid;
        }
    }

    public int getThickness() {
        return Thickness;
    }

    public void setThickness(int thick) {
        if (thick > 0) {
            Thickness = thick;
        }
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quan) {
        if (quan > 0) {
            Quantity = quan;
        }
    }
}
