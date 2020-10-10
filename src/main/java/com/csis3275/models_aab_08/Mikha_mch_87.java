package com.csis3275.models_aab_08;

import org.springframework.stereotype.Component;

/**
 * Team member Mikhail.
 */
@Component
public final class Mikha_mch_87 implements TeamMember_aab_08 {

    @Override
    public String name() {
        return "Mikhail";
    }

    @Override
    public String description() {
        return "Java developer";
    }

    @Override
    public String selfiImageName() {
        return "Misha.jpg";
    }
}
