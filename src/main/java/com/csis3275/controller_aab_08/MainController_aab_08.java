package com.csis3275.controller_aab_08;

import com.csis3275.models_aab_08.TeamMember;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Main controller.
 */
@Controller
@RequestMapping("/")
public final class MainController_aab_08 {

    /**
     * List of members.
     */
    @Autowired
    private List<TeamMember> members;

    @GetMapping
    public String mainView(final Model model) {
        model.addAttribute("members", this.members);
        return "main_aab_08";
    }
}
