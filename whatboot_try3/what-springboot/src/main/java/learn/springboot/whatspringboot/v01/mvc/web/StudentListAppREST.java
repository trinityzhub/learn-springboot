package learn.springboot.whatspringboot.v01.mvc.web;

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import learn.springboot.whatspringboot.v01.mvc.entity.Student;
import learn.springboot.whatspringboot.v01.mvc.service.StudentController;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.List;


// StudentListAppV3   REST
public class StudentListAppREST {
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(7171), 0);
        server.createContext("/students", new StudentsHandler());
        server.setExecutor(null); // creates a default executor
        server.start();
    }

    static class StudentsHandler implements HttpHandler {
        private StudentController studentController = new StudentController();

        @Override
        public void handle(HttpExchange exchange) throws IOException {
            if ("GET".equals(exchange.getRequestMethod())) {
                List<Student> students = studentController.getAllStudents();
                String response = students.toString(); // Convert list to JSON or XML

                exchange.sendResponseHeaders(200, response.length());
                OutputStream os = exchange.getResponseBody();
                os.write(response.getBytes());
                os.close();
            }
        }
    }
}
