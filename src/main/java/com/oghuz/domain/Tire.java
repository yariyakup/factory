package com.oghuz.domain;

public abstract class Tire {
    private String tireType;
    private Short tireWidth;
    private Short aspectRatio;
    private Short diameter;

    public Tire(String tireType, Short tireWidth, Short aspectRatio, Short diameter) {
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

    public Short getTireWidth() {
        return tireWidth;
    }

    public void setTireWidth(Short tireWidth) {
        this.tireWidth = tireWidth;
    }

    public Short getAspectRatio() {
        return aspectRatio;
    }

    public void setAspectRatio(Short aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    public Short getDiameter() {
        return diameter;
    }

    public void setDiameter(Short diameter) {
        this.diameter = diameter;
    }
}
