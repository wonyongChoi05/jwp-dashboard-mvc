package com.techcourse.controller.mvc;

import com.techcourse.domain.User;
import jakarta.servlet.http.HttpSession;

import java.util.Optional;

public class MvcUserSession {

    public static final String SESSION_KEY = "user";

    public static Optional<User> getUserFrom(final HttpSession session) {
        final var user = (User) session.getAttribute(SESSION_KEY);
        return Optional.ofNullable(user);
    }

    public static boolean isLoggedIn(final HttpSession session) {
        return getUserFrom(session).isPresent();
    }

    private MvcUserSession() {}
}
