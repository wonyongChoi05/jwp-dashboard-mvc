package webmvc.org.springframework.web.servlet.mvc.asis;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.util.Objects;

public class ForwardController implements CustomController {

    private final String path;

    public ForwardController(final String path) {
        this.path = Objects.requireNonNull(path);
    }

    @Override
    public String execute(final HttpServletRequest request, final HttpServletResponse response) {
        return path;
    }
}
