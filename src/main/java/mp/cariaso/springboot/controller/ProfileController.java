package mp.cariaso.springboot.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profiles")
public class ProfileController {

    @Autowired
    private Environment environment;

    @RequestMapping(path = "/active", method = {RequestMethod.GET})
    public ResponseEntity<?> getActiveProfile(HttpServletRequest request) {

        ResponseEntity<String> response;

        String responseBody = String.format("Spring Active Profile: %s", environment.getActiveProfiles());

        response = new ResponseEntity<String>(responseBody, HttpStatus.OK);

        return response;
    }
}
