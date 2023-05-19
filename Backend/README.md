# Documentation

## Running the Program
Run with `gradle bootRun`

Use `curl http://localhost:8080/demo` followed by any mapping commands.

### Commands
`http://localhost:8080/demo/add`: Adds 1 user with `-d name=? -d email=?`

`http://localhost:8080/demo/getAll` Gets all users, no input necessary

`http://localhost:8080/demo/getUser` Gets 1 user with `-d id=?`

`http://localhost:8080/demo/update` Replaces information with input, with `-d id=? -d name=? -d email=?`

`http://localhost:8080/demo/delete` Deletes 1 user with `-d id=?`

## SQL User info
User: Matthew

Password: password

Database: db_example


