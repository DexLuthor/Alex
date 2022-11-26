package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Injectable {
    @Autowired
    private Injectee injectee;
}
