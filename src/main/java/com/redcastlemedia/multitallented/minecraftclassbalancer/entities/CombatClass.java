package com.redcastlemedia.multitallented.minecraftclassbalancer.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class CombatClass {
    private double weaponArmor = 0;
    private double rangedArmor = 0;
    private double spellArmor = 0;
    private double meleeAttackSpeed = 15;
    private double meleeDamage = 0;
    private double rangedDamage = 0;
    private double health = 300;
    private List<Spell> spellList1 = new ArrayList<>();
    private List<Spell> spellList2 = new ArrayList<>();
    private List<Spell> spellList3 = new ArrayList<>();
    private List<Spell> spellList4 = new ArrayList<>();
    private List<Spell> spellList5 = new ArrayList<>();
}
