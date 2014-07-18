package com.epam.webparsers.logic;

import com.epam.airline.planes.Airliner;
import com.epam.airline.planes.Fighter;
import com.epam.airline.planes.Plane;

import java.util.Map;

/**
 * Created by ivan on 7/16/14.
 */
public class PlaneWrapper {
    private Plane plane;

    public Map<Fighter.WeaponType, Integer> getWeaponsOnBoard() {
        if (plane instanceof Fighter) {
            return ((Fighter) plane).getWeaponsOnBoard();
        }else {
            return null;
        }
    }

    public Integer getCrewAmount() {
        if (plane instanceof Airliner) {
            return ((Airliner) plane).getCrewAmount();
        } else {
            return null;
        }
    }

    public Integer getPassengersAmount() {
        if (plane instanceof Airliner) {
            return ((Airliner) plane).getPassengersAmount();
        } {
            return null;
        }
    }

    public String getName() {
        return plane.getName();
    }

    public float getWingspan() {
        return plane.getWingspan();
    }

    public float getLength() {
        return plane.getLength();
    }

    public float getHeight() {
        return plane.getHeight();
    }

    public float getFlyRange() {
        return plane.getFlyRange();
    }

    public float getTankeSize() {
        return plane.getTankeSize();
    }

    public PlaneWrapper(Plane plane) {
        this.plane = plane;
    }


}
