/*
 * MegaMek - Copyright (C) 2004, 2005 Ben Mazur (bmazur@sev.org)
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the Free
 * Software Foundation; either version 2 of the License, or (at your option)
 * any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 * for more details.
 */
package megamek.common.weapons.lasers;

/**
 * @author Andrew Hunter
 * @since Sep 12, 2004
 */
public class ISLaserLarge extends LaserWeapon {
    private static final long serialVersionUID = 7184746139915905374L;

    public ISLaserLarge() {
        super();
        this.name = "Large Laser";
        this.setInternalName(this.name);
        this.addLookupName("IS Large Laser");
        this.addLookupName("ISLargeLaser");
        this.heat = 8;
        this.damage = 8;
        this.shortRange = 5;
        this.mediumRange = 10;
        this.longRange = 15;
        this.extremeRange = 20;
        this.waterShortRange = 3;
        this.waterMediumRange = 6;
        this.waterLongRange = 9;
        this.waterExtremeRange = 12;
        this.tonnage = 5.0;
        this.criticals = 2;
        this.bv = 123;
        this.cost = 100000;
        this.shortAV = 8;
        this.medAV = 8;
        this.maxRange = RANGE_MED;
        rulesRefs = "227, TM";
        techAdvancement.setTechBase(TECH_BASE_ALL)
                .setIntroLevel(true)
                .setUnofficial(false)
                .setTechRating(RATING_C)
                .setAvailability(RATING_B, RATING_D, RATING_C, RATING_B)
                .setISAdvancement(2306, 2316, 2320, DATE_NONE, DATE_NONE)
                .setISApproximate(false, false, false, false, false)
                .setClanAdvancement(2306, 2316, 2320, 2850, DATE_NONE)
                .setClanApproximate(false, false, false, true, false)
                .setPrototypeFactions(F_TA)
                .setProductionFactions(F_TH);
    }
}
