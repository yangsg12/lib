package com.progrom.design;

/**
 * Created with IntelliJ IDEA.
 * User: Yang
 * Date: 13-7-9
 * Time: 下午4:02
 * To change this template use File | Settings | File Templates.
 */
public class Body {
    private long idNum;
    private String name = "<unnamed>";
    private Body orbits = null;

    private static long nextID = 0;

    public long getIdNum() {
        return idNum;
    }

    public void setIdNum(long idNum) {
        this.idNum = idNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Body getOrbits() {
        return orbits;
    }

    public void setOrbits(Body orbits) {
        this.orbits = orbits;
    }
}
