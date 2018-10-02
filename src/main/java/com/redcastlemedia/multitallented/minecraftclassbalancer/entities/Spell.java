package com.redcastlemedia.multitallented.minecraftclassbalancer.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Spell {
    private String name = "default";
    private double cooldown = -1;
    private double damage = 0;
    private double channel = 0;
    private double utility = 0;
    private double heal = 0;
    private double range = -1;
    private double mobility = 0;
    private double immobility = 0;
    private double hexproof = 0;
    private double damageproof = 0;
    private DamageType damageType = DamageType.SPELL;
    private int priority = -1;
}
