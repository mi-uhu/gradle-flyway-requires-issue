module org.gradle.sample.app {
    // This is supposed to be required.
    requires org.flywaydb.core;

    // Why do I need to require those below? Only flyway uses these.
    requires java.sql;
    requires com.google.gson;
    requires com.fasterxml.jackson.databind;
}