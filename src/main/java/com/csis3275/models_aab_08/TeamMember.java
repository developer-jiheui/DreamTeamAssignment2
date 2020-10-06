package com.csis3275.models_aab_08;

/**
 * Each team member has to implement this interface.
 */
public interface TeamMember {

    /**
     * Team member name.
     */
    String name();

    /**
     * Team member description.
     */
    String description();

    /**
     * Name of selfi image file as it appears in images folder.
     * Ex: almas.png
     */
    String selfiImageName();
}
