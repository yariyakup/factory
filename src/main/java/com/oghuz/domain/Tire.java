package com.oghuz.domain;

public abstract class Tire {
    private String tireType;
    private Float tireWidth;
    private Float aspectRatio;
    private Float diameter;

     Tire(String tireType, Float tireWidth, Float aspectRatio, Float diameter) {
        this.tireType = tireType;
        this.tireWidth = tireWidth;
        this.aspectRatio = aspectRatio;
        this.diameter = diameter;
    }

    public String getTireType() {
        return tireType;
    }

    public void setTireType(String tireType) {
        this.tireType = tireType;
    }

    public Float getTireWidth() {
        return tireWidth;
    }

    public void setTireWidth(Float tireWidth) {
        this.tireWidth = tireWidth;
    }

    public Float getAspectRatio() {
        return aspectRatio;
    }

    public void setAspectRatio(Float aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    public Float getDiameter() {
        return diameter;
    }

    public void setDiameter(Float diameter) {
        this.diameter = diameter;
    }
}
