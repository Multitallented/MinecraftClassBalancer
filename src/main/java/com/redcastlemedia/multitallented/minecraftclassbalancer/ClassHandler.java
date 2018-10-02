package com.redcastlemedia.multitallented.minecraftclassbalancer;

import com.redcastlemedia.multitallented.minecraftclassbalancer.entities.CombatClass;
import org.springframework.stereotype.Component;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

@Component
public class ClassHandler {
    private final HashMap<String, CombatClass> classMap = new HashMap<>();

    public void loadAllClasses() {
        File folder = new File("classes");
        if (!folder.exists()) {
            return;
        }
        try {
            for (File classFile : folder.listFiles()) {
                Yaml yaml = new Yaml();
                InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(classFile.getName());
                Map<String, Object> classObject = yaml.load(inputStream);
                CombatClass combatClass = convertClassObject(classObject);
            }
        } catch (NullPointerException npe) {
            return;
        }
    }

    CombatClass convertClassObject(Map<String, Object> classObject) {
        CombatClass combatClass = new CombatClass();
        return combatClass;
    }
}
