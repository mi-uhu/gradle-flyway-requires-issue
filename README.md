The successful action for flyway is the error: Unable to connect to the database.

To reproduce the issue, remove the following from app module-info:

```
requires java.sql;
requires com.google.gson;
requires com.fasterxml.jackson.databind;
```

Then we get class not found errors.
This should not happen as flyway is an automatic module.