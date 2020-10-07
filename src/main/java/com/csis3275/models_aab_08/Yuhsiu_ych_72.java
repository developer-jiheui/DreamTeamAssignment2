package com.csis3275.models_aab_08;

import org.springframework.stereotype.Component;

/**
 * Team member almas.
 * This is the template for our next task to add
 * model class for each team member.
 * Don't forget to add @{@link Component} annotation on your class
 */
@Component
public final class Yuhsiu_ych_72 implements TeamMember {

    @Override
    public String name() {
        return "Yuhsiu(Anita)";
    }

    @Override
    public String description() {
        return "Java developer";
    }

    @Override
    public String selfiImageName() {
        return "Anita.jpg";
    }
}
