package az.com.cybernet.integ.integsms.web.rest;

import az.com.cybernet.integ.integsms.config.InfoConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequiredArgsConstructor
@RequestMapping("/info")
public class InfoController {

    private final InfoConfig mainConfig;

    @GetMapping("/")
    public ResponseEntity<?> main() {
        Map<String, String> result = new HashMap<>();
        result.put("name", mainConfig.appName);
        result.put("profile", mainConfig.appProfile);
        result.put("commitAbbrev", mainConfig.commitAbbrev);
        result.put("commitId", mainConfig.commitId);
        return ResponseEntity.ok(result);
    }

}
