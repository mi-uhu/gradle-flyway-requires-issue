package org.gradle.sample.app;

import org.flywaydb.core.Flyway;

public class Main {

    public static void main(String[] args) {
        Flyway flyway = Flyway.configure()
                .envVars()
                .locations("org/gradle/sample/app")
                .load();

        flyway.migrate();
    }
}
