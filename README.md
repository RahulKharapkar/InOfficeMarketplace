---

# InOffice Marketplace

## Overview
InOffice Marketplace is an in-house platform designed for employees to offer or seek various items and services. Whether you're looking to sell a phone, find a paying guest accommodation, or offer a service, this marketplace facilitates employee interactions and transactions.

## Features
- **Item Listings**: Post items you want to sell or services you offer.
- **Request Listings**: Seek specific items or services from other employees.
- **Categories**: Organize listings into different categories for easy navigation.
- **Search Functionality**: Quickly find what you're looking for with the search feature.
- **Swagger API Documentation**: Easily explore and test the API endpoints.

## Installation
### Prerequisites
- Java 11 or higher
- Maven
- MySQL Database

### Steps
1. Clone the repository:
    ```bash
    git clone https://github.com/RahulKharapkar/InOfficeMarketplace.git
    ```
2. Navigate to the project directory:
    ```bash
    cd InOfficeMarketplace
    ```
3. Configure the MySQL database:
    - Create a new MySQL database.
    - Update the `application.properties` file located in `src/main/resources` with your database details:
      ```properties
      spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
      spring.datasource.username=your_username
      spring.datasource.password=your_password
      ```
4. Build the project:
    ```bash
    mvn clean install
    ```
5. Run the application:
    ```bash
    mvn spring-boot:run
    ```

## Usage
- **Home Page**: Browse all available listings.
- **Post New Listing**: Create a new listing by providing details about the item or service.
- **Search Listings**: Use the search bar to find specific items or services.
- **API Documentation**: Access the Swagger UI for API documentation at `http://localhost:8080/swagger-ui.html`.

## Contributing
Contributions are welcome! Please fork the repository and create a pull request with your changes.

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contact
For any queries or suggestions, please contact Rahul Kharapkar at [rahul.p.kharapkar@gmail.com](mailto:rahul.p.kharapkar@gmail.com).

---
