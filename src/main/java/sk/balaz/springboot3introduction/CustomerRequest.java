package sk.balaz.springboot3introduction;

public record CustomerRequest(
        String name,
        String email,
        Integer age
) { }
