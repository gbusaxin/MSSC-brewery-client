package com.example.msscbreweryclient.web.client;

import com.example.msscbreweryclient.web.model.BeerDto;
import com.example.msscbreweryclient.web.model.CustomerDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.URI;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @created : by GBu on 26. 10. 2022, streda
 * @mailto : grigorii.busakhin@software-foundation.sk
 **/
@SpringBootTest
class BreweryClientTest {

    @Autowired
    BreweryClient client;

    @Test
    void getBeerById() {
        BeerDto dto = client.getBeerById(UUID.randomUUID());
        assertNotNull(dto);
    }

    @Test
    void saveNewBeer(){
        BeerDto beerDto = BeerDto.builder().beerName("Doog").build();

        URI uri = client.saveNewBeer(beerDto);

        assertNotNull(uri);

        System.out.println(uri);
    }

    @Test
    void updateBeer(){
        //given
        BeerDto beerDto = BeerDto.builder().beerName("update beer").build();

        client.updateBeer(UUID.randomUUID(), beerDto);
    }

    @Test
    void deleteBeer(){
        client.deleteBeer(UUID.randomUUID());
    }

    @Test
    void saveNewCustomer(){
        //given
        CustomerDto customerDto = CustomerDto.builder().name("Joe").build();
        URI uri = client.saveNewCustomer(customerDto);
        assertNotNull(uri);
        System.out.println(uri);
    }

    @Test
    void getCustomerById(){
        CustomerDto customerDto = client.getCustomerById(UUID.randomUUID());
        assertNotNull(customerDto);
    }

    @Test
    void updateCustomer(){
        CustomerDto customerDto = CustomerDto.builder().name("Joe").build();
        client.updateCustomer(customerDto);
    }

    @Test
    void deleteCustomer(){
        client.deleteCustomer(UUID.randomUUID());
    }
}