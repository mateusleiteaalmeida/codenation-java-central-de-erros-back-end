package com.project.centralDeErros.controllers.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String resourceName) {
        super("Resource: " + resourceName + " not found");
    }
}