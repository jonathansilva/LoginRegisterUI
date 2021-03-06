package app.project.loginregister.service;

import app.project.loginregister.model.User;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface UserService {

    @POST("user")
    Call<User> create(@Body User user);
}
