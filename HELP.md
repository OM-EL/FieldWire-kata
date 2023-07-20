

Here are the step-by-step instructions to get the application running on your local machine, including setting up AWS:

1. **Java Development Kit (JDK)**:
    - Open your terminal and check for a preinstalled Java by running the following command:

        ```bash
        java -version
        ```

    - If JDK 17 isn't installed, you can install it. 
        - On Ubuntu-based distributions, use the following commands:

            ```bash
            sudo apt update
            sudo apt install openjdk-17-jdk
            ```

        - On macOS, use Homebrew:

            ```bash
            brew install openjdk@17
            ```

2. **Apache Maven**:
    - Check for preinstalled Maven:

        ```bash
        mvn -version
        ```

    - If a suitable version isn't installed, you can install it.
        - On Ubuntu-based distributions:

            ```bash
            sudo apt update
            sudo apt install maven
            ```

        - On macOS:

            ```bash
            brew install maven
            ```

3. **Start your local PostgreSQL Database with Docker**:
    - Run the following command in your terminal to start a PostgreSQL container:

        ```bash
        docker run --name DB -p 5455:5432 -e POSTGRES_USER=postgresUser -e POSTGRES_PASSWORD=postgresPW -e POSTGRES_DB=postgresDB -d postgres
        ```

    - This will start a PostgreSQL database with the name `DB`, listening on port `5455`, with the username `postgresUser`, the password `postgresPW`, and a database named `postgresDB`.

4. **Verify that your PostgreSQL Database is running**:

    ```bash
    docker ps
    ```

    - This command lists all the running Docker containers. Ensure that your `DB` container is running and the status is `Up`.

5. **AWS Configuration**:
    - Install the AWS CLI. On Ubuntu, you can use the following command:

        ```bash
        sudo apt install awscli
        ```

      And on macOS:

        ```bash
        brew install awscli
        ```

    - Configure your AWS credentials by running:

        ```bash
        aws configure
        ```
        Access key : AKIASOO5UORSEISAGEXG

        Secret access key : QyUpPTxDj43qoUPKNLOlpWO2im4iVOeEknUXjEpt




      When prompted, enter your AWS Access Key ID, Secret Access Key, default region name (e.g., `us-west-2`), and default output format (e.g., `json`).

6. **Navigate to your project directory**:
    - Now, you need to navigate to the directory where your `pom.xml` file is located. You can use the `cd` command to change directories:

        ```bash
        cd /path/to/your/project
        ```

    - Replace `/path/to/your/project` with the actual path to your project.

7. **Start your Spring Boot application**:
    - Use Maven to compile and run the application. Run this command in your terminal:

        ```bash
        mvn spring-boot:run
        ```

    - This command will start your Spring Boot application. Depending on the configuration, you should be able to access it at `localhost:8080` or whatever port you specified in your application properties.

Please follow these instructions, and let me know if you encounter any issues. Remember to ensure that Docker is running before starting your database, and make sure your database configuration in the Spring Boot application matches the details of the database container you started.

