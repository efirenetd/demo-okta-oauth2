package org.efire.net.demooktaoauth2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Resources {

    @GetMapping
    public String index() {
        return "THis is pretty";
    }
}
