package com.lsq.entity;

public class Point {
    private String point_code;
    private String point_type;

    public String getPoint_code() {
        return point_code;
    }

    public void setPoint_code(String point_code) {
        this.point_code = point_code;
    }

    public String getPoint_type() {
        return point_type;
    }

    public void setPoint_type(String point_type) {
        this.point_type = point_type;
    }

    @Override
    public String toString() {
        return "Point{" +
                "point_code='" + point_code + '\'' +
                ", point_type='" + point_type + '\'' +
                '}';
    }
}
