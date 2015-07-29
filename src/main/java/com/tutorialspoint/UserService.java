package com.tutorialspoint;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/UserService")
public class UserService {

    UserDao userDao = new UserDao();

    @GET
    @Path("/users")
    @Produces(MediaType.APPLICATION_XML)
    public List<User> getUsers(){
        return userDao.getAllUsers();
    }

    @GET
    @Path("/getName")
    @Produces("text/plain")
    public Response getName(){
        return Response.ok("Ok").build();
    }

    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        System.out.println(userDao.getAllUsers().get(0).getName());
    }
}