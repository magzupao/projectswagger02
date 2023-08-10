package io.swagger.api;

import io.swagger.model.Body;
import io.swagger.model.Body1;

import java.util.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeesApiControllerIntegrationTest {

    @Autowired
    private EmployeesApi api;

    @Test
    public void employeesEmployeeIdDeleteTest() throws Exception {
        String employeeId = "employeeId_example";
        ResponseEntity<Void> responseEntity = api.employeesEmployeeIdDelete(employeeId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void employeesEmployeeIdGetTest() throws Exception {
        String employeeId = "employeeId_example";
        ResponseEntity<Void> responseEntity = api.employeesEmployeeIdGet(employeeId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void employeesEmployeeIdPutTest() throws Exception {
        Body1 body = new Body1();
        String employeeId = "employeeId_example";
        ResponseEntity<Void> responseEntity = api.employeesEmployeeIdPut(body, employeeId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void employeesGetTest() throws Exception {
        ResponseEntity<Void> responseEntity = api.employeesGet();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void employeesPostTest() throws Exception {
        Body body = new Body();
        ResponseEntity<Void> responseEntity = api.employeesPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
