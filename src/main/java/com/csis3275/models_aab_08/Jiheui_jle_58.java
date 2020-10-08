package com.csis3275.models_aab_08;

import org.springframework.stereotype.Component;
/**
 * Team member Jiheui Lee.
 */
@Component
public class Jiheui_jle_58 implements TeamMember_aab_08 {
	
    @Override
    public String name() {
        return "Jiheui";
    }

    @Override
    public String description() {
        return "Douglas student";
    }

    @Override
    public String selfiImageName() {
        return "Jiheui.jpg";
    }
}
