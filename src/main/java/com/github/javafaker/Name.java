package com.github.javafaker;

import com.github.javafaker.service.FakeValuesServiceInterface;

public class Name {
    private final Resolver resolver;
    private final FakeValuesServiceInterface fakeValuesService;

    public Name(Resolver resolver, FakeValuesServiceInterface fakeValuesService) {
        this.resolver = resolver;
        this.fakeValuesService = fakeValuesService;
    }

    public String name() {
        return fakeValuesService.resolve("name.name", this, resolver);
    }

    public String fullName() {
        return name();
    }

    public String firstName() {
        return fakeValuesService.fetchString("name.first_name");
    }

    public String lastName() {
        return fakeValuesService.fetchString("name.last_name");
    }

    public String prefix() {
        return fakeValuesService.fetchString("name.prefix");
    }

    public String suffix() {
        return fakeValuesService.fetchString("name.suffix");
    }
}
