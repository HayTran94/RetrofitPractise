package com.haytran.learnretrofit;


import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.CountDownLatch;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RetrofitTest {

    APIInterface apiInterface;
    CountDownLatch countDownLatch;

    @Before
    public void setUpBase() {
        countDownLatch = new CountDownLatch(1);
    }


    @Before
    public void setUp(){
        apiInterface = APIClient.getClient().create(APIInterface.class);
    }

    @Test
    public void getMultipleResource() {
        Call<MultipleResource> call = apiInterface.doGetListResources();
        call.enqueue(new Callback<MultipleResource>() {
            @Override
            public void onResponse(Call<MultipleResource> call, Response<MultipleResource> response) {
                MultipleResource multipleResource = response.body();
                System.out.println("Response code = " + response.code());
                System.out.println("Response body = " + multipleResource);
                countDownLatch.countDown();
            }

            @Override
            public void onFailure(Call<MultipleResource> call, Throwable t) {
                call.cancel();
                countDownLatch.countDown();
            }
        });

        try {
            countDownLatch.await();
        } catch (Exception e) {

        }
    }

    @Test
    public void createUser() {
        User2 user2 = new User2("hay", "IT");

        Call<User2> call = apiInterface.createUser(user2);
        call.enqueue(new Callback<User2>() {
            @Override
            public void onResponse(Call<User2> call, Response<User2> response) {
                User2 responseUser2 = response.body();
                System.out.println("Response code = " + response.code());
                System.out.println("Response body = " + responseUser2);
                countDownLatch.countDown();
            }

            @Override
            public void onFailure(Call<User2> call, Throwable t) {
                call.cancel();
                countDownLatch.countDown();
            }
        });

        try {
            countDownLatch.await();
        } catch (Exception e) {

        }
    }

    @Test
    public void getUserList() {
        Call<UserList> call = apiInterface.doGetUserList("2");
        call.enqueue(new Callback<UserList>() {
            @Override
            public void onResponse(Call<UserList> call, Response<UserList> response) {
                UserList responseUserList = response.body();
                System.out.println("Response code = " + response.code());
                System.out.println("Response body = " + responseUserList);
                countDownLatch.countDown();
            }

            @Override
            public void onFailure(Call<UserList> call, Throwable t) {
                call.cancel();
                countDownLatch.countDown();
            }
        });

        try {
            countDownLatch.await();
        } catch (Exception e) {

        }
    }

    @Test
    public void getUser() {
        Call<User1> call = apiInterface.getUser(2);
        call.enqueue(new Callback<User1>() {
            @Override
            public void onResponse(Call<User1> call, Response<User1> response) {
                User1 responseUser1 = response.body();
                System.out.println("Response code = " + response.code());
                System.out.println("Response body = " + responseUser1);
                countDownLatch.countDown();
            }

            @Override
            public void onFailure(Call<User1> call, Throwable t) {
                call.cancel();
                countDownLatch.countDown();
            }
        });

        try {
            countDownLatch.await();
        } catch (Exception e) {

        }
    }
}
