package com.csis3275.models_aab_08;

/**
 * Each team member has to implement this interface.
 */
public interface TeamMember_aab_08 {

    /**
     * Team member name.
     * @return Team member name
     */
    String name();

    /**
     * Team member description.
     * @return Description
     */
    String description();

    /**
     * Name of selfi image file as it appears in images folder.
     * Ex: almas.png
     * @return Salfi image name
     */
    String selfiImageName();
}
