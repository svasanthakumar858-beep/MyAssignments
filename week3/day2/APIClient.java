package week3.day2;

public class APIClient {
	 // Overloaded method 1: Only endpoint
    public void sendRequest(String endpoint) {
        System.out.println("Sending request to endpoint: " + endpoint);
    }

    // Overloaded method 2: endpoint, requestBody, requestStatus
    public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
        System.out.println("Sending request to endpoint: " + endpoint);
        System.out.println("Request body: " + requestBody);
        if (requestStatus) {
            System.out.println("Request sent successfully!");
        } else {
            System.out.println("Request failed.");
        }
    }

    public static void main(String[] args) {
        // Create object of APIClient
        APIClient client = new APIClient();

        // Call the first version of sendRequest
        client.sendRequest("https://api.example.com/data");

        System.out.println("------------");

        // Call the second version of sendRequest
        client.sendRequest("https://api.example.com/data", "{ \"id\": 123 }", true);
    }

}
