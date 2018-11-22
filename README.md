# Geocode Test Assignment

## Overview
This project aims to expose a spring integration based rest API. This rest API receives
an address as a single string and sends this string to an activemq endpoint (queue). Since
the message arrives in the activemq queue a camel route captures the receiving message and
call the google maps geocoding api. The returned xml is marshalled into a pojo containing
the formatted address and its location (latitude and longitute).

## How to Run

Before running the project, we need to have an ActiveMQ instance up and running:

1. Download ActiveMQ <http://activemq.apache.org/activemq-5157-release.html>
2. Unzip and run `activemq start` in the `bin` folder. (Port 61616 will be used)

Run the source code.

1. Simply run `./mvnw spring-boot:run -Dgoogle_api_key={{YOUR_GOOGLE_API_KEY}}` under the root folder (Port 8080 will be used).
2. Test the application: GET <localhost:8080/api/geocode?address=New York, NY>
