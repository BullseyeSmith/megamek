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
package megamek.common.weapons.autocannons;

/**
 * @author Andrew Hunter
 * @since Oct 15, 2004
 */
public class ISLB2XAC extends LBXACWeapon {
    private static final long serialVersionUID = -8906248294693269096L;

    public ISLB2XAC() {
        super();
        this.name = "LB 2-X AC";
        this.setInternalName("ISLBXAC2");
        this.addLookupName("IS LB 2-X AC");
        this.heat = 1;
        this.damage = 2;
        this.rackSize = 2;
        this.minimumRange = 4;
        this.shortRange = 9;
        this.mediumRange = 18;
        this.longRange = 27;
        this.extremeRange = 36;
        this.tonnage = 6.0;
        this.criticals = 4;
        this.bv = 42;
        this.cost = 150000;
        this.shortAV = 2;
        this.medAV = 2;
        this.longAV = 2;
        this.extAV = 2;
        this.maxRange = RANGE_EXT;
        rulesRefs = "207,TM";
        techAdvancement.setTechBase(TECH_BASE_IS)
                .setIntroLevel(false)
                .setUnofficial(false)
                .setTechRating(RATING_E)
                .setAvailability(RATING_X, RATING_X, RATING_E, RATING_D)
                .setISAdvancement(3055, 3058, 3060, DATE_NONE, DATE_NONE)
                .setISApproximate(true, false, false, false, false)
                .setPrototypeFactions(F_FS)
                .setProductionFactions(F_FS);
    }
}
